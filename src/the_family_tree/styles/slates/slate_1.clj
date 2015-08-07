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

(defn colourize-by-family
  "Creates an array of styles that colours an attribute
   based on the family contained in the class of the entity."
  [attribute]
  (for [[family colour] family-colour]
    [(keyword (str "&." family)) {attribute colour}]))

(defstyles slate-1
  [:#slate-1
   [:.backdrop
    [:.content
     [:#graph {:width "1000px"
               :height "1000px"
               :float "left"}
      (into
        [:.link {:stroke (:sea-gray colours)
                 :opacity 0.3 }
         [:&.partner {:stroke-width 5
                      :stroke-dasharray "3 3"}]
         [:&.child {:stroke-width 2}]]
        (colourize-by-family :stroke))
      (into
        [:.node {:fill (:sea-gray colours)}]
        (colourize-by-family :fill))
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
               :float "left"}]]]])
