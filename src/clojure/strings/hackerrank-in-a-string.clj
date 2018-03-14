;solved
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
             ]
        (let [result (loop [x s l '(\h \a \c \k \e \r \r \a \n \k)]
                       ;(println x)
                       (if (empty? l)
                         "YES"
                         (if (empty? x)
                           "NO"
                           (recur (rest (drop-while #(not= % (first l)) x)) (rest l)))
                         )
                       )
              ]
          (println result))
        )
      (recur (- a0 1) ) )
    )

  )
