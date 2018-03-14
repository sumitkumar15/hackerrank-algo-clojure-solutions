(use '[clojure.string :only (split triml)])

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
             len (count s)
             ]
        (loop [i 1 counter 0]
          (if (= i len)
            (println counter)
            (let [
                  m (partition i 1 s)
                  freq (map frequencies m)
                  res_map (frequencies freq)
                  ]
              (println res_map (- (reduce + (vals res_map)) (count res_map) ))
              (recur
                (inc i)
                (+ counter (- (reduce + (vals res_map)) (count res_map) ))))
            ))
        )

      (recur (- a0 1) ) )
    )

  )
