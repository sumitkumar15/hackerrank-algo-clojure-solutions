;Status : solved
(use '[clojure.string :only (split triml)])
(defn abs [x] (max x (- x)))
(
  let [
       n_t (read-line)
       n_arr (split n_t #"\s+")
       n (Integer/parseInt (first n_arr))
       k (Integer/parseInt (second n_arr))
       ]
  (let [matches (loop [i n luck-list '()]
                  (if (= i 0)
                    luck-list
                    (let [
                          ar_temp (read-line)
                          ar_t (split ar_temp #"\s+")
                          ar (map #(Integer/parseInt %) ar_t)
                          ]
                      (recur (dec i) (conj luck-list ar))
                      )))

        ]
    (let [sorted (reverse (sort-by first matches))]
      (let [result (loop [[match & remm] sorted acc 0 i k]
                     (if (nil? match)
                       acc
                       (if (= (second match) 0)
                         (recur remm (+ (first match) acc) i)
                         (cond
                           (= i 0) (recur remm (- acc (first match)) i)
                           :else (recur remm (+ acc (first match)) (dec i))
                           ))
                       ))
            ]
        (println result))
          )
        )
  )