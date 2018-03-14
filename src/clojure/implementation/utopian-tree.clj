(use '[clojure.string :only (split triml)])

(let [
       t_t (read-line)
       t (Integer/parseInt t_t)
       ]

  (loop [a0 t]
    (when (> a0 0)

      (let [
             n_t (read-line)
             n (Integer/parseInt n_t)
             ]
        (loop [i 1 height 1]
          (if (> i n)
            (println height)
            (if (odd? i)
              (recur (inc i) (* height 2))
              (recur (inc i) (inc height)))))
        )

      (recur (- a0 1) ) )
    )

  )
