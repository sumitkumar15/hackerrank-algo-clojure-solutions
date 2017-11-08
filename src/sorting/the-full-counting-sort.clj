(use '[clojure.string :only (split triml)])

(
  let [
       q_t (read-line)
       q (Integer/parseInt q_t)
       ]
  (let [ll (loop [a0 q lis '()]
             (if (= a0 0)
               lis
               (let [
                     s (split (read-line) #"\s+")
                     a (Integer/parseInt (first s))
                     b (second s)
                     ]
                 (recur (- a0 1) (conj lis (list a b))))))
        ]
    (let [ rs (apply
                conj (map
                       (fn [[x y]] (list x \-))
                       (drop (/ (count ll) 2) ll))
                (reverse (take (/ (count ll) 2)
                               ll)))
          result (sort-by first (reverse rs))
          ]
      ;(println rs)
      (apply println (map second result)))
    )
  )
