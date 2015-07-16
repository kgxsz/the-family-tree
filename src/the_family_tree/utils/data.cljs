(ns the-family-tree.utils.data)

(def data
  [{:id 1 :partner 2}
   {:id 2 :partner 1}])

#_(def data
  [{:id 1    :first-name "Andre"           :last-name "Troncy"     :generation 1 :sex "male"   :birth 1859 :death 1931 :partners #{2} :children #{3 4}}
   {:id 2    :first-name "Francine"        :last-name "Valli"      :generation 1 :sex "female" :birth 1872 :death 1954 :partners #{1} :children #{3 4}}

   {:id 3    :first-name "Maurice"         :last-name "Troncy"     :generation 2 :sex "male"   :birth 1896 :death 1942 :parents #{1 2} :partners #{4} :children #{5 6 18 50}}
   {:id 4    :first-name "Marcelle"        :last-name "Desrayaud"  :generation 2 :sex "female" :birth 1901 :death 1966 :partners #{3} :children #{5 6 18 50}}

   {:id 5    :first-name "Geneviève"       :last-name "Troncy"     :generation 3 :sex "female" :birth 1923 :death 1925 :parents #{3 4}}

   {:id 6    :first-name "Georges"         :last-name "Troncy"     :generation 3 :sex "male"   :birth 1926 :death 1993 :parents #{3 4} :partners #{7} :children #{8 13}}
   {:id 7    :first-name "Marie-Suzanne"   :last-name "Saillet"    :generation 3 :sex "female" :birth 1937 :partners #{6} :children #{8 13}}

   {:id 8    :first-name "Armelle"         :last-name "Troncy"     :generation 4 :sex "female" :birth 1967 :parents #{6 7} :partners #{9} :children #{10 11 12}}
   {:id 9    :first-name "Jean-Marc"       :last-name "Faivre"     :generation 4 :sex "male"   :birth 1968 :partners #{8} :children #{10 11 12}}
   {:id 10   :first-name "Marine"          :last-name "Faivre"     :generation 5 :sex "female" :birth 1986 :parents #{8 9}}
   {:id 11   :first-name "Charlotte"       :last-name "Faivre"     :generation 5 :sex "female" :birth 1994 :parents #{8 9}}
   {:id 12   :first-name "Prune"           :last-name "Faivre"     :generation 5 :sex "female" :birth 1997 :parents #{8 9}}

   {:id 13   :first-name "Antoine"         :last-name "Troncy"     :generation 4 :sex "male"   :birth 1969 :parents #{6 7} :partners #{14} :children #{15 16 17}}
   {:id 14   :first-name "Laurence"        :last-name "Sadoux"     :generation 4 :sex "female" :birth 1969 :partners #{13} :children #{15 16 17}}
   {:id 15   :first-name "Louis"           :last-name "Troncy"     :generation 5 :sex "male"   :birth 2002 :parents #{13 14}}
   {:id 16   :first-name "Sébastien"       :last-name "Troncy"     :generation 5 :sex "male"   :birth 2004 :parents #{13 14}}
   {:id 17   :first-name "Guillaume"       :last-name "Troncy"     :generation 5 :sex "male"   :birth 2006 :parents #{13 14}}

   {:id 18    :first-name "Christiane"     :last-name "Troncy"     :generation 3 :sex "female" :birth 1929 :death 2014 :parents #{3 4} :partners #{19} :children #{20 28 33 45}}
   {:id 19    :first-name "Roger"          :last-name "Dieterlé"   :generation 3 :sex "male"   :birth 1917 :death 1990 :partners #{18} :children #{20 28 33 45}}

   {:id 20    :first-name "Laurence"       :last-name "Dieterlé"   :generation 4 :sex "female" :birth 1951 :parents #{18 19} :partners #{21} :children #{22 27}}
   {:id 21    :first-name "Patrick"        :last-name "Le Blanc"   :generation 4 :sex "male"   :birth 1949 :death 2012 :partners #{20} :children #{22 27}}
   {:id 22    :first-name "Valentine"      :last-name "Le Blanc"   :generation 5 :sex "female" :birth 1974 :parents #{20 21} :partners #{23} :children #{24 25 26}}
   {:id 23    :first-name "Erwan"          :last-name "Le Mintier" :generation 5 :sex "male"   :birth 1968 :partners #{22} :children #{24 25 26}}
   {:id 24    :first-name "Aymeric"        :last-name "Le Mintier" :generation 6 :sex "male"   :birth 2005 :parents #{22 23}}
   {:id 25    :first-name "Jeanne"         :last-name "Le Mintier" :generation 6 :sex "female" :birth 2007 :parents #{22 23}}
   {:id 26    :first-name "Clara"          :last-name "Le Mintier" :generation 6 :sex "female" :birth 2009 :parents #{22 23}}
   {:id 27    :first-name "Aurélie"        :last-name "Le Blanc"   :generation 5 :sex "female" :birth 1976 :parents #{20 21}}

   {:id 28    :first-name "Régis"          :last-name "Dieterlé"   :generation 4 :sex "male"   :birth 1953 :death 1994 :parents #{18 19} :partners #{29} :children #{30}}
   {:id 29    :first-name "Marie-Delphine" :last-name "Muzelli"    :generation 4 :sex "female" :birth 1958 :partners #{28} :children #{30}}
   {:id 30    :first-name "Thibault"       :last-name "Dieterlé"   :generation 5 :sex "male"   :birth 1984 :parents #{28 29} :partners #{31}}
   {:id 31    :first-name "Johanna"        :last-name "Viosi"      :generation 5 :sex "female" :birth 1986 :partners #{30}}
   {:id 32    :first-name "Lenni"          :last-name "Dieterlé"   :generation 6 :sex "male"   :birth 2014 :parents #{30 31}}

   {:id 33    :first-name "Cécile"         :last-name "Dieterlé"   :generation 4 :sex "female" :birth 1955 :parents #{18 19} :partners #{34} :children #{35 36 40 44}}
   {:id 34    :first-name "Francois"       :last-name "Beaudin"    :generation 4 :sex "male"   :birth 1947 :death 1998 :partners #{33} :children #{35 36 40 44}}
   {:id 35    :first-name "Mathieu"        :last-name "Beaudin"    :generation 5 :sex "male"   :birth 1978 :parents #{33 34}}
   {:id 36    :first-name "Mélanie"        :last-name "Beaudin"    :generation 5 :sex "female" :birth 1980 :parents #{33 34} :partners #{37} :children #{38 39}}
   {:id 37    :first-name "Bruno"          :last-name "Cheilan"    :generation 5 :sex "male"   :birth 1974 :partners #{36} :children #{38 39}}
   {:id 38    :first-name "Gabrielle"      :last-name "Cheilan"    :generation 6 :sex "female" :birth 2005 :parents #{36 37}}
   {:id 39    :first-name "Robin"          :last-name "Cheilan"    :generation 6 :sex "male"   :birth 2007 :parents #{36 37}}
   {:id 40    :first-name "Alice"          :last-name "Beaudin"    :generation 5 :sex "female" :birth 1982 :parents #{33 34} :partners #{41} :children #{42 43}}
   {:id 41    :first-name "Mathieu"        :last-name "Maria"      :generation 5 :sex "male"   :birth 1974 :partners #{40} :children #{42 43}}
   {:id 42    :first-name "Loïse"          :last-name "Maria"      :generation 6 :sex "female" :birth 2011 :parents #{38 39}}
   {:id 43    :first-name "Gaspard"        :last-name "Maria"      :generation 6 :sex "male"   :birth 2014 :parents #{38 39}}
   {:id 44    :first-name "Clément"        :last-name "Beaudin"    :generation 5 :sex "male"   :birth 1986 :parents #{33 34}}

   {:id 45    :first-name "Anies"          :last-name "Dieterlé"   :generation 4 :sex "female" :birth 1958 :parents #{18 19} :partners #{46} :children #{47 48 49}}
   {:id 46    :first-name "Hiroshi"        :last-name "Suzukawa"   :generation 4 :sex "male"   :birth 1951 :partners #{45} :children #{47 48 49}}
   {:id 47    :first-name "Leïla"          :last-name "Suzukawa"   :generation 5 :sex "female" :birth 1984 :parents #{45 46}}
   {:id 48    :first-name "Keïgo"          :last-name "Suzukawa"   :generation 5 :sex "male"   :birth 1986 :parents #{45 46}}
   {:id 49    :first-name "Kaya"           :last-name "Suzukawa"   :generation 5 :sex "female" :birth 1988 :parents #{45 46}}

   {:id 50    :first-name "Marie-France"   :last-name "Troncy"     :generation 3 :sex "female" :birth 1940 :parents #{3 4} :partners #{51} :children #{52 58}}
   {:id 51    :first-name "Claude-Henry"   :last-name "Perrin"     :generation 3 :sex "male"   :birth 1943 :partners #{50} :children #{52 58}}

   {:id 52    :first-name "Emmanuel"       :last-name "Perrin"     :generation 4 :sex "male"   :birth 1968 :parents #{50 51} :partners #{53 55} :children #{54 56 57}}
   {:id 53    :first-name "Clémentine"     :last-name "Labaty"     :generation 4 :sex "female" :birth 1971 :partners #{52} :children #{54}}
   {:id 54    :first-name "Mathilde"       :last-name "Perrin"     :generation 5 :sex "female" :birth 1996 :parents #{52 53}}
   {:id 55    :first-name "Béatrice"       :last-name "Abadie"     :generation 4 :sex "female" :birth 1967 :partners #{52} :children #{56 57}}
   {:id 56    :first-name "Eva"            :last-name "Perrin"     :generation 5 :sex "female" :birth 2006 :parents #{52 55}}
   {:id 57    :first-name "Milo"           :last-name "Perrin"     :generation 5 :sex "male"   :birth 2006 :parents #{52 55}}

   {:id 58    :first-name "Alexandre"      :last-name "Perrin"     :generation 4 :sex "male"   :birth 1969 :parents #{50 51} :partners #{59 61} :children #{60 62 63}}
   {:id 59    :first-name "Anne-Claire"    :last-name "Antoni"     :generation 4 :sex "female" :birth 1977 :partners #{58} :children #{60}}
   {:id 60    :first-name "Mathis"         :last-name "Perrin"     :generation 5 :sex "male"   :birth 2001 :parents #{58 59}}
   {:id 61    :first-name "Sophie"         :last-name "Julliat"    :generation 4 :sex "female" :birth 1971 :partners #{58} :children #{62 63}}
   {:id 62    :first-name "Louna"          :last-name "Perrin"     :generation 5 :sex "female" :birth 2005 :parents #{58 61}}
   {:id 63    :first-name "Balian"         :last-name "Perrin"     :generation 5 :sex "male"   :birth 2009 :parents #{58 61}}])
