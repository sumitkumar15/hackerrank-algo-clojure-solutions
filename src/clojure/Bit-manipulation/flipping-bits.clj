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
        (println (bit-xor num (- (bit-shift-left 1 32) 1)))
         )
      (recur (- a0 1) ) )
    )
  )
