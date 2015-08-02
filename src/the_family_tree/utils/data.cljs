(ns the-family-tree.utils.data)

(def family-data
  {:nodes [{:id 0   :first-name "André"           :last-name "Troncy"      :generation 1 :sex "male"   :blood-line true  :birth 1859 :death 1931}
           {:id 1   :first-name "Francine"        :last-name "Valli"       :generation 1 :sex "female" :blood-line false :birth 1872 :death 1954}
           {:id 2   :first-name "Charles"         :last-name "Patay"       :generation 2 :sex "male"   :blood-line false :birth 1884 :death 1959}
           {:id 3   :first-name "Francois"        :last-name "Bonnet"      :generation 2 :sex "male"   :blood-line false :birth 1884 :death 1970}
           {:id 4   :first-name "Jeanne"          :last-name "Troncy"      :generation 2 :sex "female" :blood-line true  :birth 1894 :death 1979}
           {:id 5   :first-name "Claudia"         :last-name "Troncy"      :generation 2 :sex "female" :blood-line true  :birth 1895 :death 1968}
           {:id 6   :first-name "Maurice"         :last-name "Troncy"      :generation 2 :sex "male"   :blood-line true  :birth 1896 :death 1942}
           {:id 7   :first-name "Gustave"         :last-name "Troncy"      :generation 2 :sex "male"   :blood-line true  :birth 1898 :death 1972}
           {:id 8   :first-name "Claude"          :last-name "Troncy"      :generation 2 :sex "male"   :blood-line true  :birth 1900 :death 1964}
           {:id 9   :first-name "Madeleine"       :last-name "Galtier"     :generation 2 :sex "female" :blood-line false :birth 1900 :death 1983}
           {:id 10  :first-name "Marcelle"        :last-name "Desrayaud"   :generation 2 :sex "female" :blood-line false :birth 1901 :death 1966}
           {:id 11  :first-name "Robert"          :last-name "Troncy"      :generation 2 :sex "male"   :blood-line true  :birth 1902 :death 1959}
           {:id 12  :first-name "Renée"           :last-name "Pointet"     :generation 2 :sex "female" :blood-line false :birth 1907 :death 2000}
           {:id 13  :first-name "Elisabeth"       :last-name "de Veron"    :generation 2 :sex "female" :blood-line false :birth 1909 :death 1994}
           {:id 14  :first-name "Albert"          :last-name "Bertin"      :generation 3 :sex "male"   :blood-line false :birth 1914 :death 1997}
           {:id 15  :first-name "Marcel"          :last-name "Rodier"      :generation 3 :sex "male"   :blood-line false :birth 1916 :death 2004}
           {:id 16  :first-name "Simone"          :last-name "Patay"       :generation 3 :sex "female" :blood-line true  :birth 1917 :death 2000}
           {:id 17  :first-name "Roger"           :last-name "Dieterlé"    :generation 3 :sex "male"   :blood-line false :birth 1917 :death 1990}
           {:id 18  :first-name "André"           :last-name "Patay"       :generation 3 :sex "male"   :blood-line true  :birth 1919 :death 1995}
           {:id 19  :first-name "Denise"          :last-name "Morel"       :generation 3 :sex "female" :blood-line false :birth 1922}
           {:id 20  :first-name "Jean"            :last-name "Pelletier"   :generation 3 :sex "male"   :blood-line false :birth 1922 :death 1994}
           {:id 21  :first-name "Geneviéve"       :last-name "Troncy"      :generation 3 :sex "female" :blood-line true  :birth 1923 :death 1925}
           {:id 22  :first-name "Alice"           :last-name "Patay"       :generation 3 :sex "female" :blood-line true  :birth 1924}
           {:id 23  :first-name "Georges"         :last-name "Troncy"      :generation 3 :sex "male"   :blood-line true  :birth 1926 :death 1993}
           {:id 24  :first-name "Pierre"          :last-name "Bonnet"      :generation 3 :sex "male"   :blood-line true  :birth 1927 :death 2008}
           {:id 25  :first-name "Guitou"          :last-name "Taithe"      :generation 3 :sex "female" :blood-line false :birth 1928 :death 2005}
           {:id 26  :first-name "Françoise"       :last-name "Bonnet"      :generation 3 :sex "female" :blood-line true  :birth 1929}
           {:id 27  :first-name "Christiane"      :last-name "Troncy"      :generation 3 :sex "female" :blood-line true  :birth 1929 :death 2014}
           {:id 28  :first-name "André"           :last-name "Troncy"      :generation 3 :sex "male"   :blood-line true  :birth 1933}
           {:id 29  :first-name "Simone"          :last-name "Bourel"      :generation 3 :sex "female" :blood-line false :birth 1936}
           {:id 30  :first-name "Robert"          :last-name "Barrière"    :generation 4 :sex "male"   :blood-line false :birth 1936 :death 1999}
           {:id 31  :first-name "Marie-Suzanne"   :last-name "Saillet"     :generation 3 :sex "female" :blood-line false :birth 1937}
           {:id 32  :first-name "Jaques"          :last-name "Troncy"      :generation 3 :sex "male"   :blood-line true  :birth 1939}
           {:id 33  :first-name "Françoise"       :last-name "Bonhour"     :generation 3 :sex "female" :blood-line false :birth 1939}
           {:id 34  :first-name "Bernard"         :last-name "Troncy"      :generation 3 :sex "male"   :blood-line true  :birth 1940 :death 1992}
           {:id 35  :first-name "Marie-France"    :last-name "Troncy"      :generation 3 :sex "female" :blood-line true  :birth 1940}
           {:id 36  :first-name "Alain"           :last-name "Bertin"      :generation 4 :sex "male"   :blood-line true  :birth 1940}
           {:id 37  :first-name "Françoise"       :last-name "Jullien"     :generation 4 :sex "female" :blood-line false :birth 1941}
           {:id 38  :first-name "Philippe"        :last-name "Bonin"       :generation 4 :sex "male"   :blood-line false :birth 1941}
           {:id 39  :first-name "Jean-François"   :last-name "Troncy"      :generation 3 :sex "male"   :blood-line true  :birth 1942 :death 1994}
           {:id 40  :first-name "Danielle"        :last-name "Bertin"      :generation 4 :sex "female" :blood-line true  :birth 1943}
           {:id 41  :first-name "Didier"          :last-name "Goudot"      :generation 4 :sex "male"   :blood-line false :birth 1943}
           {:id 42  :first-name "Claude-Henry"    :last-name "Perrin"      :generation 3 :sex "male"   :blood-line false :birth 1943}
           {:id 43  :first-name "Hubert"          :last-name "Troncy"      :generation 3 :sex "male"   :blood-line true  :birth 1945}
           {:id 44  :first-name "Brigitte"        :last-name "Patay"       :generation 4 :sex "female" :blood-line true  :birth 1947}
           {:id 45  :first-name "François"        :last-name "Beaudin"     :generation 4 :sex "male"   :blood-line false :birth 1947 :death 1998}
           {:id 46  :first-name "Maurice"         :last-name "Bertin"      :generation 4 :sex "male"   :blood-line true  :birth 1948 :death 1949}
           {:id 47  :first-name "Marie-Geneviéve" :last-name "Sommer"      :generation 3 :sex "female" :blood-line false :birth 1949}
           {:id 48  :first-name "Catherine"       :last-name "Rodier"      :generation 4 :sex "female" :blood-line true  :birth 1949}
           {:id 49  :first-name "Patrick"         :last-name "Le Blanc"    :generation 4 :sex "female" :blood-line false :birth 1949 :death 2012}
           {:id 50  :first-name "Rosamund"        :last-name "Barnes"      :generation 3 :sex "female" :blood-line false :birth 1951}
           {:id 51  :first-name "Hiroshi"         :last-name "Suzukawa"    :generation 4 :sex "male"   :blood-line false :birth 1951}
           {:id 52  :first-name "Laurence"        :last-name "Dieterlé"    :generation 4 :sex "female" :blood-line true  :birth 1951}
           {:id 53  :first-name "Michel"          :last-name "Patay"       :generation 4 :sex "male"   :blood-line true  :birth 1951}
           {:id 54  :first-name "Cheryl"          :last-name "Olds"        :generation 4 :sex "female" :blood-line false :birth 1951}
           {:id 55  :first-name "Philippe"        :last-name "Rodier"      :generation 4 :sex "male"   :blood-line true  :birth 1952}
           {:id 56  :first-name "Alain"           :last-name "Perret"      :generation 4 :sex "male"   :blood-line false :birth 1952}
           {:id 57  :first-name "Régis"           :last-name "Dieterlé"    :generation 4 :sex "male"   :blood-line true  :birth 1953 :death 1994}
           {:id 58  :first-name "Cécile"          :last-name "Dieterlé"    :generation 4 :sex "female" :blood-line true  :birth 1955}
           {:id 59  :first-name "Fabienne"        :last-name "Bonnet"      :generation 4 :sex "female" :blood-line true  :birth 1957}
           {:id 60  :first-name "Agnés"           :last-name "Dieterlé"    :generation 4 :sex "female" :blood-line true  :birth 1958}
           {:id 61  :first-name "Marie-Delphine"  :last-name "Muzelli"     :generation 4 :sex "female" :blood-line false :birth 1958}
           {:id 62  :first-name "Lionel"          :last-name "Pourtier"    :generation 5 :sex "male"   :blood-line false :birth 1958}
           {:id 63  :first-name "Anne"            :last-name "Chapuis"     :generation 4 :sex "female" :blood-line false :birth 1959}
           {:id 64  :first-name "Marielle"        :last-name "Bonnet"      :generation 4 :sex "female" :blood-line true  :birth 1959}
           {:id 65  :first-name "Jean-Michel"     :last-name "Giraud"      :generation 4 :sex "male"   :blood-line false :birth 1960}
           {:id 66  :first-name "Nadine"          :last-name "Nesme"       :generation 4 :sex "female" :blood-line false :birth 1961}
           {:id 67  :first-name "Chantal"         :last-name "Bonnet"      :generation 4 :sex "female" :blood-line true  :birth 1962}
           {:id 68  :first-name "Christophe"      :last-name "Morin"       :generation 5 :sex "male"   :blood-line false :birth 1963}
           {:id 69  :first-name "Jérôme"          :last-name "Troncy"      :generation 4 :sex "male"   :blood-line true  :birth 1965 :death 1989}
           {:id 70  :first-name "Laurence"        :last-name "Bertin"      :generation 5 :sex "female" :blood-line true  :birth 1966}
           {:id 71  :first-name "Franck"          :last-name "Bonin"       :generation 5 :sex "male"   :blood-line true  :birth 1966}
           {:id 72  :first-name "Armelle"         :last-name "Troncy"      :generation 4 :sex "female" :blood-line true  :birth 1967}
           {:id 73  :first-name "Isabelle"        :last-name "Chapuzet"    :generation 5 :sex "female" :blood-line false :birth 1967}
           {:id 74  :first-name "Béatrice"        :last-name "Abadie"      :generation 4 :sex "female" :blood-line false :birth 1967}
           {:id 75  :first-name "Frédéric"        :last-name "Bertin"      :generation 5 :sex "male"   :blood-line true  :birth 1968}
           {:id 76  :first-name "Jean-Marc"       :last-name "Faivre"      :generation 4 :sex "male"   :blood-line false :birth 1968}
           {:id 77  :first-name "Erwan"           :last-name "Le Mintier"  :generation 5 :sex "male"   :blood-line false :birth 1968}
           {:id 78  :first-name "Emmanuel"        :last-name "Perrin"      :generation 4 :sex "male"   :blood-line true  :birth 1968}
           {:id 79  :first-name "Fabrice"         :last-name "Bonin"       :generation 5 :sex "male"   :blood-line true  :birth 1968}
           {:id 80  :first-name "Antoine"         :last-name "Troncy"      :generation 4 :sex "male"   :blood-line true  :birth 1969}
           {:id 81  :first-name "Laurence"        :last-name "Sadoux"      :generation 4 :sex "female" :blood-line false :birth 1969}
           {:id 82  :first-name "Alexandre"       :last-name "Perrin"      :generation 4 :sex "male"   :blood-line true  :birth 1969}
           {:id 83  :first-name "Françoise"       :last-name "Cottin"      :generation 5 :sex "female" :blood-line false :birth 1969}
           {:id 84  :first-name "Nicolas"         :last-name "Bonin"       :generation 5 :sex "male"   :blood-line true  :birth 1970}
           {:id 85  :first-name "Anne-Laurie"     :last-name "Troncy"      :generation 4 :sex "female" :blood-line true  :birth 1971}
           {:id 86  :first-name "Clémentine"      :last-name "Labaty"      :generation 4 :sex "female" :blood-line false :birth 1971}
           {:id 87  :first-name "Sophie"          :last-name "Jullat"      :generation 4 :sex "female" :blood-line false :birth 1971}
           {:id 88  :first-name "Anne"            :last-name "Bertin"      :generation 5 :sex "female" :blood-line true  :birth 1971}
           {:id 89  :first-name "Charles-Eric"    :last-name "Bonin"       :generation 5 :sex "male"   :blood-line true  :birth 1972 :death 1972}
           {:id 90  :first-name "Marianne"        :last-name "Goudot"      :generation 5 :sex "female" :blood-line true  :birth 1972}
           {:id 91  :first-name "Vanessa"         :last-name "Lebon"       :generation 5 :sex "female" :blood-line false :birth 1973}
           {:id 92  :first-name "Xavier"          :last-name "Bertin"      :generation 5 :sex "male"   :blood-line true  :birth 1974}
           {:id 93  :first-name "Valentine"       :last-name "Le Blanc"    :generation 5 :sex "female" :blood-line true  :birth 1974}
           {:id 94  :first-name "Bruno"           :last-name "Cheilan"     :generation 5 :sex "male"   :blood-line false :birth 1974}
           {:id 95  :first-name "Matthieu"        :last-name "Maria"       :generation 5 :sex "male"   :blood-line false :birth 1974}
           {:id 96  :first-name "Julia"           :last-name "Goudot"      :generation 5 :sex "female" :blood-line true  :birth 1975}
           {:id 97  :first-name "Michaël"         :last-name "Calatraba"   :generation 5 :sex "male"   :blood-line false :birth 1975}
           {:id 98  :first-name "Christelle"      :last-name "Troncy"      :generation 4 :sex "female" :blood-line true  :birth 1975}
           {:id 99  :first-name "Valérie"         :last-name "Barrière"    :generation 5 :sex "female" :blood-line true  :birth 1976 :death 1982}
           {:id 100 :first-name "Aurélie"         :last-name "Le Blanc"    :generation 5 :sex "female" :blood-line true  :birth 1976}
           {:id 101 :first-name "Cyril"           :last-name "Troncy"      :generation 4 :sex "male"   :blood-line true  :birth 1976}
           {:id 102 :first-name "Camilla"         :last-name "Maggialetti" :generation 4 :sex "female" :blood-line false :birth 1976}
           {:id 103 :first-name "Guilhem"         :last-name "Troncy"      :generation 4 :sex "male"   :blood-line true  :birth 1976}
           {:id 104 :first-name "Pierrick"        :last-name "Wolff"       :generation 5 :sex "male"   :blood-line false :birth 1977}
           {:id 105 :first-name "Maud"            :last-name "Russo"       :generation 4 :sex "female" :blood-line false :birth 1977}
           {:id 106 :first-name "Anne-Claire"     :last-name "Antoni"      :generation 4 :sex "female" :blood-line false :birth 1977}
           {:id 107 :first-name "Mathieu"         :last-name "Beaudin"     :generation 5 :sex "male"   :blood-line true  :birth 1978}
           {:id 108 :first-name "Sandrine"        :last-name "Barrière"    :generation 5 :sex "female" :blood-line true  :birth 1979}
           {:id 109 :first-name "Mélanie"         :last-name "Beaudin"     :generation 5 :sex "female" :blood-line true  :birth 1980}
           {:id 110 :first-name "Cédric"          :last-name "Troncy"      :generation 4 :sex "male"   :blood-line true  :birth 1980}
           {:id 111 :first-name "Romain"          :last-name "Troncy"      :generation 4 :sex "male"   :blood-line true  :birth 1980}
           {:id 112 :first-name "Oliver"          :last-name "Gaillet"     :generation 5 :sex "male"   :blood-line false :birth 1981}
           {:id 113 :first-name "Eric"            :last-name "Barrière"    :generation 5 :sex "male"   :blood-line true  :birth 1982}
           {:id 114 :first-name "Alice"           :last-name "Beaudin"     :generation 5 :sex "female" :blood-line true  :birth 1982}
           {:id 115 :first-name "Didier"          :last-name "Troncy"      :generation 4 :sex "male"   :blood-line true  :birth 1982}
           {:id 116 :first-name "Olivier"         :last-name "Troncy"      :generation 4 :sex "male"   :blood-line true  :birth 1982}
           {:id 117 :first-name "Thibault"        :last-name "Dieterlé"    :generation 5 :sex "male"   :blood-line true  :birth 1984}
           {:id 118 :first-name "Leïla"           :last-name "Suzukawa"    :generation 5 :sex "female" :blood-line true  :birth 1984}
           {:id 119 :first-name "Anne-Sophie"     :last-name "Cappio"      :generation 5 :sex "female" :blood-line false :birth 1985}
           {:id 120 :first-name "Caroline"        :last-name "Rodier"      :generation 5 :sex "female" :blood-line true  :birth 1985}
           {:id 121 :first-name "Marine"          :last-name "Faivre"      :generation 5 :sex "female" :blood-line true  :birth 1986}
           {:id 122 :first-name "Johanna"         :last-name "Viosi"       :generation 5 :sex "female" :blood-line false :birth 1986}
           {:id 123 :first-name "Clément"         :last-name "Beaudin"     :generation 5 :sex "male"   :blood-line true  :birth 1986}
           {:id 124 :first-name "Pierre"          :last-name "Troncy"      :generation 4 :sex "male"   :blood-line true  :birth 1986}
           {:id 125 :first-name "Keigo"           :last-name "Suzukawa"    :generation 5 :sex "male"   :blood-line true  :birth 1986}
           {:id 126 :first-name "Laetitia"        :last-name "Rodier"      :generation 5 :sex "female" :blood-line true  :birth 1987}
           {:id 127 :first-name "Grégoire"        :last-name "Giraud"      :generation 5 :sex "male"   :blood-line true  :birth 1987}
           {:id 128 :first-name "Vincent"         :last-name "Pourtier"    :generation 6 :sex "male"   :blood-line true  :birth 1988}
           {:id 129 :first-name "Kaya"            :last-name "Suzukawa"    :generation 5 :sex "female" :blood-line true  :birth 1988}
           {:id 130 :first-name "Blandine"        :last-name "Patay"       :generation 5 :sex "female" :blood-line true  :birth 1989}
           {:id 131 :first-name "Charles-Henry"   :last-name "Rodier"      :generation 5 :sex "male"   :blood-line true  :birth 1989}
           {:id 132 :first-name "Henry"           :last-name "Perret"      :generation 5 :sex "male"   :blood-line true  :birth 1989}
           {:id 133 :first-name "Charles"         :last-name "Patay"       :generation 5 :sex "male"   :blood-line true  :birth 1990}
           {:id 134 :first-name "Hubert"          :last-name "Giraud"      :generation 5 :sex "male"   :blood-line true  :birth 1990}
           {:id 135 :first-name "Pierre"          :last-name "Pourtier"    :generation 6 :sex "male"   :blood-line true  :birth 1991}
           {:id 136 :first-name "Marine"          :last-name "Troncy"      :generation 4 :sex "female" :blood-line true  :birth 1991}
           {:id 137 :first-name "Jean"            :last-name "Pourtier"    :generation 6 :sex "male"   :blood-line true  :birth 1992}

           {:id 138 :first-name "Alix"            :last-name "Perret"      :generation 5 :sex "male"   :blood-line true  :birth 1992}
           {:id 139 :first-name "Ségolène"        :last-name "Giraud"      :generation 5 :sex "female" :blood-line true  :birth 1992}
           {:id 140 :first-name "Armelle"         :last-name "Perret"      :generation 5 :sex "female" :blood-line true  :birth 1994}
           {:id 141 :first-name "Charlotte"       :last-name "Faivre"      :generation 5 :sex "female" :blood-line true  :birth 1994}
           {:id 142 :first-name "Emilie"          :last-name "Bertin"      :generation 6 :sex "female" :blood-line true  :birth 1995}
           {:id 143 :first-name "Mathilde"        :last-name "Perrin"      :generation 5 :sex "female" :blood-line true  :birth 1996}
           {:id 144 :first-name "Valérie"         :last-name "Pourtier"    :generation 6 :sex "female" :blood-line true  :birth 1997}
           {:id 145 :first-name "Prune"           :last-name "Faivre"      :generation 5 :sex "female" :blood-line true  :birth 1997}
           {:id 146 :first-name "Alexandre"       :last-name "Bertin"      :generation 6 :sex "male"   :blood-line true  :birth 1998}
           {:id 147 :first-name "Romain"          :last-name "Bonin"       :generation 6 :sex "male"   :blood-line true  :birth 1999}
           {:id 148 :first-name "Florian"         :last-name "Morin"       :generation 6 :sex "male"   :blood-line true  :birth 2001}
           {:id 149 :first-name "Pauline"         :last-name "Bonin"       :generation 6 :sex "female" :blood-line true  :birth 2001}
           {:id 150 :first-name "Mathis"          :last-name "Perrin"      :generation 5 :sex "male"   :blood-line true  :birth 2001}
           {:id 151 :first-name "Idriss-Valentin" :last-name "Bonin"       :generation 6 :sex "female" :blood-line true  :birth 2002}
           {:id 152 :first-name "Louis"           :last-name "Troncy"      :generation 5 :sex "male"   :blood-line true  :birth 2002}
           {:id 153 :first-name "Ambre"           :last-name "Bonin"       :generation 6 :sex "male"   :blood-line true  :birth 2004}
           {:id 154 :first-name "Sébastien"       :last-name "Troncy"      :generation 5 :sex "male"   :blood-line true  :birth 2004}
           {:id 155  :first-name "Gabrielle"       :last-name "Cheilan"     :generation 6 :sex "female" :blood-line true  :birth 2005}
           {:id 156 :first-name "Aymeric"         :last-name "Le Mintier"  :generation 5 :sex "male"   :blood-line true  :birth 2005}
           {:id 157 :first-name "Clémence"        :last-name "Troncy"      :generation 5 :sex "female" :blood-line true  :birth 2005}
           {:id 158 :first-name "Louna"           :last-name "Perrin"      :generation 5 :sex "male"   :blood-line true  :birth 2005}
           {:id 159 :first-name "Lucas"           :last-name "Morin"       :generation 6 :sex "male"   :blood-line true  :birth 2006}
           {:id 160 :first-name "Julien"          :last-name "Bonin"       :generation 6 :sex "male"   :blood-line true  :birth 2006}
           {:id 161 :first-name "Guillaume"       :last-name "Troncy"      :generation 5 :sex "male"   :blood-line true  :birth 2006}
           {:id 162 :first-name "Eva"             :last-name "Perrin"      :generation 5 :sex "female" :blood-line true  :birth 2006}
           {:id 163 :first-name "Milo"            :last-name "Perrin"      :generation 5 :sex "male"   :blood-line true  :birth 2006}
           {:id 164 :first-name "Jeanne"          :last-name "Le Mintier"  :generation 5 :sex "female" :blood-line true  :birth 2007}
           {:id 165 :first-name "Robin"           :last-name "Cheilan"     :generation 6 :sex "male"   :blood-line true  :birth 2007}
           {:id 166 :first-name "Lola"            :last-name "Morin"       :generation 6 :sex "female" :blood-line true  :birth 2008}
           {:id 167 :first-name "Hanaé"           :last-name "Bonin"       :generation 6 :sex "female" :blood-line true  :birth 2009}
           {:id 168 :first-name "Clara"           :last-name "Le Mintier"  :generation 5 :sex "female" :blood-line true  :birth 2009}
           {:id 169 :first-name "Charles"         :last-name "Troncy"      :generation 5 :sex "male"   :blood-line true  :birth 2009}
           {:id 170 :first-name "Balian"          :last-name "Perrin"      :generation 5 :sex "male"   :blood-line true  :birth 2009}
           {:id 171 :first-name "Simon"           :last-name "Wolff"       :generation 6 :sex "male"   :blood-line true  :birth 2010}
           {:id 172 :first-name "Nell"            :last-name "Calatraba"   :generation 6 :sex "female" :blood-line true  :birth 2010}
           {:id 173 :first-name "Caroline"        :last-name "Bonin"       :generation 6 :sex "female" :blood-line true  :birth 2011}
           {:id 174 :first-name "Augustin"        :last-name "Gaillet"     :generation 6 :sex "male"   :blood-line true  :birth 2011}
           {:id 175 :first-name "Loïse"           :last-name "Maria"       :generation 6 :sex "female" :blood-line true  :birth 2011}
           {:id 176 :first-name "Mathilde"        :last-name "Troncy"      :generation 5 :sex "female" :blood-line true  :birth 2012}
           {:id 177 :first-name "Lenny"           :last-name "Dieterlé"    :generation 5 :sex "male"   :blood-line true  :birth 2014}
           {:id 178 :first-name "Gaspard"         :last-name "Maria"       :generation 6 :sex "male"   :blood-line true  :birth 2015}
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
           {:source 16  :target 14  :relation :partner}
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
           {:source 70  :target 36  :relation :child}
           {:source 70  :target 37  :relation :child}
           {:source 70  :target 62  :relation :partner}
           {:source 71  :target 38  :relation :child}
           {:source 71  :target 40  :relation :child}
           {:source 72  :target 23  :relation :child}
           {:source 72  :target 31  :relation :child}
           {:source 75  :target 36  :relation :child}
           {:source 75  :target 37  :relation :child}
           {:source 75  :target 73  :relation :partner}
           {:source 76  :target 72  :relation :partner}
           {:source 78  :target 35  :relation :child}
           {:source 78  :target 42  :relation :child}
           {:source 78  :target 74  :relation :partner}
           {:source 79  :target 38  :relation :child}
           {:source 79  :target 40  :relation :child}
           {:source 79  :target 83  :relation :partner}
           {:source 80  :target 23  :relation :child}
           {:source 80  :target 31  :relation :child}
           {:source 81  :target 80  :relation :partner}
           {:source 82  :target 35  :relation :child}
           {:source 82  :target 42  :relation :child}
           {:source 84  :target 38  :relation :child}
           {:source 84  :target 40  :relation :child}
           {:source 85  :target 28  :relation :child}
           {:source 85  :target 29  :relation :child}
           {:source 86  :target 78  :relation :partner}
           {:source 87  :target 82  :relation :partner}
           {:source 88  :target 36  :relation :child}
           {:source 88  :target 37  :relation :child}
           {:source 88  :target 68  :relation :partner}
           {:source 89  :target 38  :relation :child}
           {:source 89  :target 40  :relation :child}
           {:source 90  :target 41  :relation :child}
           {:source 90  :target 44  :relation :child}
           {:source 91  :target 84  :relation :partner}
           {:source 92  :target 36  :relation :child}
           {:source 92  :target 37  :relation :child}
           {:source 93  :target 49  :relation :child}
           {:source 93  :target 52  :relation :child}
           {:source 93  :target 77  :relation :partner}
           {:source 96  :target 41  :relation :child}
           {:source 96  :target 44  :relation :child}
           {:source 98  :target 32  :relation :child}
           {:source 98  :target 47  :relation :child}
           {:source 99  :target 30  :relation :child}
           {:source 99  :target 48  :relation :child}
           {:source 100 :target 49  :relation :child}
           {:source 100 :target 52  :relation :child}
           {:source 101 :target 32  :relation :child}
           {:source 101 :target 47  :relation :child}
           {:source 102 :target 101 :relation :partner}
           {:source 103 :target 33  :relation :child}
           {:source 103 :target 34  :relation :child}
           {:source 104 :target 96  :relation :partner}
           {:source 105 :target 103 :relation :partner}
           {:source 106 :target 82  :relation :partner}
           {:source 107 :target 45  :relation :child}
           {:source 107 :target 58  :relation :child}
           {:source 108 :target 30  :relation :child}
           {:source 108 :target 48  :relation :child}
           {:source 108 :target 97  :relation :partner}
           {:source 109 :target 45  :relation :child}
           {:source 109 :target 58  :relation :child}
           {:source 109 :target 94  :relation :partner}
           {:source 110 :target 32  :relation :child}
           {:source 110 :target 47  :relation :child}
           {:source 111 :target 43  :relation :child}
           {:source 111 :target 50  :relation :child}
           {:source 113 :target 30  :relation :child}
           {:source 113 :target 48  :relation :child}
           {:source 114 :target 45  :relation :child}
           {:source 114 :target 58  :relation :child}
           {:source 114 :target 95  :relation :partner}
           {:source 115 :target 32  :relation :child}
           {:source 115 :target 47  :relation :child}
           {:source 116 :target 43  :relation :child}
           {:source 116 :target 50  :relation :child}
           {:source 117 :target 57  :relation :child}
           {:source 117 :target 61  :relation :child}
           {:source 118 :target 51  :relation :child}
           {:source 118 :target 60  :relation :child}
           {:source 119 :target 79  :relation :partner}
           {:source 120 :target 55  :relation :child}
           {:source 120 :target 63  :relation :child}
           {:source 120 :target 112 :relation :partner}
           {:source 121 :target 72  :relation :child}
           {:source 121 :target 76  :relation :child}
           {:source 122 :target 117 :relation :partner}
           {:source 123 :target 45  :relation :child}
           {:source 123 :target 58  :relation :child}
           {:source 124 :target 43  :relation :child}
           {:source 124 :target 50  :relation :child}
           {:source 125 :target 51  :relation :child}
           {:source 125 :target 60  :relation :child}
           {:source 126 :target 55  :relation :child}
           {:source 126 :target 63  :relation :child}
           {:source 127 :target 64  :relation :child}
           {:source 127 :target 65  :relation :child}
           {:source 128 :target 62  :relation :child}
           {:source 128 :target 70  :relation :child}
           {:source 129 :target 51  :relation :child}
           {:source 129 :target 60  :relation :child}
           {:source 130 :target 53  :relation :child}
           {:source 130 :target 66  :relation :child}
           {:source 131 :target 55  :relation :child}
           {:source 131 :target 63  :relation :child}
           {:source 132 :target 56  :relation :child}
           {:source 132 :target 59  :relation :child}
           {:source 133 :target 53  :relation :child}
           {:source 133 :target 66  :relation :child}
           {:source 134 :target 64  :relation :child}
           {:source 134 :target 65  :relation :child}
           {:source 135 :target 62  :relation :child}
           {:source 135 :target 70  :relation :child}
           {:source 136 :target 32  :relation :child}
           {:source 136 :target 47  :relation :child}
           {:source 137 :target 62  :relation :child}
           {:source 137 :target 70  :relation :child}
           {:source 138 :target 56  :relation :child}
           {:source 138 :target 59  :relation :child}
           ]})
