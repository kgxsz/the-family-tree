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
  (range 1860 2040 20))

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
  (doseq [[k v] attributes] (.attr entity k v))
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
  "Takes the current data, updates the positions of nodes,
   then updates the attrbutes on the node and link SVG
   entities to reflect the new positions."
  [data node link]
  (.forEach (.-nodes data) constrain-node-radially)
  (attribufy node {"cx" (fn [d] (.-x d))
                   "cy" (fn [d] (.-y d))})
  (attribufy link {"x1" (fn [d] (.. d -source -x))
                   "y1" (fn [d] (.. d -source -y))
                   "x2" (fn [d] (.. d -target -x))
                   "y2" (fn [d] (.. d -target -y))}))

(defn draw-data
  "Create node/link entities, apply the force field to the nodes and kick it off."
  [data]
  (let [node (-> (enter-data (select-graph) ".node" (.-nodes data))
                 (.append "circle")
                 (.call (.-drag force-field))
                 (attribufy {"class" (fn [d] (apply str (interpose " " ["node" (.-family d)])))
                             "r" 5}))
        link (-> (enter-data (select-graph) ".link" (.-links data))
                 (.append "line")
                 (attribufy {"class" (fn [d] (apply str (interpose " " ["link" (.-relation d) (.-family d)])))}))]
    (-> node
        (.append "title")
        (.text #(.-name %)))
    (-> force-field
        (.nodes (.-nodes data))
        (.links (.-links data))
        .start
        (.on "tick" #(update-positions data node link)))))

;; Should this really be a data driven draw? Shouldn't it be simpler than that?

(defn draw-axes
  [data]
  (let [ring   (-> (enter-data (select-graph) ".ring" data)
                   (.append "circle")
                   (.attr "class" "ring")
                   (.attr "cx" (:x origin))
                   (.attr "cy" (:y origin))
                   (.attr "r" (fn [d] (year-to-radius d))))
        mask   (-> (enter-data (select-graph) ".mask" data)
                   (.append "rect")
                   (.attr "class" "mask")
                   (.attr "width" 10)
                   (.attr "height" 20)
                   (.attr "x" (fn [_ i] (+ 25 (:x origin) (* 54 i))))
                   (.attr "y" (- (:y origin) 8)))]))

(defn draw-labels
  [data]
  (let [label  (-> (enter-data (select-graph) ".label" data)
                   (.append "text")
                   (.text #(identity %))
                   (.attr "class" "label")
                   (.attr "x" (fn [_ i] (+ 13 (:x origin) (* 54 i))))
                   (.attr "y" (+ 7 (:y origin))))]))

(defcomponent slate-1
  [state owner]
  (did-mount
    [_]
    (draw-axes (clj->js scale))
    (draw-data (clj->js family-data))
    (draw-labels (clj->js scale)))
  (render-state
    [_ _]
    (println "Rendering slate-1 component with state:" state)
    (slate :slate-1
      (dom/svg
        {:id "graph"})
      (dom/svg
        {:id "legend"}))))
