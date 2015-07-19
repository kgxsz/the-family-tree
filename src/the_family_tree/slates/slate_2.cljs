(ns the-family-tree.slates.slate-2
  (:require-macros [the-family-tree.utils.macros :refer [slate]])
  (:require [om-tools.core :refer-macros [defcomponent]]
            [om-tools.dom :as dom :include-macros true]
            [the-family-tree.utils.data :refer [data]]
            [the-family-tree.utils.objects :refer [pointer]]
            [cljsjs.d3 :as d3]))

(def force-field (-> js/d3 .-layout .force
                      (.charge -100)
                      (.linkDistance 20)
                      (.size (clj->js [1400 700]))))

(defn update-entities
  [node data]
  (.forEach data
    (fn [o i]
      (let [quadrant (if (< (.-x o) 700)
                       (if (< (.-y o) 350) :top-left :bottom-left)
                       (if (< (.-y o) 350) :top-right :bottom-right))]
        (case quadrant
          :top-left     (do (set! (.-x o) (if (> (.-y o) 250) (min 600 (.-x o)) (.-x o)))
                            (set! (.-y o) (if (> (.-x o) 600) (min 250 (.-y o)) (.-y o))))
          :top-right    (do (set! (.-x o) (if (> (.-y o) 250) (max 800 (.-x o)) (.-x o)))
                            (set! (.-y o) (if (< (.-x o) 800) (min 250 (.-y o)) (.-y o))))
          :bottom-left  (do (set! (.-x o) (if (< (.-y o) 450) (min 600 (.-x o)) (.-x o)))
                            (set! (.-y o) (if (> (.-x o) 600) (max 450 (.-y o)) (.-y o))))
          :bottom-right (do (set! (.-x o) (if (< (.-y o) 450) (max 800 (.-x o)) (.-x o)))
                            (set! (.-y o) (if (< (.-x o) 800) (max 450 (.-y o)) (.-y o))))))))
  (-> node
      (.attr "cx" (fn [d] (.-x d)))
      (.attr "cy" (fn [d] (.-y d)))))

(defn graphify
  [data]
  (let [canvas (.select js/d3 "#slate-2 #canvas")
        node (-> canvas (.selectAll "circle")
                  (.data data) .enter (.append "circle")
                  (.attr "r" 6)
                  (.call (.-drag force-field)))]
    (-> force-field
        (.nodes data)
        .start)
    (-> force-field
        (.on "tick" #(update-entities node data)))))

(defcomponent slate-2
  [state owner]
  (did-mount
    [_]
    (graphify (clj->js data)))
  (render-state
    [_ _]
    (println "Rendering slate-2 component with state:" state)
    (slate :slate-2
      (dom/svg
        {:id "canvas"}))))
