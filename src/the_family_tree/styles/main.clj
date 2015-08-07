(ns the-family-tree.styles.main
  (:require [garden.core :refer [css]]
            [garden.def :refer [defstyles defrule]]
            [garden.stylesheet :refer :all]
            [the-family-tree.styles.utils.variables :refer :all]
            [the-family-tree.styles.slates.slate-1 :refer [slate-1]]))

(defstyles common
  (at-font-face {:font-family "Source Sans Pro Bold"
                 :src "url('fonts/source-sans-pro-bold.otf')"})
  (at-font-face {:font-family "Source Sans Pro Regular"
                 :src "url('fonts/source-sans-pro-regular.otf')"})
  [:body {:margin 0
          :font-family "\"Source Sans Pro Regular\", Arial"}
   [:h1 :h2 :h3 :h4 :h5 :h6 {:margin 0
                             :font-family "\"Source Sans Pro Bold\", Arial"}]
   [:p {:font-size "1.4em"
        :margin "0"}]
   [:a {:text-decoration "none"}]])

(defstyles pile
  [:#pile {:position "absolute"
           :height "100%"
           :width "100%"}
   [:.slate {:display "table"
             :height "100%"
             :width "100%"}
    [:.backdrop {:display "table-cell"
                 :vertical-align "middle"}
     [:.content {:overflow "hidden"
                 :margin "0 auto"
                 :width "1400px"
                 :text-align "center"}]]]])

(defstyles base common pile slate-1)
