(use '[clojure.string :only (split triml)])

(
  let [
       t_t (read-line)
       t (Integer/parseInt t_t)
       ]

  (
    loop [a0 t]
    (when (> a0 0)

      (
        let [
             n_temp (read-line)
             n_t (split n_temp #"\s+")
             n (Integer/parseInt (n_t 0))
             c (Integer/parseInt (n_t 1))
             m (Integer/parseInt (n_t 2))
             ini (int (/ n c))
             ]
        (loop [wr ini choc ini]
          ;(println wr choc)
          (if (< wr m)
            (println choc)
            (recur (+ (int (/ wr m)) (mod wr m))  (+ choc (int (/ wr m))))
            ))
        )

      (recur (- a0 1) ) )
    )

  )
