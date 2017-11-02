(use '[clojure.string :only (split triml)])
(defn abs [x] (max x (- x)))

(
  let [
       t (Integer/parseInt (read-line))
       ]
  (loop [i t]
    ;(println "i=" i)
    (if (= 0 i)
      nil
      (do (let [
                m (Integer/parseInt (read-line))
                n (Integer/parseInt (read-line))
                ]
            ;(println m n)
            (let [
                  x_temp (read-line)
                  x_t (split x_temp #"\s+")
                  x (map #(Integer/parseInt %) x_t)
                  ]
              ;(println x)
              (let [tlist (map #(vector %1 %2) x (range))]
                (let [final (loop [lis tlist]
                              (let [
                                    result (loop [x (first lis) [y & ys] (rest lis)]
                                             (if (nil? y)
                                               nil
                                               (if (= m (+ (x 0) (y 0)))
                                                 y
                                                 (recur x ys))))
                                    ]
                                (if (nil? result)
                                  (recur (rest lis))
                                  [(first lis) result]
                                  ))
                              )]
                  (apply println (sort (map #(inc (get % 1))  final))))
                )
              )
            )
          (recur (dec i)))
      )

    ))