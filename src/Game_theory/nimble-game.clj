;unsolved
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
            n (Integer/parseInt (read-line))
            s (map #(Long/parseLong %) (split (read-line) #"\s+"))
            ]
        (let [
              ll (flatten (partition 1 2 (rest s)))
              x (reduce (fn
                          ([a] a)
                          ([a b] (bit-xor a b))
                          ) ll)
              ]
          (if (= x 0)
            (println "Second")
            (println "First")))
        )
      (recur (- a0 1) ) )
    )

  )
