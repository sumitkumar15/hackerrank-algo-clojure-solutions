(use '[clojure.string :only (split triml)])
(defn G
  [x]
  (let [n (mod x 8)]
    (cond
      (or (= n 0) (= n 1)) x
      (or (= n 2) (= n 3)) 2
      (or (= n 4) (= n 5)) (+ x 2)
      :else 0
      )))
(
  let [
       Q_t (read-line)
       Q (Integer/parseInt Q_t)
       ]

  (
    loop [a0 Q]
    (when (> a0 0)

      (
        let [
             L_temp (read-line)
             L_t (split L_temp #"\s+")
             L (Long/parseLong (L_t 0))
             R (Long/parseLong (L_t 1))
             ]
        (println (bit-xor (G R) (G (dec L))))
        )

      (recur (- a0 1) ) )
    )

  )
