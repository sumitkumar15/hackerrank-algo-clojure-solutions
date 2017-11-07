(use '[clojure.string :only (split triml)])

(
  let [
       n_temp (read-line)
       n_t (split n_temp #"\s+")
       n (Integer/parseInt (n_t 0))
       m (Integer/parseInt (n_t 1))
       ]

  (
    let [
         c_temp (read-line)
         c_t (split c_temp #"\s+")
         c (map #(Integer/parseInt %) c_t)
         ]
    (let [a (sort c)]
      (let [tr (map count (map #(range (inc (first %)) (second %)) (partition 2 1 a)))
            tr_a (conj tr (- (first a) 0))
            tr_b (conj tr (- n (last a)))]
        (println (/ (inc (apply max tr_b)) 2))
        ))
    )

  )
