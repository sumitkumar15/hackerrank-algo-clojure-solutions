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
      (let [
            n_t (split (read-line) #"\s+")
            n (Integer/parseInt (first n_t))
            k (Integer/parseInt (second n_t))

            n_temp1 (read-line)
            n_t1 (split n_temp1 #"\s+")
            arr1 (map #(Integer/parseInt %) n_t1)

            n_temp2 (read-line)
            n_t2 (split n_temp2 #"\s+")
            arr2 (map #(Integer/parseInt %) n_t2)
            ]
        (let [a1 (sort arr1) a2 (reverse (sort arr2))]
          (loop [a a1 b a2]
            (if (empty? a)
              (println "YES")
              (if (< (+ (first a) (first b)) k)
                (println "NO")
                (recur (rest a) (rest b))))
            ))
        )
      (recur (- a0 1) ) )
    )
  )
