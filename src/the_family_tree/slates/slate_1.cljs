(ns the-family-tree.slates.slate-1
  (:require-macros [the-family-tree.utils.macros :refer [slate]])
  (:require [om-tools.core :refer-macros [defcomponent]]
            [om-tools.dom :as dom :include-macros true]
            [the-family-tree.utils.data :as data]
            [om.core :as om]
            [cljsjs.d3 :as d3]))

(def origin
  "The central point of the graph."
  {:x 500 :y 500})

(def radial-scale
  (-> js/d3
      .-scale
      .linear
      (.domain #js [1850 2020])
      (.range #js [0 460])))

(def hard-colour-scale
  (-> js/d3
      .-scale
      .ordinal
      (.domain (clj->js (map :family data/colour-scheme)))
      (.range (clj->js (map :hard-colour data/colour-scheme)))))

(def soft-colour-scale
  (-> js/d3
      .-scale
      .ordinal
      (.domain (clj->js (map :family data/colour-scheme)))
      (.range (clj->js (map :soft-colour data/colour-scheme)))))

(def force-field
  "Holds a configured instance of d3's force directed graph,
   ensuring that link distances are greater for partnerships."
  (-> js/d3
      .-layout
      .force
      (.charge -400)
      (.linkDistance #(case (.-type %) "partner" 60 "child" 30))
      (.gravity 0)
      (.size #js [1000 1000])))

(defn get-canvas [] (.select js/d3 "#slate-1 #canvas"))

(defn enterfy
  "Selects entities and enters data on them."
  [selector data]
  (-> (get-canvas)
      (.selectAll selector)
      (.data data)
      .enter))

(defn attribufy
  "Takes an entity and a map of attributes, applies those
   attributes to the entity. Super simple stuff."
  [entity attributes]
  (doseq [[k v] attributes] (.attr entity (name k) v))
  entity)

(defn stylify
  "Takes an entity and a map of styles, applies those
   styles to the entity. Super simple stuff."
  [entity styles]
  (doseq [[k v] styles] (.style entity (name k) v))
  entity)

(defn translate
  "Generates the translation string
   used by the transform attribute."
  [x y]
  (str "translate(" x "," y ")"))

(defn draw-links
  "Draws the links that represent the relations between family members."
  [relations]
  (-> (enterfy ".link" relations)
      (.append "line")
      (attribufy {:class "link"})
      (stylify {:stroke           #(hard-colour-scale (.-family %))
                :stroke-width     #(case (.-type %) "partner" 4 "child" 2)
                :stroke-dasharray #(when (= "partner" (.-type %)) "3 3")})))

(defn draw-nodes
  "Draws the nodes that represent members of the family."
  [members]
  (-> (enterfy ".node" members)
      (.append "circle")
      (.call (.-drag force-field))
      (attribufy {:class "node" :r 5})
      (stylify {:fill #(hard-colour-scale (.-family %))})))

(defn setup-tooltip
  "Sets up the tooltip text such that when you hover
   over a node you see the name of the family member."
  [nodes]
  (-> nodes
      (.append "title")
      (.text #(str (.-name %) " " (.-family %)))))

(defn draw-axis
  "Draws the axis as labeled ticks extending outward from the
   origin, with circular guides extending from each tick."
  []
  (let [ticks #js [1860 1880 1900 1920 1940 1960 1980 2000 2020]
        radial-axis (-> js/d3
                        .-svg
                        .axis
                        (.scale radial-scale)
                        (.tickValues ticks)
                        (.tickFormat (.format js/d3 "d")))]
    (-> (.append (get-canvas) "g")
        (.call radial-axis)
        (attribufy {:class     "axis"
                    :transform (translate (:x origin) (- (:y origin) 15))}))
    (-> (enterfy ".guide" ticks)
        (.append "circle")
        (attribufy {:class "guide"
                    :cx    (:x origin)
                    :cy    (:y origin)
                    :r     #(radial-scale %)}))))

(defn constrain-radially
  "Takes the member's position and updates it such that it
   is constrained to a ring where the radius is defined by
   the member's birth year, and centered according to origin."
  [member _]
  (let [vx  (- (.-x member) (:x origin))
        vy  (- (.-y member) (:y origin))
        |v| (.sqrt js/Math (+ (* vx vx) (* vy vy)))
        x   (+ (:x origin) (* (radial-scale (.-birth member)) (/ vx |v|)))
        y   (+ (:y origin) (* (radial-scale (.-birth member)) (/ vy |v|)))]
    (when-not (zero? |v|)
      (set! (.-x member) x)
      (set! (.-y member) y))))

(defn exert-force
  "Assigns members to the force directed graph's nodes, and relations to
   the force directed graph's links. Starts the simulation, which will
   calculate positions for each member upon each tick, and assigns those
   values to the member's x and y attributes. Then, after each tick, the
   member's x and y attributes are constrained radially, and the positions
   of the node/link entities are updated accordingly."
  [members relations nodes links]
  (-> force-field
      (.nodes members)
      (.links relations)
      .start
      (.on "tick"
        (fn []
          (.forEach members constrain-radially)
          (attribufy links {:x1 (fn [d] (.. d -source -x))
                            :y1 (fn [d] (.. d -source -y))
                            :x2 (fn [d] (.. d -target -x))
                            :y2 (fn [d] (.. d -target -y))})
          (attribufy nodes {:cx (fn [d] (.-x d))
                            :cy (fn [d] (.-y d))})))))

(defn draw-colour-key
  [nodes links]
  (let [truncated-domain (-> hard-colour-scale .domain (.slice 0 24))]
    (-> (enterfy ".sample" truncated-domain)
        (.append "circle")
        (attribufy {:class "sample"
                    :cx    1170
                    :cy    (fn [_ i] (+ 200 (* 25 i)))
                    :r     5})
        (stylify {:fill #(hard-colour-scale %)}))
    (-> (enterfy ".label" truncated-domain)
        (.append "text")
        (.text #(identity %))
        (attribufy {:class "label" :x 1190 :y (fn [_ i] (+ 205 (* 25 i)))})
        (.on "mouseover"
             (fn [d]
               (.style nodes "fill" #(let [f (.-family %)] (if (= f d) (hard-colour-scale f) (soft-colour-scale f))))
               (.style links "stroke" #(let [f (.-family %)] (if (= f d) (hard-colour-scale f) (soft-colour-scale f))))))
        (.on "mouseleave"
             (fn []
               (.style nodes "fill" #(hard-colour-scale (.-family %)))
               (.style links "stroke" #(hard-colour-scale (.-family %))))))))

(defcomponent slate-1
  [state owner]
  (did-mount
    [_]
    (let [members   (clj->js data/members)
          relations (clj->js data/relations)
          links     (draw-links relations)
          nodes     (draw-nodes members)]
      (setup-tooltip nodes)
      (draw-axis)
      (draw-colour-key nodes links)
      (exert-force members relations nodes links)))
  (render-state
    [_ _]
    (println "Rendering slate-1 component with state:" state)
    (slate :slate-1
      (dom/svg
        {:id "canvas"}))))

;; TODO
;; 1) Try declaring nodes beforehand, then draw them up. [done]
;; 2) Tighten up the colour key, such that flashing doesn't occur, perhaps use groupings.
;; 3) Can you highlight the key name as you hover to give it an adequate response?
;; 4) Treat scale derived data as true data or auxiliary data? [done]
;; 5) How do you deal with colour scales properly? [done]
;; 6) Other families should work as well. [done]
;; 7) Small fix ups with text colouring. [done]
;; 8) Object key section.
