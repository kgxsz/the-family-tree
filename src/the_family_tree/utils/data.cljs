(ns the-family-tree.utils.data)

(def members
  [{:name "André"           :family "Troncy"      :generation 1 :sex "male"   :blood-line true  :birth 1859 :death 1931}
   {:name "Francine"        :family "Valli"       :generation 1 :sex "female" :blood-line false :birth 1872 :death 1954}
   {:name "Charles"         :family "Patay"       :generation 2 :sex "male"   :blood-line false :birth 1884 :death 1959}
   {:name "Francois"        :family "Bonnet"      :generation 2 :sex "male"   :blood-line false :birth 1884 :death 1970}
   {:name "Jeanne"          :family "Troncy"      :generation 2 :sex "female" :blood-line true  :birth 1894 :death 1979}
   {:name "Claudia"         :family "Troncy"      :generation 2 :sex "female" :blood-line true  :birth 1895 :death 1968}
   {:name "Maurice"         :family "Troncy"      :generation 2 :sex "male"   :blood-line true  :birth 1896 :death 1942}
   {:name "Gustave"         :family "Troncy"      :generation 2 :sex "male"   :blood-line true  :birth 1898 :death 1972}
   {:name "Claude"          :family "Troncy"      :generation 2 :sex "male"   :blood-line true  :birth 1900 :death 1964}
   {:name "Madeleine"       :family "Galtier"     :generation 2 :sex "female" :blood-line false :birth 1900 :death 1983}
   {:name "Marcelle"        :family "Desrayaud"   :generation 2 :sex "female" :blood-line false :birth 1901 :death 1966}
   {:name "Robert"          :family "Troncy"      :generation 2 :sex "male"   :blood-line true  :birth 1902 :death 1959}
   {:name "Renée"           :family "Pointet"     :generation 2 :sex "female" :blood-line false :birth 1907 :death 2000}
   {:name "Elisabeth"       :family "de Veron"    :generation 2 :sex "female" :blood-line false :birth 1909 :death 1994}
   {:name "Albert"          :family "Bertin"      :generation 3 :sex "male"   :blood-line false :birth 1914 :death 1997}
   {:name "Marcel"          :family "Rodier"      :generation 3 :sex "male"   :blood-line false :birth 1916 :death 2004}
   {:name "Simone"          :family "Patay"       :generation 3 :sex "female" :blood-line true  :birth 1917 :death 2000}
   {:name "Roger"           :family "Dieterlé"    :generation 3 :sex "male"   :blood-line false :birth 1917 :death 1990}
   {:name "André"           :family "Patay"       :generation 3 :sex "male"   :blood-line true  :birth 1919 :death 1995}
   {:name "Denise"          :family "Morel"       :generation 3 :sex "female" :blood-line false :birth 1922}
   {:name "Jean"            :family "Pelletier"   :generation 3 :sex "male"   :blood-line false :birth 1922 :death 1994}
   {:name "Geneviéve"       :family "Troncy"      :generation 3 :sex "female" :blood-line true  :birth 1923 :death 1925}
   {:name "Alice"           :family "Patay"       :generation 3 :sex "female" :blood-line true  :birth 1924}
   {:name "Georges"         :family "Troncy"      :generation 3 :sex "male"   :blood-line true  :birth 1926 :death 1993}
   {:name "Pierre"          :family "Bonnet"      :generation 3 :sex "male"   :blood-line true  :birth 1927 :death 2008}
   {:name "Guitou"          :family "Taithe"      :generation 3 :sex "female" :blood-line false :birth 1928 :death 2005}
   {:name "Françoise"       :family "Bonnet"      :generation 3 :sex "female" :blood-line true  :birth 1929}
   {:name "Christiane"      :family "Troncy"      :generation 3 :sex "female" :blood-line true  :birth 1929 :death 2014}
   {:name "André"           :family "Troncy"      :generation 3 :sex "male"   :blood-line true  :birth 1933}
   {:name "Simone"          :family "Bourel"      :generation 3 :sex "female" :blood-line false :birth 1936}
   {:name "Robert"          :family "Barrière"    :generation 4 :sex "male"   :blood-line false :birth 1936 :death 1999}
   {:name "Marie-Suzanne"   :family "Saillet"     :generation 3 :sex "female" :blood-line false :birth 1937}
   {:name "Jaques"          :family "Troncy"      :generation 3 :sex "male"   :blood-line true  :birth 1939}
   {:name "Françoise"       :family "Bonhour"     :generation 3 :sex "female" :blood-line false :birth 1939}
   {:name "Bernard"         :family "Troncy"      :generation 3 :sex "male"   :blood-line true  :birth 1940 :death 1992}
   {:name "Marie-France"    :family "Troncy"      :generation 3 :sex "female" :blood-line true  :birth 1940}
   {:name "Alain"           :family "Bertin"      :generation 4 :sex "male"   :blood-line true  :birth 1940}
   {:name "Françoise"       :family "Jullien"     :generation 4 :sex "female" :blood-line false :birth 1941}
   {:name "Philippe"        :family "Bonin"       :generation 4 :sex "male"   :blood-line false :birth 1941}
   {:name "Jean-François"   :family "Troncy"      :generation 3 :sex "male"   :blood-line true  :birth 1942 :death 1994}
   {:name "Danielle"        :family "Bertin"      :generation 4 :sex "female" :blood-line true  :birth 1943}
   {:name "Didier"          :family "Goudot"      :generation 4 :sex "male"   :blood-line false :birth 1943}
   {:name "Claude-Henry"    :family "Perrin"      :generation 3 :sex "male"   :blood-line false :birth 1943}
   {:name "Hubert"          :family "Troncy"      :generation 3 :sex "male"   :blood-line true  :birth 1945}
   {:name "Brigitte"        :family "Patay"       :generation 4 :sex "female" :blood-line true  :birth 1947}
   {:name "François"        :family "Beaudin"     :generation 4 :sex "male"   :blood-line false :birth 1947 :death 1998}
   {:name "Maurice"         :family "Bertin"      :generation 4 :sex "male"   :blood-line true  :birth 1948 :death 1949}
   {:name "Marie-Geneviéve" :family "Sommer"      :generation 3 :sex "female" :blood-line false :birth 1949}
   {:name "Catherine"       :family "Rodier"      :generation 4 :sex "female" :blood-line true  :birth 1949}
   {:name "Patrick"         :family "Le Blanc"    :generation 4 :sex "female" :blood-line false :birth 1949 :death 2012}
   {:name "Rosamund"        :family "Barnes"      :generation 3 :sex "female" :blood-line false :birth 1951}
   {:name "Hiroshi"         :family "Suzukawa"    :generation 4 :sex "male"   :blood-line false :birth 1951}
   {:name "Laurence"        :family "Dieterlé"    :generation 4 :sex "female" :blood-line true  :birth 1951}
   {:name "Michel"          :family "Patay"       :generation 4 :sex "male"   :blood-line true  :birth 1951}
   {:name "Cheryl"          :family "Olds"        :generation 4 :sex "female" :blood-line false :birth 1951}
   {:name "Philippe"        :family "Rodier"      :generation 4 :sex "male"   :blood-line true  :birth 1952}
   {:name "Alain"           :family "Perret"      :generation 4 :sex "male"   :blood-line false :birth 1952}
   {:name "Régis"           :family "Dieterlé"    :generation 4 :sex "male"   :blood-line true  :birth 1953 :death 1994}
   {:name "Cécile"          :family "Dieterlé"    :generation 4 :sex "female" :blood-line true  :birth 1955}
   {:name "Fabienne"        :family "Bonnet"      :generation 4 :sex "female" :blood-line true  :birth 1957}
   {:name "Agnés"           :family "Dieterlé"    :generation 4 :sex "female" :blood-line true  :birth 1958}
   {:name "Marie-Delphine"  :family "Muzelli"     :generation 4 :sex "female" :blood-line false :birth 1958}
   {:name "Lionel"          :family "Pourtier"    :generation 5 :sex "male"   :blood-line false :birth 1958}
   {:name "Anne"            :family "Chapuis"     :generation 4 :sex "female" :blood-line false :birth 1959}
   {:name "Marielle"        :family "Bonnet"      :generation 4 :sex "female" :blood-line true  :birth 1959}
   {:name "Jean-Michel"     :family "Giraud"      :generation 4 :sex "male"   :blood-line false :birth 1960}
   {:name "Nadine"          :family "Nesme"       :generation 4 :sex "female" :blood-line false :birth 1961}
   {:name "Chantal"         :family "Bonnet"      :generation 4 :sex "female" :blood-line true  :birth 1962}
   {:name "Christophe"      :family "Morin"       :generation 5 :sex "male"   :blood-line false :birth 1963}
   {:name "Jérôme"          :family "Troncy"      :generation 4 :sex "male"   :blood-line true  :birth 1965 :death 1989}
   {:name "Laurence"        :family "Bertin"      :generation 5 :sex "female" :blood-line true  :birth 1966}
   {:name "Franck"          :family "Bonin"       :generation 5 :sex "male"   :blood-line true  :birth 1966}
   {:name "Armelle"         :family "Troncy"      :generation 4 :sex "female" :blood-line true  :birth 1967}
   {:name "Isabelle"        :family "Chapuzet"    :generation 5 :sex "female" :blood-line false :birth 1967}
   {:name "Béatrice"        :family "Abadie"      :generation 4 :sex "female" :blood-line false :birth 1967}
   {:name "Frédéric"        :family "Bertin"      :generation 5 :sex "male"   :blood-line true  :birth 1968}
   {:name "Jean-Marc"       :family "Faivre"      :generation 4 :sex "male"   :blood-line false :birth 1968}
   {:name "Erwan"           :family "Le Mintier"  :generation 5 :sex "male"   :blood-line false :birth 1968}
   {:name "Emmanuel"        :family "Perrin"      :generation 4 :sex "male"   :blood-line true  :birth 1968}
   {:name "Fabrice"         :family "Bonin"       :generation 5 :sex "male"   :blood-line true  :birth 1968}
   {:name "Antoine"         :family "Troncy"      :generation 4 :sex "male"   :blood-line true  :birth 1969}
   {:name "Laurence"        :family "Sadoux"      :generation 4 :sex "female" :blood-line false :birth 1969}
   {:name "Alexandre"       :family "Perrin"      :generation 4 :sex "male"   :blood-line true  :birth 1969}
   {:name "Françoise"       :family "Cottin"      :generation 5 :sex "female" :blood-line false :birth 1969}
   {:name "Nicolas"         :family "Bonin"       :generation 5 :sex "male"   :blood-line true  :birth 1970}
   {:name "Anne-Laurie"     :family "Troncy"      :generation 4 :sex "female" :blood-line true  :birth 1971}
   {:name "Clémentine"      :family "Labaty"      :generation 4 :sex "female" :blood-line false :birth 1971}
   {:name "Sophie"          :family "Jullat"      :generation 4 :sex "female" :blood-line false :birth 1971}
   {:name "Anne"            :family "Bertin"      :generation 5 :sex "female" :blood-line true  :birth 1971}
   {:name "Charles-Eric"    :family "Bonin"       :generation 5 :sex "male"   :blood-line true  :birth 1972 :death 1972}
   {:name "Marianne"        :family "Goudot"      :generation 5 :sex "female" :blood-line true  :birth 1972}
   {:name "Vanessa"         :family "Lebon"       :generation 5 :sex "female" :blood-line false :birth 1973}
   {:name "Xavier"          :family "Bertin"      :generation 5 :sex "male"   :blood-line true  :birth 1974}
   {:name "Valentine"       :family "Le Blanc"    :generation 5 :sex "female" :blood-line true  :birth 1974}
   {:name "Bruno"           :family "Cheilan"     :generation 5 :sex "male"   :blood-line false :birth 1974}
   {:name "Matthieu"        :family "Maria"       :generation 5 :sex "male"   :blood-line false :birth 1974}
   {:name "Julia"           :family "Goudot"      :generation 5 :sex "female" :blood-line true  :birth 1975}
   {:name "Michaël"         :family "Calatraba"   :generation 5 :sex "male"   :blood-line false :birth 1975}
   {:name "Christelle"      :family "Troncy"      :generation 4 :sex "female" :blood-line true  :birth 1975}
   {:name "Valérie"         :family "Barrière"    :generation 5 :sex "female" :blood-line true  :birth 1976 :death 1982}
   {:name "Aurélie"         :family "Le Blanc"    :generation 5 :sex "female" :blood-line true  :birth 1976}
   {:name "Cyril"           :family "Troncy"      :generation 4 :sex "male"   :blood-line true  :birth 1976}
   {:name "Camilla"         :family "Maggialetti" :generation 4 :sex "female" :blood-line false :birth 1976}
   {:name "Guilhem"         :family "Troncy"      :generation 4 :sex "male"   :blood-line true  :birth 1976}
   {:name "Pierrick"        :family "Wolff"       :generation 5 :sex "male"   :blood-line false :birth 1977}
   {:name "Maud"            :family "Russo"       :generation 4 :sex "female" :blood-line false :birth 1977}
   {:name "Anne-Claire"     :family "Antoni"      :generation 4 :sex "female" :blood-line false :birth 1977}
   {:name "Mathieu"         :family "Beaudin"     :generation 5 :sex "male"   :blood-line true  :birth 1978}
   {:name "Sandrine"        :family "Barrière"    :generation 5 :sex "female" :blood-line true  :birth 1979}
   {:name "Mélanie"         :family "Beaudin"     :generation 5 :sex "female" :blood-line true  :birth 1980}
   {:name "Cédric"          :family "Troncy"      :generation 4 :sex "male"   :blood-line true  :birth 1980}
   {:name "Romain"          :family "Troncy"      :generation 4 :sex "male"   :blood-line true  :birth 1980}
   {:name "Oliver"          :family "Gaillet"     :generation 5 :sex "male"   :blood-line false :birth 1981}
   {:name "Eric"            :family "Barrière"    :generation 5 :sex "male"   :blood-line true  :birth 1982}
   {:name "Alice"           :family "Beaudin"     :generation 5 :sex "female" :blood-line true  :birth 1982}
   {:name "Didier"          :family "Troncy"      :generation 4 :sex "male"   :blood-line true  :birth 1982}
   {:name "Olivier"         :family "Troncy"      :generation 4 :sex "male"   :blood-line true  :birth 1982}
   {:name "Thibault"        :family "Dieterlé"    :generation 5 :sex "male"   :blood-line true  :birth 1984}
   {:name "Leïla"           :family "Suzukawa"    :generation 5 :sex "female" :blood-line true  :birth 1984}
   {:name "Anne-Sophie"     :family "Cappio"      :generation 5 :sex "female" :blood-line false :birth 1985}
   {:name "Caroline"        :family "Rodier"      :generation 5 :sex "female" :blood-line true  :birth 1985}
   {:name "Marine"          :family "Faivre"      :generation 5 :sex "female" :blood-line true  :birth 1986}
   {:name "Johanna"         :family "Viosi"       :generation 5 :sex "female" :blood-line false :birth 1986}
   {:name "Clément"         :family "Beaudin"     :generation 5 :sex "male"   :blood-line true  :birth 1986}
   {:name "Pierre"          :family "Troncy"      :generation 4 :sex "male"   :blood-line true  :birth 1986}
   {:name "Keigo"           :family "Suzukawa"    :generation 5 :sex "male"   :blood-line true  :birth 1986}
   {:name "Laetitia"        :family "Rodier"      :generation 5 :sex "female" :blood-line true  :birth 1987}
   {:name "Grégoire"        :family "Giraud"      :generation 5 :sex "male"   :blood-line true  :birth 1987}
   {:name "Vincent"         :family "Pourtier"    :generation 6 :sex "male"   :blood-line true  :birth 1988}
   {:name "Kaya"            :family "Suzukawa"    :generation 5 :sex "female" :blood-line true  :birth 1988}
   {:name "Blandine"        :family "Patay"       :generation 5 :sex "female" :blood-line true  :birth 1989}
   {:name "Charles-Henry"   :family "Rodier"      :generation 5 :sex "male"   :blood-line true  :birth 1989}
   {:name "Henry"           :family "Perret"      :generation 5 :sex "male"   :blood-line true  :birth 1989}
   {:name "Charles"         :family "Patay"       :generation 5 :sex "male"   :blood-line true  :birth 1990}
   {:name "Hubert"          :family "Giraud"      :generation 5 :sex "male"   :blood-line true  :birth 1990}
   {:name "Pierre"          :family "Pourtier"    :generation 6 :sex "male"   :blood-line true  :birth 1991}
   {:name "Marine"          :family "Troncy"      :generation 4 :sex "female" :blood-line true  :birth 1991}
   {:name "Jean"            :family "Pourtier"    :generation 6 :sex "male"   :blood-line true  :birth 1992}
   {:name "Alix"            :family "Perret"      :generation 5 :sex "male"   :blood-line true  :birth 1992}
   {:name "Ségolène"        :family "Giraud"      :generation 5 :sex "female" :blood-line true  :birth 1992}
   {:name "Armelle"         :family "Perret"      :generation 5 :sex "female" :blood-line true  :birth 1994}
   {:name "Charlotte"       :family "Faivre"      :generation 5 :sex "female" :blood-line true  :birth 1994}
   {:name "Emilie"          :family "Bertin"      :generation 6 :sex "female" :blood-line true  :birth 1995}
   {:name "Mathilde"        :family "Perrin"      :generation 5 :sex "female" :blood-line true  :birth 1996}
   {:name "Valérie"         :family "Pourtier"    :generation 6 :sex "female" :blood-line true  :birth 1997}
   {:name "Prune"           :family "Faivre"      :generation 5 :sex "female" :blood-line true  :birth 1997}
   {:name "Alexandre"       :family "Bertin"      :generation 6 :sex "male"   :blood-line true  :birth 1998}
   {:name "Romain"          :family "Bonin"       :generation 6 :sex "male"   :blood-line true  :birth 1999}
   {:name "Florian"         :family "Morin"       :generation 6 :sex "male"   :blood-line true  :birth 2001}
   {:name "Pauline"         :family "Bonin"       :generation 6 :sex "female" :blood-line true  :birth 2001}
   {:name "Mathis"          :family "Perrin"      :generation 5 :sex "male"   :blood-line true  :birth 2001}
   {:name "Idriss-Valentin" :family "Bonin"       :generation 6 :sex "female" :blood-line true  :birth 2002}
   {:name "Louis"           :family "Troncy"      :generation 5 :sex "male"   :blood-line true  :birth 2002}
   {:name "Ambre"           :family "Bonin"       :generation 6 :sex "male"   :blood-line true  :birth 2004}
   {:name "Sébastien"       :family "Troncy"      :generation 5 :sex "male"   :blood-line true  :birth 2004}
   {:name "Gabrielle"       :family "Cheilan"     :generation 6 :sex "female" :blood-line true  :birth 2005}
   {:name "Aymeric"         :family "Le Mintier"  :generation 6 :sex "male"   :blood-line true  :birth 2005}
   {:name "Clémence"        :family "Troncy"      :generation 5 :sex "female" :blood-line true  :birth 2005}
   {:name "Louna"           :family "Perrin"      :generation 5 :sex "male"   :blood-line true  :birth 2005}
   {:name "Lucas"           :family "Morin"       :generation 6 :sex "male"   :blood-line true  :birth 2006}
   {:name "Julien"          :family "Bonin"       :generation 6 :sex "male"   :blood-line true  :birth 2006}
   {:name "Guillaume"       :family "Troncy"      :generation 5 :sex "male"   :blood-line true  :birth 2006}
   {:name "Eva"             :family "Perrin"      :generation 5 :sex "female" :blood-line true  :birth 2006}
   {:name "Milo"            :family "Perrin"      :generation 5 :sex "male"   :blood-line true  :birth 2006}
   {:name "Jeanne"          :family "Le Mintier"  :generation 6 :sex "female" :blood-line true  :birth 2007}
   {:name "Robin"           :family "Cheilan"     :generation 6 :sex "male"   :blood-line true  :birth 2007}
   {:name "Lola"            :family "Morin"       :generation 6 :sex "female" :blood-line true  :birth 2008}
   {:name "Hanaé"           :family "Bonin"       :generation 6 :sex "female" :blood-line true  :birth 2009}
   {:name "Clara"           :family "Le Mintier"  :generation 6 :sex "female" :blood-line true  :birth 2009}
   {:name "Charles"         :family "Troncy"      :generation 5 :sex "male"   :blood-line true  :birth 2009}
   {:name "Balian"          :family "Perrin"      :generation 5 :sex "male"   :blood-line true  :birth 2009}
   {:name "Simon"           :family "Wolff"       :generation 6 :sex "male"   :blood-line true  :birth 2010}
   {:name "Nell"            :family "Calatraba"   :generation 6 :sex "female" :blood-line true  :birth 2010}
   {:name "Caroline"        :family "Bonin"       :generation 6 :sex "female" :blood-line true  :birth 2011}
   {:name "Augustin"        :family "Gaillet"     :generation 6 :sex "male"   :blood-line true  :birth 2011}
   {:name "Loïse"           :family "Maria"       :generation 6 :sex "female" :blood-line true  :birth 2011}
   {:name "Mathilde"        :family "Troncy"      :generation 5 :sex "female" :blood-line true  :birth 2012}
   {:name "Lenny"           :family "Dieterlé"    :generation 6 :sex "male"   :blood-line true  :birth 2014}
   {:name "Gaspard"         :family "Maria"       :generation 6 :sex "male"   :blood-line true  :birth 2015}])

(def relations
  [{:source 1   :target 0   :type "partner" :family "Troncy"}
   {:source 4   :target 0   :type "child"   :family "Troncy"}
   {:source 4   :target 1   :type "child"   :family "Troncy"}
   {:source 4   :target 2   :type "partner" :family "Patay"}
   {:source 5   :target 0   :type "child"   :family "Troncy"}
   {:source 5   :target 1   :type "child"   :family "Troncy"}
   {:source 5   :target 3   :type "partner" :family "Bonnet"}
   {:source 6   :target 0   :type "child"   :family "Troncy"}
   {:source 6   :target 1   :type "child"   :family "Troncy"}
   {:source 7   :target 0   :type "child"   :family "Troncy"}
   {:source 7   :target 1   :type "child"   :family "Troncy"}
   {:source 8   :target 0   :type "child"   :family "Troncy"}
   {:source 8   :target 1   :type "child"   :family "Troncy"}
   {:source 9   :target 7   :type "partner" :family "Troncy"}
   {:source 10  :target 6   :type "partner" :family "Troncy"}
   {:source 11  :target 1   :type "child"   :family "Troncy"}
   {:source 11  :target 0   :type "child"   :family "Troncy"}
   {:source 12  :target 11  :type "partner" :family "Troncy"}
   {:source 13  :target 8   :type "partner" :family "Troncy"}
   {:source 16  :target 4   :type "child"   :family "Patay"}
   {:source 16  :target 2   :type "child"   :family "Patay"}
   {:source 16  :target 14  :type "partner" :family "Bertin"}
   {:source 18  :target 4   :type "child"   :family "Patay"}
   {:source 18  :target 2   :type "child"   :family "Patay"}
   {:source 19  :target 18  :type "partner" :family "Patay"}
   {:source 21  :target 6   :type "child"   :family "Troncy"}
   {:source 21  :target 10  :type "child"   :family "Troncy"}
   {:source 22  :target 4   :type "child"   :family "Patay"}
   {:source 22  :target 2   :type "child"   :family "Patay"}
   {:source 22  :target 15  :type "partner" :family "Rodier"}
   {:source 23  :target 6   :type "child"   :family "Troncy"}
   {:source 23  :target 10  :type "child"   :family "Troncy"}
   {:source 24  :target 3   :type "child"   :family "Bonnet"}
   {:source 24  :target 5   :type "child"   :family "Bonnet"}
   {:source 25  :target 24  :type "partner" :family "Bonnet"}
   {:source 26  :target 3   :type "child"   :family "Bonnet"}
   {:source 26  :target 5   :type "child"   :family "Bonnet"}
   {:source 26  :target 20  :type "partner" :family "Pelletier"}
   {:source 27  :target 6   :type "child"   :family "Troncy"}
   {:source 27  :target 10  :type "child"   :family "Troncy"}
   {:source 27  :target 17  :type "partner" :family "Dieterlé"}
   {:source 28  :target 8   :type "child"   :family "Troncy"}
   {:source 28  :target 13  :type "child"   :family "Troncy"}
   {:source 29  :target 28  :type "partner" :family "Troncy"}
   {:source 31  :target 23  :type "partner" :family "Troncy"}
   {:source 32  :target 11  :type "child"   :family "Troncy"}
   {:source 32  :target 12  :type "child"   :family "Troncy"}
   {:source 34  :target 11  :type "child"   :family "Troncy"}
   {:source 34  :target 12  :type "child"   :family "Troncy"}
   {:source 34  :target 33  :type "partner" :family "Troncy"}
   {:source 35  :target 6   :type "child"   :family "Troncy"}
   {:source 35  :target 10  :type "child"   :family "Troncy"}
   {:source 36  :target 14  :type "child"   :family "Bertin"}
   {:source 36  :target 16  :type "child"   :family "Bertin"}
   {:source 37  :target 36  :type "partner" :family "Bertin"}
   {:source 39  :target 11  :type "child"   :family "Troncy"}
   {:source 39  :target 12  :type "child"   :family "Troncy"}
   {:source 40  :target 14  :type "child"   :family "Bertin"}
   {:source 40  :target 16  :type "child"   :family "Bertin"}
   {:source 40  :target 38  :type "partner" :family "Bonin"}
   {:source 42  :target 35  :type "partner" :family "Perrin"}
   {:source 43  :target 11  :type "child"   :family "Troncy"}
   {:source 43  :target 12  :type "child"   :family "Troncy"}
   {:source 44  :target 18  :type "child"   :family "Patay"}
   {:source 44  :target 19  :type "child"   :family "Patay"}
   {:source 44  :target 41  :type "partner" :family "Goudot"}
   {:source 46  :target 14  :type "child"   :family "Bertin"}
   {:source 46  :target 16  :type "child"   :family "Bertin"}
   {:source 47  :target 32  :type "partner" :family "Troncy"}
   {:source 48  :target 15  :type "child"   :family "Rodier"}
   {:source 48  :target 22  :type "child"   :family "Rodier"}
   {:source 48  :target 30  :type "partner" :family "Barrière"}
   {:source 50  :target 43  :type "partner" :family "Troncy"}
   {:source 52  :target 17  :type "child"   :family "Dieterlé"}
   {:source 52  :target 27  :type "child"   :family "Dieterlé"}
   {:source 52  :target 49  :type "partner" :family "Le Blanc"}
   {:source 53  :target 18  :type "child"   :family "Patay"}
   {:source 53  :target 19  :type "child"   :family "Patay"}
   {:source 54  :target 53  :type "partner" :family "Patay"}
   {:source 55  :target 15  :type "child"   :family "Rodier"}
   {:source 55  :target 22  :type "child"   :family "Rodier"}
   {:source 57  :target 17  :type "child"   :family "Dieterlé"}
   {:source 57  :target 27  :type "child"   :family "Dieterlé"}
   {:source 58  :target 17  :type "child"   :family "Dieterlé"}
   {:source 58  :target 27  :type "child"   :family "Dieterlé"}
   {:source 58  :target 45  :type "partner" :family "Beaudin"}
   {:source 59  :target 24  :type "child"   :family "Bonnet"}
   {:source 59  :target 25  :type "child"   :family "Bonnet"}
   {:source 59  :target 56  :type "partner" :family "Perret"}
   {:source 60  :target 17  :type "child"   :family "Dieterlé"}
   {:source 60  :target 27  :type "child"   :family "Dieterlé"}
   {:source 60  :target 51  :type "partner" :family "Suzukawa"}
   {:source 61  :target 57  :type "partner" :family "Dieterlé"}
   {:source 63  :target 55  :type "partner" :family "Rodier"}
   {:source 64  :target 24  :type "child"   :family "Bonnet"}
   {:source 64  :target 25  :type "child"   :family "Bonnet"}
   {:source 65  :target 64  :type "partner" :family "Giraud"}
   {:source 66  :target 53  :type "partner" :family "Patay"}
   {:source 67  :target 24  :type "child"   :family "Bonnet"}
   {:source 67  :target 25  :type "child"   :family "Bonnet"}
   {:source 69  :target 28  :type "child"   :family "Troncy"}
   {:source 69  :target 29  :type "child"   :family "Troncy"}
   {:source 70  :target 36  :type "child"   :family "Bertin"}
   {:source 70  :target 37  :type "child"   :family "Bertin"}
   {:source 70  :target 62  :type "partner" :family "Pourtier"}
   {:source 71  :target 38  :type "child"   :family "Bonin"}
   {:source 71  :target 40  :type "child"   :family "Bonin"}
   {:source 72  :target 23  :type "child"   :family "Troncy"}
   {:source 72  :target 31  :type "child"   :family "Troncy"}
   {:source 75  :target 36  :type "child"   :family "Bertin"}
   {:source 75  :target 37  :type "child"   :family "Bertin"}
   {:source 75  :target 73  :type "partner" :family "Bertin"}
   {:source 76  :target 72  :type "partner" :family "Faivre"}
   {:source 78  :target 35  :type "child"   :family "Perrin"}
   {:source 78  :target 42  :type "child"   :family "Perrin"}
   {:source 78  :target 74  :type "partner" :family "Perrin"}
   {:source 79  :target 38  :type "child"   :family "Bonin"}
   {:source 79  :target 40  :type "child"   :family "Bonin"}
   {:source 79  :target 83  :type "partner" :family "Bonin"}
   {:source 80  :target 23  :type "child"   :family "Troncy"}
   {:source 80  :target 31  :type "child"   :family "Troncy"}
   {:source 81  :target 80  :type "partner" :family "Troncy"}
   {:source 82  :target 35  :type "child"   :family "Perrin"}
   {:source 82  :target 42  :type "child"   :family "Perrin"}
   {:source 84  :target 38  :type "child"   :family "Bonin"}
   {:source 84  :target 40  :type "child"   :family "Bonin"}
   {:source 85  :target 28  :type "child"   :family "Troncy"}
   {:source 85  :target 29  :type "child"   :family "Troncy"}
   {:source 86  :target 78  :type "partner" :family "Perrin"}
   {:source 87  :target 82  :type "partner" :family "Perrin"}
   {:source 88  :target 36  :type "child"   :family "Bertin"}
   {:source 88  :target 37  :type "child"   :family "Bertin"}
   {:source 88  :target 68  :type "partner" :family "Morin"}
   {:source 89  :target 38  :type "child"   :family "Bonin"}
   {:source 89  :target 40  :type "child"   :family "Bonin"}
   {:source 90  :target 41  :type "child"   :family "Goudot"}
   {:source 90  :target 44  :type "child"   :family "Goudot"}
   {:source 91  :target 84  :type "partner" :family "Bonin"}
   {:source 92  :target 36  :type "child"   :family "Bertin"}
   {:source 92  :target 37  :type "child"   :family "Bertin"}
   {:source 93  :target 49  :type "child"   :family "Le Blanc"}
   {:source 93  :target 52  :type "child"   :family "Le Blanc"}
   {:source 93  :target 77  :type "partner" :family "Le Mintier"}
   {:source 96  :target 41  :type "child"   :family "Goudot"}
   {:source 96  :target 44  :type "child"   :family "Goudot"}
   {:source 98  :target 32  :type "child"   :family "Troncy"}
   {:source 98  :target 47  :type "child"   :family "Troncy"}
   {:source 99  :target 30  :type "child"   :family "Barrière"}
   {:source 99  :target 48  :type "child"   :family "Barrière"}
   {:source 100 :target 49  :type "child"   :family "Le Blanc"}
   {:source 100 :target 52  :type "child"   :family "Le Blanc"}
   {:source 101 :target 32  :type "child"   :family "Troncy"}
   {:source 101 :target 47  :type "child"   :family "Troncy"}
   {:source 102 :target 101 :type "partner" :family "Troncy"}
   {:source 103 :target 33  :type "child"   :family "Troncy"}
   {:source 103 :target 34  :type "child"   :family "Troncy"}
   {:source 104 :target 96  :type "partner" :family "Wolff"}
   {:source 105 :target 103 :type "partner" :family "Troncy"}
   {:source 106 :target 82  :type "partner" :family "Perrin"}
   {:source 107 :target 45  :type "child"   :family "Beaudin"}
   {:source 107 :target 58  :type "child"   :family "Beaudin"}
   {:source 108 :target 30  :type "child"   :family "Barrière"}
   {:source 108 :target 48  :type "child"   :family "Barrière"}
   {:source 108 :target 97  :type "partner" :family "Calatraba"}
   {:source 109 :target 45  :type "child"   :family "Beaudin"}
   {:source 109 :target 58  :type "child"   :family "Beaudin"}
   {:source 109 :target 94  :type "partner" :family "Cheilan"}
   {:source 110 :target 32  :type "child"   :family "Troncy"}
   {:source 110 :target 47  :type "child"   :family "Troncy"}
   {:source 111 :target 43  :type "child"   :family "Troncy"}
   {:source 111 :target 50  :type "child"   :family "Troncy"}
   {:source 113 :target 30  :type "child"   :family "Barrière"}
   {:source 113 :target 48  :type "child"   :family "Barrière"}
   {:source 114 :target 45  :type "child"   :family "Beaudin"}
   {:source 114 :target 58  :type "child"   :family "Beaudin"}
   {:source 114 :target 95  :type "partner" :family "Maria"}
   {:source 115 :target 32  :type "child"   :family "Troncy"}
   {:source 115 :target 47  :type "child"   :family "Troncy"}
   {:source 116 :target 43  :type "child"   :family "Troncy"}
   {:source 116 :target 50  :type "child"   :family "Troncy"}
   {:source 117 :target 57  :type "child"   :family "Dieterlé"}
   {:source 117 :target 61  :type "child"   :family "Dieterlé"}
   {:source 118 :target 51  :type "child"   :family "Suzukawa"}
   {:source 118 :target 60  :type "child"   :family "Suzukawa"}
   {:source 119 :target 71  :type "partner" :family "Bonin"}
   {:source 120 :target 55  :type "child"   :family "Rodier"}
   {:source 120 :target 63  :type "child"   :family "Rodier"}
   {:source 120 :target 112 :type "partner" :family "Gaillet"}
   {:source 121 :target 72  :type "child"   :family "Faivre"}
   {:source 121 :target 76  :type "child"   :family "Faivre"}
   {:source 122 :target 117 :type "partner" :family "Dieterlé"}
   {:source 123 :target 45  :type "child"   :family "Beaudin"}
   {:source 123 :target 58  :type "child"   :family "Beaudin"}
   {:source 124 :target 43  :type "child"   :family "Troncy"}
   {:source 124 :target 50  :type "child"   :family "Troncy"}
   {:source 125 :target 51  :type "child"   :family "Suzukawa"}
   {:source 125 :target 60  :type "child"   :family "Suzukawa"}
   {:source 126 :target 55  :type "child"   :family "Rodier"}
   {:source 126 :target 63  :type "child"   :family "Rodier"}
   {:source 127 :target 64  :type "child"   :family "Giraud"}
   {:source 127 :target 65  :type "child"   :family "Giraud"}
   {:source 128 :target 62  :type "child"   :family "Pourtier"}
   {:source 128 :target 70  :type "child"   :family "Pourtier"}
   {:source 129 :target 51  :type "child"   :family "Suzukawa"}
   {:source 129 :target 60  :type "child"   :family "Suzukawa"}
   {:source 130 :target 53  :type "child"   :family "Patay"}
   {:source 130 :target 66  :type "child"   :family "Patay"}
   {:source 131 :target 55  :type "child"   :family "Rodier"}
   {:source 131 :target 63  :type "child"   :family "Rodier"}
   {:source 132 :target 56  :type "child"   :family "Perret"}
   {:source 132 :target 59  :type "child"   :family "Perret"}
   {:source 133 :target 53  :type "child"   :family "Patay"}
   {:source 133 :target 66  :type "child"   :family "Patay"}
   {:source 134 :target 64  :type "child"   :family "Giraud"}
   {:source 134 :target 65  :type "child"   :family "Giraud"}
   {:source 135 :target 62  :type "child"   :family "Pourtier"}
   {:source 135 :target 70  :type "child"   :family "Pourtier"}
   {:source 136 :target 32  :type "child"   :family "Troncy"}
   {:source 136 :target 47  :type "child"   :family "Troncy"}
   {:source 137 :target 62  :type "child"   :family "Pourtier"}
   {:source 137 :target 70  :type "child"   :family "Pourtier"}
   {:source 138 :target 56  :type "child"   :family "Perret"}
   {:source 138 :target 59  :type "child"   :family "Perret"}
   {:source 139 :target 64  :type "child"   :family "Giraud"}
   {:source 139 :target 65  :type "child"   :family "Giraud"}
   {:source 140 :target 56  :type "child"   :family "Perret"}
   {:source 140 :target 59  :type "child"   :family "Perret"}
   {:source 141 :target 72  :type "child"   :family "Faivre"}
   {:source 141 :target 76  :type "child"   :family "Faivre"}
   {:source 142 :target 73  :type "child"   :family "Bertin"}
   {:source 142 :target 75  :type "child"   :family "Bertin"}
   {:source 143 :target 78  :type "child"   :family "Perrin"}
   {:source 143 :target 86  :type "child"   :family "Perrin"}
   {:source 144 :target 62  :type "child"   :family "Pourtier"}
   {:source 144 :target 70  :type "child"   :family "Pourtier"}
   {:source 145 :target 72  :type "child"   :family "Faivre"}
   {:source 145 :target 76  :type "child"   :family "Faivre"}
   {:source 146 :target 73  :type "child"   :family "Bertin"}
   {:source 146 :target 75  :type "child"   :family "Bertin"}
   {:source 147 :target 79  :type "child"   :family "Bonin"}
   {:source 147 :target 83  :type "child"   :family "Bonin"}
   {:source 148 :target 68  :type "child"   :family "Morin"}
   {:source 148 :target 88  :type "child"   :family "Morin"}
   {:source 149 :target 79  :type "child"   :family "Bonin"}
   {:source 149 :target 83  :type "child"   :family "Bonin"}
   {:source 150 :target 82  :type "child"   :family "Perrin"}
   {:source 150 :target 106 :type "child"   :family "Perrin"}
   {:source 151 :target 84  :type "child"   :family "Bonin"}
   {:source 151 :target 91  :type "child"   :family "Bonin"}
   {:source 152 :target 80  :type "child"   :family "Troncy"}
   {:source 152 :target 81  :type "child"   :family "Troncy"}
   {:source 153 :target 84  :type "child"   :family "Bonin"}
   {:source 153 :target 91  :type "child"   :family "Bonin"}
   {:source 154 :target 80  :type "child"   :family "Troncy"}
   {:source 154 :target 81  :type "child"   :family "Troncy"}
   {:source 155 :target 94  :type "child"   :family "Cheilan"}
   {:source 155 :target 109 :type "child"   :family "Cheilan"}
   {:source 156 :target 93  :type "child"   :family "Le Mintier"}
   {:source 156 :target 77  :type "child"   :family "Le Mintier"}
   {:source 157 :target 98  :type "child"   :family "Troncy"}
   {:source 158 :target 82  :type "child"   :family "Perrin"}
   {:source 158 :target 87  :type "child"   :family "Perrin"}
   {:source 159 :target 68  :type "child"   :family "Morin"}
   {:source 159 :target 88  :type "child"   :family "Morin"}
   {:source 160 :target 79  :type "child"   :family "Bonin"}
   {:source 160 :target 83  :type "child"   :family "Bonin"}
   {:source 161 :target 80  :type "child"   :family "Troncy"}
   {:source 161 :target 81  :type "child"   :family "Troncy"}
   {:source 162 :target 78  :type "child"   :family "Perrin"}
   {:source 162 :target 74  :type "child"   :family "Perrin"}
   {:source 163 :target 78  :type "child"   :family "Perrin"}
   {:source 163 :target 74  :type "child"   :family "Perrin"}
   {:source 164 :target 93  :type "child"   :family "Le Mintier"}
   {:source 164 :target 77  :type "child"   :family "Le Mintier"}
   {:source 165 :target 94  :type "child"   :family "Cheilan"}
   {:source 165 :target 109 :type "child"   :family "Cheilan"}
   {:source 166 :target 68  :type "child"   :family "Morin"}
   {:source 166 :target 88  :type "child"   :family "Morin"}
   {:source 167 :target 84  :type "child"   :family "Bonin"}
   {:source 167 :target 91  :type "child"   :family "Bonin"}
   {:source 168 :target 77  :type "child"   :family "Le Mintier"}
   {:source 168 :target 93  :type "child"   :family "Le Mintier"}
   {:source 169 :target 103 :type "child"   :family "Troncy"}
   {:source 169 :target 105 :type "child"   :family "Troncy"}
   {:source 170 :target 82  :type "child"   :family "Perrin"}
   {:source 170 :target 87  :type "child"   :family "Perrin"}
   {:source 171 :target 96  :type "child"   :family "Wolff"}
   {:source 171 :target 104 :type "child"   :family "Wolff"}
   {:source 172 :target 97  :type "child"   :family "Calatraba"}
   {:source 172 :target 108 :type "child"   :family "Calatraba"}
   {:source 173 :target 71  :type "child"   :family "Bonin"}
   {:source 173 :target 119 :type "child"   :family "Bonin"}
   {:source 174 :target 112 :type "child"   :family "Gaillet"}
   {:source 174 :target 120 :type "child"   :family "Gaillet"}
   {:source 175 :target 114 :type "child"   :family "Maria"}
   {:source 175 :target 95  :type "child"   :family "Maria"}
   {:source 176 :target 101 :type "child"   :family "Troncy"}
   {:source 176 :target 102 :type "child"   :family "Troncy"}
   {:source 177 :target 117 :type "child"   :family "Dieterlé"}
   {:source 177 :target 122 :type "child"   :family "Dieterlé"}
   {:source 178 :target 114 :type "child"   :family "Maria"}
   {:source 178 :target 95  :type "child"   :family "Maria"}])

(def colour-scheme
  [{:family "Patay"       :hard-colour "#FF4A46" :soft-colour "#FFDBDA"}
   {:family "Maria"       :hard-colour "#9B9700" :soft-colour "#EBEACC"}
   {:family "Bonin"       :hard-colour "#006FA6" :soft-colour "#CCE2ED"}
   {:family "Calatraba"   :hard-colour "#E20027" :soft-colour "#F9CCD4"}
   {:family "Barrière"    :hard-colour "#B79762" :soft-colour "#F1EAE0"}
   {:family "Wolff"       :hard-colour "#D25B88" :soft-colour "#F6DEE7"}
   {:family "Rodier"      :hard-colour "#953F00" :soft-colour "#EAD9CC"}
   {:family "Gaillet"     :hard-colour "#7A7BFF" :soft-colour "#E4E5FF"}
   {:family "Pourtier"    :hard-colour "#FFA0F2" :soft-colour "#FFECFC"}
   {:family "Le Blanc"    :hard-colour "#8CC63F" :soft-colour "#E8F4D9"}
   {:family "Cheilan"     :hard-colour "#0CBD66" :soft-colour "#CEF2E0"}
   {:family "Perrin"      :hard-colour "#012C58" :soft-colour "#CCD5DE"}
   {:family "Faivre"      :hard-colour "#F4D749" :soft-colour "#FDF7DB"}
   {:family "Morin"       :hard-colour "#2DBCF0" :soft-colour "#D5F2FC"}
   {:family "Bonnet"      :hard-colour "#FAA61A" :soft-colour "#FEEDD1"}
   {:family "Giraud"      :hard-colour "#958A9F" :soft-colour "#EAE8EC"}
   {:family "Suzukawa"    :hard-colour "#008080" :soft-colour "#CCE6E6"}
   {:family "Troncy"      :hard-colour "#671190" :soft-colour "#E1CFE9"}
   {:family "Goudot"      :hard-colour "#1E6E00" :soft-colour "#D2E2CC"}
   {:family "Bertin"      :hard-colour "#885578" :soft-colour "#E7DDE4"}
   {:family "Perret"      :hard-colour "#FF2F80" :soft-colour "#FFD5E6"}
   {:family "Beaudin"     :hard-colour "#800000" :soft-colour "#E6CCCC"}
   {:family "Le Mintier"  :hard-colour "#FF6832" :soft-colour "#FFE1D6"}
   {:family "Dieterlé"    :hard-colour "#D16100" :soft-colour "#F6DFCC"}
   {:family "Bonhour"     :hard-colour "#BDC9D2" :soft-colour "#F1F3F5"}
   {:family "Abadie"      :hard-colour "#BDC9D2" :soft-colour "#F1F3F5"}
   {:family "Barnes"      :hard-colour "#BDC9D2" :soft-colour "#F1F3F5"}
   {:family "Desrayaud"   :hard-colour "#BDC9D2" :soft-colour "#F1F3F5"}
   {:family "Chapuzet"    :hard-colour "#BDC9D2" :soft-colour "#F1F3F5"}
   {:family "Labaty"      :hard-colour "#BDC9D2" :soft-colour "#F1F3F5"}
   {:family "Olds"        :hard-colour "#BDC9D2" :soft-colour "#F1F3F5"}
   {:family "Lebon"       :hard-colour "#BDC9D2" :soft-colour "#F1F3F5"}
   {:family "Antoni"      :hard-colour "#BDC9D2" :soft-colour "#F1F3F5"}
   {:family "Galtier"     :hard-colour "#BDC9D2" :soft-colour "#F1F3F5"}
   {:family "Morel"       :hard-colour "#BDC9D2" :soft-colour "#F1F3F5"}
   {:family "Muzelli"     :hard-colour "#BDC9D2" :soft-colour "#F1F3F5"}
   {:family "de Veron"    :hard-colour "#BDC9D2" :soft-colour "#F1F3F5"}
   {:family "Saillet"     :hard-colour "#BDC9D2" :soft-colour "#F1F3F5"}
   {:family "Cottin"      :hard-colour "#BDC9D2" :soft-colour "#F1F3F5"}
   {:family "Viosi"       :hard-colour "#BDC9D2" :soft-colour "#F1F3F5"}
   {:family "Maggialetti" :hard-colour "#BDC9D2" :soft-colour "#F1F3F5"}
   {:family "Taithe"      :hard-colour "#BDC9D2" :soft-colour "#F1F3F5"}
   {:family "Russo"       :hard-colour "#BDC9D2" :soft-colour "#F1F3F5"}
   {:family "Jullien"     :hard-colour "#BDC9D2" :soft-colour "#F1F3F5"}
   {:family "Valli"       :hard-colour "#BDC9D2" :soft-colour "#F1F3F5"}
   {:family "Pelletier"   :hard-colour "#BDC9D2" :soft-colour "#F1F3F5"}
   {:family "Pointet"     :hard-colour "#BDC9D2" :soft-colour "#F1F3F5"}
   {:family "Nesme"       :hard-colour "#BDC9D2" :soft-colour "#F1F3F5"}
   {:family "Bourel"      :hard-colour "#BDC9D2" :soft-colour "#F1F3F5"}
   {:family "Sommer"      :hard-colour "#BDC9D2" :soft-colour "#F1F3F5"}
   {:family "Chapuis"     :hard-colour "#BDC9D2" :soft-colour "#F1F3F5"}
   {:family "Jullat"      :hard-colour "#BDC9D2" :soft-colour "#F1F3F5"}
   {:family "Sadoux"      :hard-colour "#BDC9D2" :soft-colour "#F1F3F5"}
   {:family "Cappio"      :hard-colour "#BDC9D2" :soft-colour "#F1F3F5"}])
