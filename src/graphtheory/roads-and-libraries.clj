(use '[clojure.string :only (split triml)])
(defn make-vec
  [[road & roads] setvect]
  ;(println road roads)
  ;(println setvect)
  (if (nil? road)
    (frequencies setvect)
    (let [r (sort road)]
      (recur
        roads
        (update setvect (dec (second r)) (fn [x] (get setvect (dec (first r)))) )))
    )
  )

(let [
       q_t (read-line)
       q (Integer/parseInt q_t)
       ]

  (
    loop [a0 q]
    (when (> a0 0)

      (let [
             n_temp (read-line)
             n_t (split n_temp #"\s+")
             n (Long/parseLong (n_t 0))
             m (Long/parseLong (n_t 1))
             x (Long/parseLong (n_t 2))
             y (Long/parseLong (n_t 3))
             ]

        (let [roads (loop [a1 m buffer '()]
                        (if (= a1 0)
                          buffer
                          (let [
                                city_1_temp (read-line)
                                city_1_t (split city_1_temp #"\s+")
                                city_1 (Long/parseLong (city_1_t 0))
                                city_2 (Long/parseLong (city_1_t 1))
                                ]
                            (recur (- a1 1) (conj buffer (list city_1 city_2)))
                            )))
              ]
          (if (< x y)
            (println (* x n))
            (do
              (let [freq (make-vec (reverse roads) (vec (range 1 (inc n))))]
                (println freq)
                (println (+ (* x (count freq)) (* y (- n (count freq)))))
                (println x y)
                ))
            )
          )
        )
      (recur (- a0 1) ) )
    )

  )
