(defn  colTypeCol [n] (if (vector? n) :vector (if (map? n) :map ( if (list? n) :list :set ))))
(println (colTypeCol '(1 2 3 4) ))
