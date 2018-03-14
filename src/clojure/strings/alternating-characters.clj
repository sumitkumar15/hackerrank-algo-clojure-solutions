;solved
(use '[clojure.string :only (split triml)])

(let [
       q_t (read-line)
       q (Integer/parseInt q_t)
       ]

  (
    loop [a0 q]
    (when (> a0 0)

      (let [
             s (read-line)
             ]
        (let [result (loop [[f m & remm] s deletion 0]
                       (if (nil? m)
                         deletion
                         (if (= f m)
                           (recur (conj remm m) (inc deletion))
                           (recur (conj remm m) deletion)))
                       )
              ]
          (println result))
        )

      (recur (- a0 1) ) )
    )

  )
