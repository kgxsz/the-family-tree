(ns the-family-tree.styles.slates.slate-1
  (:require [garden.def :refer [defstyles]]
            [the-family-tree.styles.utils.variables :refer :all]
            [the-family-tree.styles.utils.helpers :refer :all]))

(def family-colour
 {"Patay" "#123456"
  "Maria" "#123456"
  "Bonin"
  "Calatraba"
  "Barrière"
  "Wolff"
  "Rodier"
  "Gaillet"
  "Pourtier"
  "Le Blanc"
  "Cheilan"
  "Perrin"
  "Faivre"
  "Morin"
  "Bonnet"
  "Giraud"
  "Suzukawa"
  "Troncy"
  "Goudot"
  "Bertin"
  "Perret"
  "Beaudin"
  "Le Mintier"
  "Dieterlé"})

(defstyles slate-1
  [:#slate-1 {:color (:hard-blue colours)}
   [:.backdrop
    [:.content
     (slate-title (:faded-blue colours))
     [:#canvas {:width "1400px"
                :height "1000px"
                :float "left"}
      [:.link {:stroke "#DEDEDE"
               :opacity 0.3}
       [:&.partner {:stroke-width 5
                    :stroke-dasharray "3 3"}]
       [:&.child {:stroke-width 2}]
       [:&.Troncy {:stroke (:hard-green colours)}]
       [:&.Patay {:stroke (:hard-crimson colours)}]
       [:&.Bertin {:stroke (:hard-yellow colours)}]
       [:&.Bonnet {:stroke (:hard-pink colours)}]
       [:&.Dieterlé {:stroke (:hard-blue colours)}]
       [:&.Perrin {:stroke (:hard-violet colours)}]]
      [:.node {:stroke-width 1
               :fill "#888"}
       [:&.Troncy {:fill (:hard-green colours)}]
       [:&.Patay {:fill (:hard-crimson colours)}]
       [:&.Bertin {:fill (:hard-yellow colours)}]
       [:&.Bonnet {:fill (:hard-pink colours)}]
       [:&.Dieterlé {:fill (:hard-blue colours)}]
       [:&.Perrin {:fill (:hard-violet colours)}]]
      [:.ring {:stroke (:light-gray colours)
               :stroke-width 6
               :fill "none"}]
      [:.mask {:fill (:white colours)}]
      [:.label {:font-size "1em"
                :opacity 0.5
                :pointer-events "none"}]]]]])
