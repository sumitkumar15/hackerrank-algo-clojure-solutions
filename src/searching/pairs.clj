(use '[clojure.string :only (split triml)])
(
  let [
       n_t (read-line)
       n_tt (split n_t #"\s+")
       n (Integer/parseInt (first n_tt))
       k (Integer/parseInt (second n_tt))
       ]

  (
    let [
         a_temp (read-line)
         a_t (split a_temp #"\s+")
         a (map #(Integer/parseInt %) a_t)
         ]
    ;(println k)
    (let [lookup (apply merge (map #(hash-map % 1) a))]
      (let [result (loop [i a counter 0]
                     ;(println i sorted counter)
                     (if (empty? i)
                       counter
                       (let [res (get lookup (+ (first i) k))]
                         ;(println "index" index)
                         (if (nil? res)
                           (recur (rest i) counter)
                           (recur (rest i) (inc counter)))
                         )))
            ]
        (println result))
      )
    ))
