(ns the-family-tree.slates.slate-1
  (:require-macros [the-family-tree.utils.macros :refer [slate]])
  (:require [om-tools.core :refer-macros [defcomponent]]
            [om-tools.dom :as dom :include-macros true]
            [the-family-tree.utils.data :refer [family-data]]
            [om.core :as om]
            [cljsjs.d3 :as d3]))

(def origin
  "The central point of the graph."
  {:x 500 :y 500})

(def scale
  "This scale is made up of 20 year intervals starting
   in 1860 and ending at 2020, this is used to draw
   the concentric rings and their labels."
  (clj->js (range 1860 2040 20)))

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
  (-> (.-layout js/d3)
      .force
      (.charge -400)
      (.linkDistance #(case (.-relation %) "partner" 60 "child" 30))
      (.gravity 0)))

(defn select-graph
  "Selects the SVG element upon which
   the graph will be drawn. Note that
   this is only valid for slate 1."
  []
  (.select js/d3 "#slate-1 #graph"))

(defn select-legend
  "Selects the SVG element upon which
   the legend will be drawn. Note that
   this is only valid for slate 1."
  []
  (.select js/d3 "#slate-1 #legend"))

(defn year-to-radius
  "The passage of time is represented in a radially
   increasing manner, at a rate of 2.7 pixels per year,
   starting at 1849. This function converts a given year
   to it's radial value."
  [year]
  (* 2.7 (- year 1849)))

(defn enter-data
  "Uses a selector on a parent
   element to enter data."
  [parent-element selector data]
  (-> (.selectAll parent-element selector)
      (.data data)
      .enter))

(defn attribufy
  [entity attributes]
  (doseq [[k v] attributes] (.attr entity (name k) v))
  entity)

(defn stylify
  [entity styles]
  (doseq [[k v] styles] (.style entity (name k) v))
  entity)

(defn constrain-node-radially
  "Takes the node's position and updates it such that it
   is constrained to a ring where the radius is defined by
   the node's birth year, and centered according to origin."
  [node _]
  (let [vx    (- (.-x node) (:x origin))
        vy    (- (.-y node) (:y origin))
        |v|   (.sqrt js/Math (+ (* vx vx) (* vy vy)))
        x     (+ (:x origin) (* (year-to-radius (.-birth node)) (/ vx |v|)))
        y     (+ (:y origin) (* (year-to-radius (.-birth node)) (/ vy |v|)))]
    (when-not (zero? |v|)
      (set! (.-x node) x)
      (set! (.-y node) y))))

(defn update-positions
  "Takes the current data, updates the positions of
   nodes, then updates the attrbutes on the link/node
   SVG entities to reflect the new positions."
  [data node link]
  (.forEach (.-nodes data) constrain-node-radially)
  (attribufy link {:x1 (fn [d] (.. d -source -x))
                   :y1 (fn [d] (.. d -source -y))
                   :x2 (fn [d] (.. d -target -x))
                   :y2 (fn [d] (.. d -target -y))})
  (attribufy node {:cx (fn [d] (.-x d))
                   :cy (fn [d] (.-y d))}))

(defn draw-data
  "Draws link/node entities, applies the force field to the nodes and kicks it off.
   Note that the order in which the SVG elements are created is visually important."
  [data node link]
  (-> node
      (.append "title")
      (.text #(.-name %)))
  (-> force-field
      (.nodes (.-nodes data))
      (.links (.-links data))
      .start
      (.on "tick" #(update-positions data node link))))

(defn update-data
  [data]
  (let [node (-> (enter-data (select-graph) ".node" (.-nodes data))
                 (.attr "class" "node updated"))]))

(defn draw-axes
  "Draws the radial rings to represent years, as well as the masked
   area of the ring where the year label will be placed."
  []
  (-> (enter-data (select-graph) ".ring" scale)
      (.append "circle")
      (attribufy {:class "ring"
                  :cx    (:x origin)
                  :cy    (:y origin)
                  :r     #(year-to-radius %)})))

(defn draw-labels
  "Draws the year label for each concentric ring."
  []
  (-> (enter-data (select-graph) ".label" scale)
      (.append "text")
      (.text #(identity %))
      (attribufy {:class "label"
                  :x     #(+ (:x origin) (year-to-radius %))
                  :y     (+ 7 (:y origin))})))

(defn draw-colour-key
  [node link]
  (let [sample (-> (enter-data (select-legend) ".sample" (clj->js (vals hard-colours)))
                   (.append "circle")
                   (attribufy {:class "sample"
                               :cx    170
                               :cy    (fn [_ i] (+ 200 (* 25 i)))
                               :r     5})
                   (stylify {:fill #(identity %)}))
        label  (-> (enter-data (select-legend) ".label" (clj->js (keys hard-colours)))
                   (.append "text")
                   (.text #(identity %))
                   (attribufy {:class "label"
                               :x     190
                               :y     (fn [_ i] (+ 205 (* 25 i)))})
                   (.on "mouseover" (fn [d]
                                       (.style node "fill" #(let [f (.-family %)] (if (= f d) (get hard-colours f) (get soft-colours f))))
                                       (.style link "stroke" #(let [f (.-family %)] (if (= f d) (get hard-colours f) (get soft-colours f))))))
                   (.on "mouseleave" (fn []
                                       (.style node "fill" #(get hard-colours (.-family %)))
                                       (.style link "stroke" #(get hard-colours (.-family %))))))]))

(defcomponent slate-1
  [state owner]
  (did-mount
    [_]
    (let [data (clj->js family-data)
          link-entrance (enter-data (select-graph) ".link" (.-links data))
          link (-> link-entrance (.append "line"))
          node (-> (enter-data (select-graph) ".node" (.-nodes data))
                 (.append "circle")
                 (.call (.-drag force-field))
                 (attribufy {:class "node"
                             :r     5})
                 (stylify {:fill #(get hard-colours (.-family %))}))]
      (-> link
          (attribufy {:class "link"})
          (stylify {:stroke           #(get hard-colours (.-family %))
                    :stroke-width     #(case (.-relation %) "partner" 4 "child" 2)
                    :stroke-dasharray #(when (= "partner" (.-relation %)) "3 3")}))
      (draw-axes)
      (draw-data data node link)
      (draw-labels)
      (draw-colour-key node link)))
  (render-state
    [_ _]
    (println "Rendering slate-1 component with state:" state)
    (slate :slate-1
      (dom/svg
        {:id "graph"})
      (dom/svg
        {:id "legend"}))))

;; TODO
;; 1) Try declaring nodes beforehand, then draw them up.
;; 2) Tighten up the colour key, such that flashing doesn't occur, perhaps use groupings.
;; 3) Can you highlight the key name as you hover to give it an adequate response.
;; 4) Treat scale derived data as true data or auxiliary data?
;; 5) Other families should work a swell.
