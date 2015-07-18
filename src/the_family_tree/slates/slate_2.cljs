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
  (-> data (.forEach (fn [o i]
                       (set! (.-y o)
                             (max 200 (min 500 (.-y o))))
                       (set! (.-x o)
                             (max 400 (min 1000 (.-x o)))))))
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
