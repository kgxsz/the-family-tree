(ns the-family-tree.slates.slate-1
  (:require-macros [the-family-tree.utils.macros :refer [slate]])
  (:require [om-tools.core :refer-macros [defcomponent]]
            [om-tools.dom :as dom :include-macros true]
            [the-family-tree.utils.objects :refer [divider down-arrow]]))

(defcomponent slate-1
  [state owner]
  (render-state
    [_ _]
    (println "Rendering slate-1 component with state:" state)
    (slate :slate-1
      (dom/div
        {:id "heading"}
        (dom/h1 "LA ")
        (dom/h1 "FAMILLE"))
      (divider)
      (dom/div
        {:id "directions"}
        (dom/p "( appuyez le") (down-arrow) (dom/p ")")))))
