(def Accounts [])
(defn addAccount [val] (concat Accounts [atom {val}])))

(addAccount 1)


