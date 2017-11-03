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
              )
            )

          )
        )

      (recur (- a0 1) ) )
    )

  )
