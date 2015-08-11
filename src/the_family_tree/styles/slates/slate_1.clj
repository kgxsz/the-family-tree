(ns the-family-tree.styles.slates.slate-1
  (:require [garden.def :refer [defstyles]]
            [the-family-tree.styles.utils.variables :refer :all]))

(defstyles slate-1
  [:#slate-1
   [:.backdrop
    [:.content
     [:#canvas {:width "1400px"
                :height "1000px"
                :float "left"}
      [:.link {:opacity 0.3}]
      [:.axis {:pointer-events "none"}
       [:text {:opacity 0.7}]
       [:path {:opacity 0}]]
      [:.guide {:stroke (:black colours)
                :stroke-width 4
                :fill "none"
                :opacity 0.05
                :pointer-events "none"}]
      [:.label {:color "#4C4C4C"
                :font-size "1em"
                :text-anchor "left"
                :cursor "default"}]]]]])
