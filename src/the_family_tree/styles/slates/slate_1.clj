(ns the-family-tree.styles.slates.slate-1
  (:require [garden.def :refer [defstyles]]
            [the-family-tree.styles.utils.variables :refer :all]
            [the-family-tree.styles.utils.helpers :refer :all]))

(defstyles slate-1
  [:#slate-1 {:color (:hard-yellow colours)}
   [:.backdrop {:background-color (:soft-yellow colours)}
    [:.content
     [:#heading {:margin "40px auto 10px auto"}
      [:h1 {:line-height "0.7em"}
        (nth-child
          "1" {:display "inline"
               :font-size "3em"}
          "2" {:display "inline"
               :font-size "10em"
               :padding "0 8px"})]]
     [:.divider {:margin "auto"
                 :width "700px"
                 :height "5px"}
      [:line {:stroke (:faded-yellow colours)
              :stroke-width "3"}]]
     [:#directions {:margin "60px auto 0 auto"}
      [:p {:display "inline"}]
      [:#arrow {:display "inline"
                :position "relative"
                :width "24px"
                :height "24px"
                :top "7px"}]
       [:line {:stroke (:hard-yellow colours)
               :stroke-width "2"}]
       [:polygon {:stroke (:hard-yellow colours)
                  :fill (:hard-yellow colours)}]]]]])
