(use '[clojure.string :only (split triml)])
(defn dijkstra
  [graph dist]

  )
(defn make-graph
  [nodes arr]
  (println arr (count arr) (count (aget arr 0)))
  (loop [nn nodes]
    (if (empty? nn)
      arr
      (let [u (dec (first (first nn)))  v (dec (second (first nn)))]
          (aset arr u v 6)
          (aset arr v u 6)
        ))
    )
  )
(
  let [
       q_t (read-line)
       q (Integer/parseInt q_t)
       ]

  (loop [a0 q]
    (when (> a0 0)
      (let [
             n_temp (read-line)
             n_t (split n_temp #"\s+")
             n (Integer/parseInt (n_t 0))
             m (Integer/parseInt (n_t 1))
             ]
        (let [nodes (loop [a1 m lis '()]
                      (if (= a1 0)
                        (reverse lis)
                        (let [
                              u_temp (read-line)
                              u_t (split u_temp #"\s+")
                              u (Integer/parseInt (u_t 0))
                              v (Integer/parseInt (u_t 1))
                              ]
                          (recur (dec a1) (conj lis (list u v)))
                          )))
              ]
          (let [
                s_t (read-line)
                s (Integer/parseInt s_t)
                ]
            ; code here

            (let [arr2 (to-array-2d (repeat n (repeat n Integer/MAX_VALUE))) adjacency (make-graph nodes arr2)]
              (println adjacency))
            )
          )

        )

      (recur (- a0 1) ) )
    )

  )
