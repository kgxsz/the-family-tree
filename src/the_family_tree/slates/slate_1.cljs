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

(def hard-colours
  "These colours are used to
   distinguish families."
  {"Patay"      "#FF4A46"
   "Maria"      "#9B9700"
   "Bonin"      "#006FA6"
   "Calatraba"  "#E20027"
   "Barrière"   "#B79762"
   "Wolff"      "#D25B88"
   "Rodier"     "#953F00"
   "Gaillet"    "#7A7BFF"
   "Pourtier"   "#FFA0F2"
   "Le Blanc"   "#8CC63F"
   "Cheilan"    "#0CBD66"
   "Perrin"     "#012C58"
   "Faivre"     "#F4D749"
   "Morin"      "#2DBCF0"
   "Bonnet"     "#FAA61A"
   "Giraud"     "#958A9F"
   "Suzukawa"   "#008080"
   "Troncy"     "#671190"
   "Goudot"     "#1E6E00"
   "Bertin"     "#885578"
   "Perret"     "#FF2F80"
   "Beaudin"    "#800000"
   "Le Mintier" "#FF6832"
   "Dieterlé"   "#D16100"})

(def soft-colours
  {"Patay"      "#FFDBDA"
   "Maria"      "#EBEACC"
   "Bonin"      "#CCE2ED"
   "Calatraba"  "#F9CCD4"
   "Barrière"   "#F1EAE0"
   "Wolff"      "#F6DEE7"
   "Rodier"     "#EAD9CC"
   "Gaillet"    "#E4E5FF"
   "Pourtier"   "#FFECFC"
   "Le Blanc"   "#E8F4D9"
   "Cheilan"    "#CEF2E0"
   "Perrin"     "#CCD5DE"
   "Faivre"     "#FDF7DB"
   "Morin"      "#D5F2FC"
   "Bonnet"     "#FEEDD1"
   "Giraud"     "#EAE8EC"
   "Suzukawa"   "#CCE6E6"
   "Troncy"     "#E1CFE9"
   "Goudot"     "#D2E2CC"
   "Bertin"     "#E7DDE4"
   "Perret"     "#FFD5E6"
   "Beaudin"    "#E6CCCC"
   "Le Mintier" "#FFE1D6"
   "Dieterlé"   "#F6DFCC"})

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

(defn select
  "Selects an element within slate 1."
  [selection]
  (.select js/d3 (str "#slate-1 " selection)))

(defn enterfy
  "Uses a selector on a parent element to
   create an entity and enter data on it."
  [parent-element selector data]
  (-> (.selectAll parent-element selector)
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

(defn draw-links
  "Draws the links that represent the relations between family members."
  [relations]
  (-> (enterfy (select "#graph") ".link" relations)
      (.append "line")
      (attribufy {:class "link"})
      (stylify {:stroke           #(get hard-colours (.-family %))
                :stroke-width     #(case (.-type %) "partner" 4 "child" 2)
                :stroke-dasharray #(when (= "partner" (.-type %)) "3 3")})))

(defn draw-nodes
  "Draws the nodes that represent members of the family."
  [members]
  (-> (enterfy (select "#graph") ".node" members)
      (.append "circle")
      (.call (.-drag force-field))
      (attribufy {:class "node" :r 5})
      (stylify {:fill #(get hard-colours (.-family %))})))

(defn setup-tooltip
  "Sets up the tooltip text such that when you hover
   over a node you see the name of the family member."
  [nodes]
  (-> nodes
      (.append "title")
      (.text #(str (.-name %) " " (.-family %)))))

(defn translate
  [x y]
  (str "translate(" x "," y ")"))

(defn draw-axis
  []
  (let [ticks #js [1860 1880 1900 1920 1940 1960 1980 2000 2020]
        radial-axis (-> js/d3
                        .-svg
                        .axis
                        (.scale radial-scale)
                        (.tickValues ticks)
                        (.tickFormat (.format js/d3 "d")))]
    (-> (select "#graph")
        (.append "g")
        (.call radial-axis)
        (attribufy {:class     "axis"
                    :transform (translate (:x origin) (- (:y origin) 15))}))
    (-> (enterfy (select "#graph") ".guide" ticks)
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
  ;; TODO - refactor this thing
  [nodes links]
  (-> (enterfy (select "#legend") ".sample" (clj->js (vals hard-colours)))
      (.append "circle")
      (attribufy {:class "sample"
                  :cx    170
                  :cy    (fn [_ i] (+ 200 (* 25 i)))
                  :r     5})
      (stylify {:fill #(identity %)}))
  (-> (enterfy (select "#legend") ".label" (clj->js (keys hard-colours)))
      (.append "text")
      (.text #(identity %))
      (attribufy {:class "label" :x 190 :y (fn [_ i] (+ 205 (* 25 i)))})
      (.on "mouseover"
        (fn [d]
          (.style nodes "fill" #(let [f (.-family %)] (if (= f d) (get hard-colours f) (get soft-colours f))))
          (.style links "stroke" #(let [f (.-family %)] (if (= f d) (get hard-colours f) (get soft-colours f))))))
      (.on "mouseleave"
        (fn []
          (.style nodes "fill" #(get hard-colours (.-family %)))
          (.style links "stroke" #(get hard-colours (.-family %)))))))

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
        {:id "graph"})
      (dom/svg
        {:id "legend"}))))

;; TODO
;; 1) Try declaring nodes beforehand, then draw them up. [done]
;; 2) Tighten up the colour key, such that flashing doesn't occur, perhaps use groupings.
;; 3) Can you highlight the key name as you hover to give it an adequate response?
;; 4) Treat scale derived data as true data or auxiliary data?
;; 5) How do you deal with colour scales properly?
;; 6) Other families should work a swell.
;; 7) Small fix ups with text colouring etc.
