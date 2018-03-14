;#Status : Solved
(use '[clojure.string :only (split triml)])
(defn abs [x] (max x (- x)))
(
  let [
       n_t (read-line)
       n (Integer/parseInt n_t)
       ]

  (
    let [
         ar_temp (read-line)
         ar_t (split ar_temp #"\s+")
         ar (map #(Integer/parseInt %) ar_t)
         ]
    (let [result (sort ar)]
      (let [pairs (partition 2 1 result)]
        (let [minimun (apply min (map #(abs (reduce - %))  pairs))]
          (let [filtered (filter #(= (abs (reduce - %)) minimun) pairs)]
            ;(println filtered)
            (apply println (sort (flatten filtered))))))
      ))
  )