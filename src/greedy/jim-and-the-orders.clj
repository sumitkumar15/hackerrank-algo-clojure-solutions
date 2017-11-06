(use '[clojure.string :only (split triml)])

(
  let [
       t_t (read-line)
       t (Integer/parseInt t_t)
       ]

  (let [ll (loop [a0 1 lis '()]
             (if (= a0 (inc t))
               (reverse lis)
               (let [
                     n_t (split (read-line) #"\s+")
                     time (Integer/parseInt (first n_t))
                     dtime (Integer/parseInt (second n_t))
                     ]
                 (recur (inc a0) (conj lis (list a0 (+ time dtime))))
                 )))
        ]
    (apply println (map first (sort-by second ll)))
    )
  )
