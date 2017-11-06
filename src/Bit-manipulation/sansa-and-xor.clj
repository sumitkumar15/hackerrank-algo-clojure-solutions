(use '[clojure.string :only (split triml)])
(defn abs [x] (max x (- x)))
(
  let [
       q_t (read-line)
       q (Integer/parseInt q_t)
       ]

  (
    loop [a0 q]
    (when (> a0 0)
      (let [
            k (Integer/parseInt (read-line))
            n_temp (read-line)
            n_t (split n_temp #"\s+")
            arr (map #(Integer/parseInt %) n_t)
            ]
        (if (even? k)
          (println 0)
          (loop [i arr buffer 0]
            (if (empty? i)
              (println buffer)
              (recur (rest (rest i)) (bit-xor (first i) buffer)))))
        )
      (recur (- a0 1) ) )
    )
  )
