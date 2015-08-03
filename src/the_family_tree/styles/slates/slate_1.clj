(ns the-family-tree.styles.slates.slate-1
  (:require [garden.def :refer [defstyles]]
            [the-family-tree.styles.utils.variables :refer :all]
            [the-family-tree.styles.utils.helpers :refer :all]))

(defstyles slate-1
  [:#slate-1 {:color (:hard-blue colours)}
   [:.backdrop
    [:.content
     (slate-title (:faded-blue colours))
     [:#canvas {:width "1400px"
                :height "1000px"
                :float "left"}
      [:.link {:stroke "#DEDEDE"}
       [:&.partner {:stroke-width 4
                    :stroke-dasharray "3 3"}]
       [:&.child {:stroke-width 2}]]
      [:.node {:stroke-width 1}]
      [:.ring {:stroke (:light-gray colours)
               :stroke-width 6
               :fill "none"}]
      [:.mask {:fill (:white colours)}]
      [:.label {:font-size "1em"
                :opacity 0.5
                :pointer-events "none"}]]]]])
