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

(def families (clj->js (map :family data/colour-scheme)))
(def blood-families (.slice families 0 24))
(def hard-colours (clj->js (map :hard-colour data/colour-scheme)))
(def soft-colours (clj->js (map :soft-colour data/colour-scheme)))

(def radial-scale
  "Defines the scale used to map
   years to the circle radius."
  (-> js/d3
      .-scale
      .linear
      (.domain #js [1850 2020])
      (.range #js [0 460])))

(def key-scale
  "Defines the scale used to position the
   colour key elements in the legend."
  (-> js/d3
      .-scale
      .ordinal
      (.domain blood-families)
      (.rangeRoundBands #js [200 800])))

(def hard-colour-scale
  "Defines the scale used to map
   a family to a hard colour."
  (-> js/d3
      .-scale
      .ordinal
      (.domain families)
      (.range hard-colours)))

(def soft-colour-scale
  "Defines the scale used to map
   a family to a soft colour."
  (-> js/d3
      .-scale
      .ordinal
      (.domain families)
      (.range soft-colours)))

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
      (attribufy {:class "node"})
      (stylify {:fill #(hard-colour-scale (.-family %))})))







(defn setup-tooltip
  [nodes]
  (.on nodes "mouseover"
    (fn [node]
      (let [tool-tip (-> (enterfy ".tool-tip" #js [node])
                         (.append "g")
                         (attribufy {:class "tool-tip"
                                     :pointer-events "none"
                                     :transform #(translate (.-x %) (.-y %))}))

            point    (-> tool-tip
                         (.append "polygon")
                         (attribufy {:points "0,-4 -8,-14 8,-14"
                                     :fill #(hard-colour-scale (.-family %))}))
            pane    (-> tool-tip
                           (.append "rect")
                           (attribufy {:class "label"
                                       :fill #(hard-colour-scale (.-family %))
                                       :stroke #(hard-colour-scale (.-family %))
                                       :stroke-width 20
                                       }))


            label (-> tool-tip
                      (.append "text")
                      (.text #(str (.-name %) " " (.-family %)))
                      (attribufy {:text-anchor "middle" :y -25
                                  :fill "#FFF"}))

            size  (-> label .node .getBBox .-width)]
  (-> pane (attribufy {:x (- (/ size 2))
                          :y -38.5
                          :height 15
                          :width size})))))


  (.on nodes "mouseleave"
    (fn [_]
      (-> (get-canvas)
          (.selectAll ".tool-tip")
          .remove)))
  (.on nodes "mouseup"
    (fn [_]
      (-> (get-canvas)
          (.selectAll ".tool-tip")
          .remove))))





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
        r   (radial-scale (aget member "birth"))
        x   (+ (:x origin) (* r (/ vx |v|)))
        y   (+ (:y origin) (* r (/ vy |v|)))]
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
  (let [colour-keys (-> (enterfy ".colour-key" blood-families)
                        (.append "g")
                        (attribufy {:class "colour-key"
                                    :transform #(translate 1110 (key-scale %))}))
        samples     (-> colour-keys
                        (.append "circle")
                        (attribufy {:class "sample" :cx 13 :cy 13 :r 5})
                        (stylify {:fill #(hard-colour-scale %)}))
        labels      (-> colour-keys
                        (.append "text")
                        (.text #(identity %))
                        (attribufy {:class "label" :x 27 :y 18}))
        tiles       (-> colour-keys
                        (.append "rect")
                        (attribufy {:class "tile"
                                    :width 110
                                    :height #(.rangeBand key-scale)}))]
    (.on tiles "mouseover"
      (fn [d]
        (stylify samples {:fill #(if (= % d) (hard-colour-scale %) (soft-colour-scale %))})
        (stylify labels {:opacity #(if (= % d) 1 0.3)})
        (stylify nodes {:fill #(let [f (.-family %)] (if (= f d) (hard-colour-scale f) (soft-colour-scale f)))})
        (stylify links {:stroke #(let [f (.-family %)] (if (= f d) (hard-colour-scale f) (soft-colour-scale f)))})))
    (.on tiles "mouseleave"
      (fn []
        (stylify samples {:fill #(hard-colour-scale %)})
        (stylify labels {:opacity 1})
        (stylify nodes {:fill #(hard-colour-scale (.-family %))})
        (stylify links {:stroke #(hard-colour-scale (.-family %))})))))

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
