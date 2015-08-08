(ns the-family-tree.styles.slates.slate-1
  (:require [garden.def :refer [defstyles]]
            [the-family-tree.styles.utils.variables :refer :all]))

(defstyles slate-1
  [:#slate-1
   [:.backdrop
    [:.content
     [:#graph {:width "1000px"
               :height "1000px"
               :float "left"}
      [:.link {:stroke (:sea-gray colours)
               :opacity 0.3}]
      [:.node {:fill (:sea-gray colours)}]
      [:.ring {:stroke (:light-gray colours)
               :stroke-width 5
               :fill "none"}]
      [:.mask {:fill (:white colours)}]
      [:.label {:font-size "1em"
                :text-anchor "middle"
                :opacity 0.5
                :pointer-events "none"}]]
     [:#legend {:width "400px"
               :height "1000px"
               :float "left"}
      [:.label {:font-size "1em"
                :text-anchor "left"
                :opacity 0.5
                :cursor "default"}]]]]])
