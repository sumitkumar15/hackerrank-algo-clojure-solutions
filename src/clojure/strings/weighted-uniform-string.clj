;Solved
(use '[clojure.string :only (split triml)])
(defn abs [x] (max x (- x)))
(
  let [
       s (read-line)
       n_t (read-line)
       n (Integer/parseInt n_t)
       ]
  (let [aseq (apply merge (map #(hash-map % 1) (map #(* (count %) (- (int (first %)) 97 -1))
                                        (flatten (map (fn [x]
                                                        (rest (reductions str (str) x)))
                                                      (map first (re-seq #"(.)\1{0,}" s))))))
                    )
        ]
    ;(println aseq)
    (time (loop [i n]
            (if (= i 0)
              nil
              (let [q (Integer/parseInt (read-line))]
                (if (nil? (get aseq q))
                  (println "No")
                  (println "Yes")
                  )
                (recur (dec i))))))

    )
  )