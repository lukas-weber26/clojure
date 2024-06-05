(defprotocol Compass
    (direction [c]) 
    (left [c])
    (right [c]))

(def directions [:north :east :south :west])

(defn turn [base amount] (rem (+ base amount) (count directions )))


(defrecord simpleCompass [bearing] Compass
  (direction [_] (directions bearing))
  (left [_] (simpleCompass. (turn bearing 3)))
  (right [_] (simpleCompass. (turn bearing 1)))
  Object (toString [this] (str "{" (direction this) "]")))

(def c (simpleCompass. 0))
(println (str (left c)))
(println (:bearing (right c)))
