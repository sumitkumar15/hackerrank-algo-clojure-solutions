(use '[clojure.string :only (split triml)])

(defn next-pow-2
  ([x]
   (next-pow-2 x 1))
  ([x num]
   (if (> num x)
     num
     (recur x (bit-shift-left num 1))))
  )

(let [
       q_t (read-line)
       q (Integer/parseInt q_t)
       ]

  (loop [a0 q]
    (when (> a0 0)

      (
        let [
             x_t (read-line)
             x (Long/parseLong x_t)
             ]
        (println (- (next-pow-2 x) x 1))
        )

      (recur (- a0 1) ) )
    )

  )
