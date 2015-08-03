(ns the-family-tree.core
  (:require [dommy.core :as dommy :refer-macros [sel1]]
            [om.core :as om :include-macros true]
            [om-tools.core :refer-macros [defcomponent]]
            [om-tools.dom :as dom :include-macros true]
            [the-family-tree.interactor :refer [setup-key-press-interaction]]
            [the-family-tree.slates.slate-1 :refer [slate-1]]))

(enable-console-print!)

(defonce state
  (atom {:slates {:slate-1 {}}}))

(defcomponent pile
  "This guy is the root component, it's the pile in
   which you put the slates. When you want a new slate,
   add it here and pass it it's state."
  [{:keys [slates] :as state} owner]
  (render-state [_ _]
    (println "Rendered root component with state:" state)
    (dom/div
      {:id "pile"}
      (om/build slate-1 (:slate-1 slates)))))

(defn setup-root-component
  [state]
  (om/root
    pile
    state
    {:target (sel1 :#application)}))

(defn main
  []
  (setup-key-press-interaction state)
  (setup-root-component state))
