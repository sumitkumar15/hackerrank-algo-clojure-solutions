;Status: Solved
(use '[clojure.string :only (split triml)])

(
  let [
       T_t (read-line)
       T (Integer/parseInt T_t)
       ]

  (
    loop [a0 T]
    (when (> a0 0)

      (
        let [
             n_t (read-line)
             n (Integer/parseInt n_t)
             ]
        )

      (
        let [
             a_temp (read-line)
             a_t (split a_temp #"\s+")
             a (map #(Integer/parseInt %) a_t)
             ]
        (let [x (vec a)]
          (cond
            (= 1 (count x)) (println "YES")
            (= 2 (count x)) (println "NO")
            :else (let [
                  result (loop [i 0 j (dec (count x)) leftsum (x i) rightsum (x (dec (count x)))]
                           (if (>= i (- j 2))
                             (if (= leftsum rightsum)
                               "YES"
                               "NO")
                             (if (>= leftsum rightsum)
                               (recur i (dec j) leftsum (+ rightsum (x (dec j))))
                               (recur (inc i) j (+ leftsum (x (inc i))) rightsum))
                             )
                           )
                  ]
              (println result)))
          )
        )

      (recur (- a0 1) ) )
    )

  )
