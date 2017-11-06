(use '[clojure.string :only (split triml)])

(let [
       n_t (read-line)
       n (Integer/parseInt n_t)
       ]

  (let [
         A_temp (read-line)
         A_t (split A_temp #"\s+")
         A (map #(Integer/parseInt %) A_t)
         ]
    (let [tr (map #(list %1 %2) A (range))]
      (let [sorted (sort-by first tr)]
        ))
    )

  )
