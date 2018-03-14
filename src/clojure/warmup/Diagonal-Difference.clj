(use '[clojure.string :only (split triml)])

(defn abs [n] (max n (- n)))
(
  let [
       n_t (read-line)
       n (Integer/parseInt n_t)
       ]

  (
    let [
         a (for [a_temp (range n)]  (map #(Integer/parseInt %) (split (read-line) #"\s+") )  )
         ]
    (let [arr (map #(vector %1 %2) a (range))]
      (println (abs (- (reduce + (for [temp arr] (nth (first temp) (second temp))))
                       (reduce + (for [temp arr] (nth (first temp) (- (dec n) (second temp)) ))))))
      )
    )
  )



