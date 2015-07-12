(def family
  [{:id 1    :first-name "Andre"         :last-name "Troncy"     :generation 1 :birth 1859 :death 1931 :partners #{2} :children #{}}
   {:id 2    :first-name "Francine"      :last-name "Valli"      :generation 1 :birth 1872 :death 1954 :partners #{1} :children #{}}

   {:id 3    :first-name "Maurice"       :last-name "Troncy"     :generation 2 :birth 1896 :death 1942 :partners #{4} :children #{} :parents #{1 2}}
   {:id 4    :first-name "Marcelle"      :last-name "Desrayaud"  :generation 2 :birth 1901 :death 1966 :partners #{3} :children #{}}

   {:id 5    :first-name "Geneviève"     :last-name "Troncy"     :generation 3 :birth 1923 :death 1925 :parents #{3 4}}

   {:id 6    :first-name "Georges"       :last-name "Troncy"     :generation 3 :birth 1926 :death 1993 :parents #{3 4} :partners #{7} :children #{8 13}}
   {:id 7    :first-name "Marie-Suzanne" :last-name "Saillet"    :generation 3 :birth 1937 :partners #{6} :children #{8 13}}

   {:id 8    :first-name "Armelle"       :last-name "Troncy"     :generation 4 :birth 1967 :parents #{6 7} :partners #{9} :children #{10 11 12}}
   {:id 9    :first-name "Jean-Marc"     :last-name "Faivre"     :generation 4 :birth 1968 :partners #{8} :children #{10 11 12}}
   {:id 10   :first-name "Marine"        :last-name "Faivre"     :generation 5 :birth 1986 :parents #{8 9}}
   {:id 11   :first-name "Charlotte"     :last-name "Faivre"     :generation 5 :birth 1994 :parents #{8 9}}
   {:id 12   :first-name "Prune"         :last-name "Faivre"     :generation 5 :birth 1997 :parents #{8 9}}

   {:id 13   :first-name "Antoine"       :last-name "Troncy"     :generation 4 :birth 1969 :parents #{6 7} :partners #{14} :children #{15 16 17}}
   {:id 14   :first-name "Laurence"      :last-name "Sadoux"     :generation 4 :birth 1969 :partners #{13} :children #{15 16 17}}
   {:id 15   :first-name "Louis"         :last-name "Troncy"     :generation 5 :birth 2002 :parents #{13 14}}
   {:id 16   :first-name "Sébastien"     :last-name "Troncy"     :generation 5 :birth 2004 :parents #{13 14}}
   {:id 17   :first-name "Guillaume"     :last-name "Troncy"     :generation 5 :birth 2006 :parents #{13 14}}

   {:id 18    :first-name "Christiane"   :last-name "Troncy"     :generation 3 :birth 1929 :death 2014 :parents #{3 4} :partners #{19} :children #{}}
   {:id 19    :first-name "Roger"        :last-name "Dieterlé"   :generation 3 :birth 1917 :death 1990 :partners #{18} :children #{}}

   {:id 20    :first-name "Laurence"     :last-name "Dieterlé"   :generation 4 :birth 1951 :parents #{18 19} :partners #{21} :children #{22 27}}
   {:id 21    :first-name "Patrick"      :last-name "Le Blanc"   :generation 4 :birth 1949 :death 2012 :partners #{20} :children #{22 27}}
   {:id 22    :first-name "Valentine"    :last-name "Le Blanc"   :generation 5 :birth 1974 :parents #{20 21} :partners #{23} :children #{24 25 26}}
   {:id 23    :first-name "Erwan"        :last-name "Le Mintier" :generation 5 :birth 1968 :partners #{22} :children #{24 25 26}}
   {:id 24    :first-name "Aymeric"      :last-name "Le Mintier" :generation 6 :birth 2005 :parents #{22 23}}
   {:id 25    :first-name "Jeanne"       :last-name "Le Mintier" :generation 6 :birth 2007 :parents #{22 23}}
   {:id 26    :first-name "Clara"        :last-name "Le Mintier" :generation 6 :birth 2009 :parents #{22 23}}
   {:id 27    :first-name "Aurélie"      :last-name "Le Blanc"   :generation 5 :birth 1976 :parents #{20 21}}

   {:id 28    :first-name "Régis"        :last-name "Dieterlé"   :generation 4 :birth 1953 :death 1994 :parents #{18 19} :partners #{29} :children #{}}
   ])

;; Time graph of lifespans, easily see generational drift
;; Average life expectancy compared with French life expectancy of the time, and compared with world wide life expectancy
;; Average number of children, average age of child bearing
;; Average age difference of couples
;; Oldest and youngest
;; Birth cycle years, trends etc

(defn lifespan [{:keys [birth death]}] (- death birth))
(defn n-children [{:keys [children]}] (count children))

(for [member family]
  {:lifespan (lifespan member) :n-children (n-children member)})

(set (map :last-name family))
(filter #(-> % :id (= 3)) family)
