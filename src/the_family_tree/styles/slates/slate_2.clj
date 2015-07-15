(ns the-family-tree.styles.slates.slate-2
  (:require [garden.def :refer [defstyles]]
            [the-family-tree.styles.utils.variables :refer :all]
            [the-family-tree.styles.utils.helpers :refer :all]))

(defstyles slate-2
  [:#slate-2 {:color (:hard-blue colours)}
   [:.backdrop {:background-color (:soft-blue colours)}
    [:.content
     (slate-title (:faded-blue colours))
     [:#canvas {:width "1400px"
                :height "700px"
                :float "left"}
      [:.link {:stroke (:faded-blue colours)}]
      [:.node {:stroke (:soft-blue colours)
               :stroke-width 1
               :fill (:hard-blue colours)}]]]]])
