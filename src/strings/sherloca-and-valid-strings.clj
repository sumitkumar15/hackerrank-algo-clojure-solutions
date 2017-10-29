(use '[clojure.string :only (split triml)])
(defn abs [x] (max x (- x)))
(
  let [
       s (read-line)
       ]
    (let [x (frequencies s)]
      (if (= (count x) 2)
        (if (<= (abs (reduce - (vals x))) 1)
          (println "YES")
          (println "NO"))
        (let [summed (reduce + (vals x))]
          (if (or (= 0 (mod summed (count x))) (= 1 (mod summed (count x))))
            (println "YES")
            (println "NO"))))

      )
  )