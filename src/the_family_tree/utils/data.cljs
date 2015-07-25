(ns the-family-tree.utils.data)

(def family-data
  {:nodes [{:id 0   :first-name "André"           :last-name "Troncy"    :generation 1 :sex "male"   :blood-line true  :birth 1859 :death 1931}
           {:id 1   :first-name "Francine"        :last-name "Valli"     :generation 1 :sex "female" :blood-line false :birth 1872 :death 1954}
           {:id 2   :first-name "Charles"         :last-name "Patay"     :generation 2 :sex "male"   :blood-line false :birth 1884 :death 1959}
           {:id 3   :first-name "Francois"        :last-name "Bonnet"    :generation 2 :sex "male"   :blood-line false :birth 1884 :death 1970}
           {:id 4   :first-name "Jeanne"          :last-name "Troncy"    :generation 2 :sex "female" :blood-line true  :birth 1894 :death 1979}
           {:id 5   :first-name "Claudia"         :last-name "Troncy"    :generation 2 :sex "female" :blood-line true  :birth 1895 :death 1968}
           {:id 6   :first-name "Maurice"         :last-name "Troncy"    :generation 2 :sex "male"   :blood-line true  :birth 1896 :death 1942}
           {:id 7   :first-name "Gustave"         :last-name "Troncy"    :generation 2 :sex "male"   :blood-line true  :birth 1898 :death 1972}
           {:id 8   :first-name "Claude"          :last-name "Troncy"    :generation 2 :sex "male"   :blood-line true  :birth 1900 :death 1964}
           {:id 9   :first-name "Madeleine"       :last-name "Galtier"   :generation 2 :sex "female" :blood-line false :birth 1900 :death 1983}
           {:id 10  :first-name "Marcelle"        :last-name "Desrayaud" :generation 2 :sex "female" :blood-line false :birth 1901 :death 1966}
           {:id 11  :first-name "Robert"          :last-name "Troncy"    :generation 2 :sex "male"   :blood-line true  :birth 1902 :death 1959}
           {:id 12  :first-name "Renée"           :last-name "Pointet"   :generation 2 :sex "female" :blood-line false :birth 1907 :death 2000}
           {:id 13  :first-name "Elisabeth"       :last-name "de Veron"  :generation 2 :sex "female" :blood-line false :birth 1909 :death 1994}
           {:id 14  :first-name "Albert"          :last-name "Bertin"    :generation 3 :sex "male"   :blood-line false :birth 1914 :death 1997}
           {:id 15  :first-name "Marcel"          :last-name "Rodier"    :generation 3 :sex "male"   :blood-line false :birth 1916 :death 2004}
           {:id 16  :first-name "Simone"          :last-name "Patay"     :generation 3 :sex "female" :blood-line true  :birth 1917 :death 2000}
           {:id 17  :first-name "Roger"           :last-name "Dieterlé"  :generation 3 :sex "male"   :blood-line false :birth 1917 :death 1990}
           {:id 18  :first-name "André"           :last-name "Patay"     :generation 3 :sex "male"   :blood-line true  :birth 1919 :death 1995}
           {:id 19  :first-name "Denise"          :last-name "Morel"     :generation 3 :sex "female" :blood-line false :birth 1922}
           {:id 20  :first-name "Jean"            :last-name "Pelletier" :generation 3 :sex "male"   :blood-line false :birth 1922 :death 1994}
           {:id 21  :first-name "Geneviéve"       :last-name "Troncy"    :generation 3 :sex "female" :blood-line true  :birth 1923 :death 1925}
           {:id 22  :first-name "Alice"           :last-name "Patay"     :generation 3 :sex "female" :blood-line true  :birth 1924}
           {:id 23  :first-name "Georges"         :last-name "Troncy"    :generation 3 :sex "male"   :blood-line true  :birth 1926 :death 1993}
           {:id 24  :first-name "Pierre"          :last-name "Bonnet"    :generation 3 :sex "male"   :blood-line true  :birth 1927 :death 2008}
           {:id 25  :first-name "Guitou"          :last-name "Taithe"    :generation 3 :sex "female" :blood-line false :birth 1928 :death 2005}
           {:id 26  :first-name "Françoise"       :last-name "Bonnet"    :generation 3 :sex "female" :blood-line true  :birth 1929}
           {:id 27  :first-name "Christiane"      :last-name "Troncy"    :generation 3 :sex "female" :blood-line true  :birth 1929 :death 2014}
           {:id 28  :first-name "André"           :last-name "Troncy"    :generation 3 :sex "male"   :blood-line true  :birth 1933}
           {:id 29  :first-name "Simone"          :last-name "Bourel"    :generation 3 :sex "female" :blood-line false :birth 1936}
           {:id 30  :first-name "Robert"          :last-name "Barrière"  :generation 4 :sex "male"   :blood-line false :birth 1936 :death 1999}
           {:id 31  :first-name "Marie-Suzanne"   :last-name "Saillet"  :generation 3 :sex "female"   :blood-line false :birth 1937}
           {:id 32  :first-name "Jaques"          :last-name "Troncy"    :generation 3 :sex "male"   :blood-line true  :birth 1939}
           {:id 33  :first-name "Françoise"       :last-name "Bonhour"   :generation 3 :sex "female" :blood-line false :birth 1939}
           {:id 34  :first-name "Bernard"         :last-name "Troncy"    :generation 3 :sex "male"   :blood-line true  :birth 1940 :death 1992}
           {:id 35  :first-name "Marie-France"    :last-name "Troncy"    :generation 3 :sex "female" :blood-line true  :birth 1940}
           {:id 36  :first-name "Alain"           :last-name "Bertin"    :generation 4 :sex "male"   :blood-line true  :birth 1940}
           {:id 37  :first-name "Françoise"       :last-name "Jullien"   :generation 4 :sex "female" :blood-line false :birth 1941}
           {:id 38  :first-name "Philippe"        :last-name "Bonin"     :generation 4 :sex "male"   :blood-line false :birth 1941}
           {:id 39  :first-name "Jean-François"   :last-name "Troncy"    :generation 3 :sex "male"   :blood-line true  :birth 1942 :death 1994}
           {:id 40  :first-name "Danielle"        :last-name "Bertin"    :generation 4 :sex "female" :blood-line true  :birth 1943}
           {:id 41  :first-name "Didier"          :last-name "Goudot"    :generation 4 :sex "male"   :blood-line false :birth 1943}
           {:id 42  :first-name "Claude-Henry"    :last-name "Perrin"    :generation 3 :sex "male"   :blood-line false :birth 1943}
           {:id 43  :first-name "Hubert"          :last-name "Troncy"    :generation 3 :sex "male"   :blood-line true  :birth 1945}
           {:id 44  :first-name "Brigitte"        :last-name "Patay"     :generation 4 :sex "female" :blood-line true  :birth 1947}
           {:id 45  :first-name "François"        :last-name "Beaudin"   :generation 4 :sex "male"   :blood-line false :birth 1947 :death 1998}
           {:id 46  :first-name "Maurice"         :last-name "Bertin"    :generation 4 :sex "male"   :blood-line true  :birth 1948 :death 1949}
           {:id 47  :first-name "Marie-Geneviéve" :last-name "Sommer"    :generation 3 :sex "female" :blood-line false :birth 1949}
           {:id 48  :first-name "Catherine"       :last-name "Rodier"    :generation 4 :sex "female" :blood-line true  :birth 1949}
           {:id 49  :first-name "Patrick"         :last-name "Le Blanc"  :generation 4 :sex "female" :blood-line false :birth 1949 :death 2012}
           {:id 50  :first-name "Rosamund"        :last-name "Barnes"    :generation 3 :sex "female" :blood-line false :birth 1951}
           {:id 51  :first-name "Hiroshi"         :last-name "Suzukawa"  :generation 4 :sex "male"   :blood-line false :birth 1951}
           {:id 52  :first-name "Laurence"        :last-name "Dieterlé"  :generation 4 :sex "female" :blood-line true  :birth 1951}
           {:id 53  :first-name "Michel"          :last-name "Patay"     :generation 4 :sex "male"   :blood-line true  :birth 1951}
           {:id 54  :first-name "Cheryl"          :last-name "Olds"      :generation 4 :sex "female" :blood-line false :birth 1951}
           {:id 55  :first-name "Philippe"        :last-name "Rodier"    :generation 4 :sex "male"   :blood-line true  :birth 1952}
           {:id 56  :first-name "Alain"           :last-name "Perret"    :generation 4 :sex "male"   :blood-line false :birth 1952}
           {:id 57  :first-name "Régis"           :last-name "Dieterlé"  :generation 4 :sex "male"   :blood-line true  :birth 1953 :death 1994}
           {:id 58  :first-name "Cécile"          :last-name "Dieterlé"  :generation 4 :sex "female" :blood-line true  :birth 1955}
           {:id 59  :first-name "Fabienne"        :last-name "Bonnet"    :generation 4 :sex "female" :blood-line true  :birth 1957}
           {:id 60  :first-name "Agnés"           :last-name "Dieterlé"  :generation 4 :sex "female" :blood-line true  :birth 1958}
           {:id 61  :first-name "Marie-Delphine"  :last-name "Muzelli"   :generation 4 :sex "female" :blood-line false :birth 1958}
           {:id 62  :first-name "Lionel"          :last-name "Pourtier"  :generation 5 :sex "male"   :blood-line false :birth 1958}
           {:id 63  :first-name "Anne"            :last-name "Chapuis"   :generation 4 :sex "female" :blood-line false :birth 1959}
           {:id 64  :first-name "Marielle"        :last-name "Bonnet"    :generation 4 :sex "female" :blood-line true  :birth 1959}
           {:id 65  :first-name "Jean-Michel"     :last-name "Giraud"    :generation 4 :sex "male"   :blood-line false :birth 1960}
           {:id 66  :first-name "Nadine"          :last-name "Nesme"     :generation 4 :sex "female" :blood-line false :birth 1961}
           {:id 67  :first-name "Chantal"         :last-name "Bonnet"    :generation 4 :sex "female" :blood-line true  :birth 1962}
           {:id 68  :first-name "Christophe"      :last-name "Morin"     :generation 4 :sex "male"   :blood-line false :birth 1963}
           {:id 69  :first-name "Jérôme"          :last-name "Troncy"    :generation 4 :sex "male"   :blood-line true  :birth 1965 :death 1989}
           {:id 70  :first-name "Armelle"         :last-name "Troncy"    :generation 4 :sex "female" :blood-line true  :birth 1967}
           ]
   :links [{:source 1   :target 0   :relation :partner}
           {:source 4   :target 0   :relation :child}
           {:source 4   :target 1   :relation :child}
           {:source 4   :target 2   :relation :partner}
           {:source 5   :target 0   :relation :child}
           {:source 5   :target 1   :relation :child}
           {:source 5   :target 3   :relation :partner}
           {:source 6   :target 0   :relation :child}
           {:source 6   :target 1   :relation :child}
           {:source 7   :target 0   :relation :child}
           {:source 7   :target 1   :relation :child}
           {:source 8   :target 0   :relation :child}
           {:source 8   :target 1   :relation :child}
           {:source 9   :target 7   :relation :partner}
           {:source 10  :target 6   :relation :partner}
           {:source 11  :target 1   :relation :child}
           {:source 11  :target 0   :relation :child}
           {:source 12  :target 11  :relation :partner}
           {:source 13  :target 8   :relation :partner}
           {:source 16  :target 4   :relation :child}
           {:source 16  :target 2   :relation :child}
           {:source 16  :target 14   :relation :partner}
           {:source 18  :target 4   :relation :child}
           {:source 18  :target 2   :relation :child}
           {:source 19  :target 18  :relation :partner}
           {:source 21  :target 6   :relation :child}
           {:source 21  :target 10  :relation :child}
           {:source 22  :target 4   :relation :child}
           {:source 22  :target 2   :relation :child}
           {:source 22  :target 15  :relation :partner}
           {:source 23  :target 6   :relation :child}
           {:source 23  :target 10  :relation :child}
           {:source 24  :target 3   :relation :child}
           {:source 24  :target 5   :relation :child}
           {:source 25  :target 24  :relation :partner}
           {:source 26  :target 3   :relation :child}
           {:source 26  :target 5   :relation :child}
           {:source 26  :target 20  :relation :partner}
           {:source 27  :target 6   :relation :child}
           {:source 27  :target 10  :relation :child}
           {:source 27  :target 17  :relation :partner}
           {:source 28  :target 8   :relation :child}
           {:source 28  :target 13  :relation :child}
           {:source 29  :target 28  :relation :partner}
           {:source 31  :target 23  :relation :partner}
           {:source 32  :target 11  :relation :child}
           {:source 32  :target 12  :relation :child}
           {:source 34  :target 11  :relation :child}
           {:source 34  :target 12  :relation :child}
           {:source 34  :target 33  :relation :partner}
           {:source 35  :target 6   :relation :child}
           {:source 35  :target 10  :relation :child}
           {:source 36  :target 14  :relation :child}
           {:source 36  :target 16  :relation :child}
           {:source 37  :target 36  :relation :partner}
           {:source 39  :target 11  :relation :child}
           {:source 39  :target 12  :relation :child}
           {:source 40  :target 14  :relation :child}
           {:source 40  :target 16  :relation :child}
           {:source 40  :target 38  :relation :partner}
           {:source 42  :target 35  :relation :partner}
           {:source 43  :target 11  :relation :child}
           {:source 43  :target 12  :relation :child}
           {:source 44  :target 18  :relation :child}
           {:source 44  :target 19  :relation :child}
           {:source 44  :target 41  :relation :partner}
           {:source 44  :target 41  :relation :partner}
           {:source 46  :target 14  :relation :child}
           {:source 46  :target 16  :relation :child}
           {:source 47  :target 32  :relation :partner}
           {:source 48  :target 15  :relation :child}
           {:source 48  :target 22  :relation :child}
           {:source 48  :target 30  :relation :partner}
           {:source 50  :target 43  :relation :partner}
           {:source 52  :target 17  :relation :child}
           {:source 52  :target 27  :relation :child}
           {:source 52  :target 49  :relation :partner}
           {:source 53  :target 18  :relation :child}
           {:source 53  :target 19  :relation :child}
           {:source 54  :target 53  :relation :partner}
           {:source 55  :target 15  :relation :child}
           {:source 55  :target 22  :relation :child}
           {:source 57  :target 17  :relation :child}
           {:source 57  :target 27  :relation :child}
           {:source 58  :target 17  :relation :child}
           {:source 58  :target 27  :relation :child}
           {:source 58  :target 45  :relation :partner}
           {:source 59  :target 24  :relation :child}
           {:source 59  :target 25  :relation :child}
           {:source 59  :target 56  :relation :partner}
           {:source 60  :target 17  :relation :child}
           {:source 60  :target 27  :relation :child}
           {:source 60  :target 51  :relation :partner}
           {:source 61  :target 57  :relation :partner}
           {:source 63  :target 55  :relation :partner}
           {:source 64  :target 24  :relation :child}
           {:source 64  :target 25  :relation :child}
           {:source 65  :target 64  :relation :partner}
           {:source 66  :target 53  :relation :partner}
           {:source 67  :target 24  :relation :child}
           {:source 67  :target 25  :relation :child}
           {:source 69  :target 28  :relation :child}
           {:source 69  :target 29  :relation :child}
           {:source 70  :target 23  :relation :child}
           {:source 70  :target 31  :relation :child}
           ]})
