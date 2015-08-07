(ns the-family-tree.slates.slate-1
  (:require-macros [the-family-tree.utils.macros :refer [slate]])
  (:require [om-tools.core :refer-macros [defcomponent]]
            [om-tools.dom :as dom :include-macros true]
            [the-family-tree.utils.data :refer [family-data]]
            [cljsjs.d3 :as d3]))

(def origin
  "The central point of the graph."
  {:x 500 :y 500})

(def scale
  "This scale is made up of 20 year intervals starting
   in 1860 and ending at 2020, this is used to draw
   the concentric rings and their labels."
  (clj->js (range 1860 2040 20)))

(def colours
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
  [data colours]
  (let [link (-> (enter-data (select-graph) ".link" (.-links data))
                 (.append "line")
                 (attribufy {:class "link"})
                 (stylify {:stroke           #(get colours (.-family %))
                           :stroke-width     #(case (.-relation %) "partner" 4 "child" 2)
                           :stroke-dasharray #(when (= "partner" (.-relation %)) "3 3")}))
        node (-> (enter-data (select-graph) ".node" (.-nodes data))
                 (.append "circle")
                 (.call (.-drag force-field))
                 (attribufy {:class "node"
                             :r     5})
                 (stylify {:fill #(get colours (.-family %))}))]
    (-> node
        (.append "title")
        (.text #(.-name %)))
    (-> force-field
        (.nodes (.-nodes data))
        (.links (.-links data))
        .start
        (.on "tick" #(update-positions data node link)))))

(defn draw-axes
  "Draws the radial rings to represent years, as well as the masked
   area of the ring where the year label will be placed."
  [data]
  (let [ring (-> (enter-data (select-graph) ".ring" data)
                 (.append "circle")
                 (attribufy {:class "ring"
                             :cx    (:x origin)
                             :cy    (:y origin)
                             :r     #(year-to-radius %)}))
        mask (-> (enter-data (select-graph) ".mask" data)
                 (.append "rect")
                 (attribufy {:class  "mask"
                             :width  10
                             :height 20
                             :x      #(+ (:x origin) (year-to-radius %) -5)
                             :y      (- (:y origin) 8)}))]))

(defn draw-labels
  "Draws the year label for each concentric ring."
  [data]
  (let [label (-> (enter-data (select-graph) ".label" data)
                  (.append "text")
                  (.text #(identity %))
                  (attribufy {:class "label"
                              :x     #(+ (:x origin) (year-to-radius %))
                              :y     (+ 7 (:y origin))}))]))

#_(defn draw-colour-key
  []
  (let []))

(defcomponent slate-1
  [state owner]
  (did-mount
    [_]
    (draw-axes scale)
    (draw-data (clj->js family-data) colours)
    (draw-labels scale)
    #_(draw-colour-key))
  (render-state
    [_ _]
    (println "Rendering slate-1 component with state:" state)
    (slate :slate-1
      (dom/svg
        {:id "graph"})
      (dom/svg
        {:id "legend"}))))
