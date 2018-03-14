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
      (let [num (Long/parseLong (read-line))]
        (if (even? (Long/bitCount (dec num)))
          (println "Richard")
          (println "Louise")) )
      (recur (- a0 1) ) )
    )
  )
