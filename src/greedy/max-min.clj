(use '[clojure.string :only (split triml)])

(
  let [
       q_t (read-line)
       q (Integer/parseInt q_t)
       k (Integer/parseInt (read-line))
       ]
  (let [sll (loop [a0 q lis '()]
             (if (= a0 0)
               (vec (sort lis))
               (let [
                     a (Integer/parseInt (read-line))
                     ]
                 (recur (- a0 1) (conj lis a)))))
        ]
    ;(println sll)
    (loop [i 0 j (dec k) minimun Integer/MAX_VALUE]
      (if (= j q)
        (println minimun)
        (recur (inc i) (inc j) (min minimun (- (get sll j) (get sll i))))))
    )
  )
