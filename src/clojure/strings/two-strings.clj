(use '[clojure.string :only (split triml)])

(
  let [
       q_t (read-line)
       q (Integer/parseInt q_t)
       ]

  (
    loop [a0 q]
    (when (> a0 0)
      (let [
             s1 (read-line)
             s2 (read-line)
             ]
        (let [m1 (frequencies s1) m2 (frequencies s2)]
          (loop [[k & kys] (keys m1)]
            (if (nil? k)
              (println "NO")
              (if (get m2 k)
                (println "YES")
                (recur kys))))
          )

        )
      (recur (- a0 1) ) )
    )

  )
