(ns the-family-tree.styles.slates.slate-1
  (:require [garden.def :refer [defstyles]]
            [the-family-tree.styles.utils.variables :refer :all]))

(def family-colour
 "Here, each family is assigned a colour,
  much care has been made in choosing colours
  that do not clash within family branches."
 {"Patay" (:grapefruit-red colours)
  "Maria" (:olive colours)
  "Bonin" (:medium-blue colours)
  "Calatraba" (:lipstick-red colours)
  "Barrière" (:faded-brown colours)
  "Wolff" (:dull-pink colours)
  "Rodier" (:deep-brown colours)
  "Gaillet" (:vibrant-blue colours)
  "Pourtier" (:light-pink colours)
  "Le-Blanc" (:hard-green colours)
  "Cheilan" (:aqua colours)
  "Perrin" (:deep-blue colours)
  "Faivre" (:gold colours)
  "Morin" (:hard-blue colours)
  "Bonnet" (:mustard-yellow colours)
  "Giraud" (:purple-gray colours)
  "Suzukawa" (:teal colours)
  "Troncy" (:full-purple colours)
  "Goudot" (:heavy-green colours)
  "Bertin" (:medium-purple colours)
  "Perret" (:hot-pink colours)
  "Beaudin" (:maroon colours)
  "Le-Mintier" (:bright-orange colours)
  "Dieterlé" (:brown-orange colours)})

(defn colour-by-family
  [family attribute]
  (let [selector (keyword (str "&." family))]
    [selector {attribute (get family-colour family)}]))

(defstyles slate-1
  [:#slate-1
   [:.backdrop
    [:.content
     [:#graph {:width "1000px"
               :height "1000px"
               :float "left"}
      [:.link {:stroke (:sea-gray colours)
               :opacity 0.3 }
       [:&.partner {:stroke-width 5
                    :stroke-dasharray "3 3"}]
       [:&.child {:stroke-width 2}]
       (colour-by-family "Patay" :stroke)
       (colour-by-family "Maria" :stroke)
       (colour-by-family "Bonin" :stroke)
       (colour-by-family "Calatraba" :stroke)
       (colour-by-family "Barrière" :stroke)
       (colour-by-family "Wolff" :stroke)
       (colour-by-family "Rodier" :stroke)
       (colour-by-family "Gaillet" :stroke)
       (colour-by-family "Pourtier" :stroke)
       (colour-by-family "Le-Blanc" :stroke)
       (colour-by-family "Cheilan" :stroke)
       (colour-by-family "Perrin" :stroke)
       (colour-by-family "Faivre" :stroke)
       (colour-by-family "Morin" :stroke)
       (colour-by-family "Bonnet" :stroke)
       (colour-by-family "Giraud" :stroke)
       (colour-by-family "Suzukawa" :stroke)
       (colour-by-family "Troncy" :stroke)
       (colour-by-family "Goudot" :stroke)
       (colour-by-family "Bertin" :stroke)
       (colour-by-family "Perret" :stroke)
       (colour-by-family "Beaudin" :stroke)
       (colour-by-family "Le-Mintier" :stroke)
       (colour-by-family "Dieterlé" :stroke)]
      [:.node {:fill (:sea-gray colours)}
       (colour-by-family "Patay" :fill)
       (colour-by-family "Maria" :fill)
       (colour-by-family "Bonin" :fill)
       (colour-by-family "Calatraba" :fill)
       (colour-by-family "Barrière" :fill)
       (colour-by-family "Wolff" :fill)
       (colour-by-family "Rodier" :fill)
       (colour-by-family "Gaillet" :fill)
       (colour-by-family "Pourtier" :fill)
       (colour-by-family "Le-Blanc" :fill)
       (colour-by-family "Cheilan" :fill)
       (colour-by-family "Perrin" :fill)
       (colour-by-family "Faivre" :fill)
       (colour-by-family "Morin" :fill)
       (colour-by-family "Bonnet" :fill)
       (colour-by-family "Giraud" :fill)
       (colour-by-family "Suzukawa" :fill)
       (colour-by-family "Troncy" :fill)
       (colour-by-family "Goudot" :fill)
       (colour-by-family "Bertin" :fill)
       (colour-by-family "Perret" :fill)
       (colour-by-family "Beaudin" :fill)
       (colour-by-family "Le-Mintier" :fill)
       (colour-by-family "Dieterlé" :fill)]
      [:.ring {:stroke (:light-gray colours)
               :stroke-width 6
               :fill "none"}]
      [:.mask {:fill (:white colours)}]
      [:.label {:font-size "1em"
                :opacity 0.5
                :pointer-events "none"}]]
     [:#legend {:width "400px"
               :height "1000px"
               :float "left"}]]]])
