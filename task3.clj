(defmacro unless [test body final] (list 'if (list 'not test) body final))
(unless true (println "fuck") (println "off"))

(defprotocol Gabby 
  (state [c])
  (feed [c])
  (sleep [c]))

(defrecord baby [mood] Gabby
  (state [_] (println mood))
  (feed [_] (baby. "Eeepy"))
  (sleep [_] (baby. "Hungy"))
  Object (toString [this] (str (this state))))

(def bingus (baby. "Eeepy"))
(state (feed bingus))
(state (sleep (feed bingus)))
