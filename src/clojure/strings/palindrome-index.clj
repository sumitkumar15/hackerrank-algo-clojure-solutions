(use '[clojure.string :only (split triml)])
(defn abs [x] (max x (- x)))
(
  let [
       q_t (read-line)
       q (Integer/parseInt q_t)
       ]

  (
    loop [a0 q]
    (when (> a0 0)

      (
        let [
             s (read-line)
             ]
        (let [indexed (map #(list %1 %2) s (range))]
          (let [freq  (frequencies s)]
            (let [[k v] (first (filter (fn [[k v]] (odd? v)) freq))]
              ;(println k v)
              (let [
                    filtered (filter #(= k (first %)) indexed)
                    f2 (map second filtered)
                    v (vec s)
                    len (count s)
                    ]
                ;(println filtered)
                ;(println "f2" f2)
                ;(println filtered)
                (loop [[x & ll] f2]
                  ;(println x)
                  (if (nil? x)
                    (println -1)
                    (if (not= (get v x) (get v (- (dec len) x)))
                      (println x)
                      (recur ll))
                    )
                  )
                )
              )
            )

          )
        )

      (recur (- a0 1) ) )
    )

  )
