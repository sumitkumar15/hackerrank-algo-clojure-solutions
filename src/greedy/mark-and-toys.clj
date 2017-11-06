(use '[clojure.string :only (split triml)])

(
  let [
       n_temp (read-line)
       n_t (split n_temp #"\s+")
       n (Integer/parseInt (n_t 0))
       k (Integer/parseInt (n_t 1))
       ]

  (
    let [
         prices_temp (read-line)
         prices_t (split prices_temp #"\s+")
         prices (map #(Integer/parseInt %) prices_t)
         ]
    (let [pr (sort prices)]
      (loop [p pr amt k countt 0]
        (if (> (first p) amt)
          (println countt)
          (recur (rest p) (- amt (first p)) (inc count)))))
    )

  )
