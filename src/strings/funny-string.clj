;solved
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

      (
        let [
             s (seq (read-line))
             ]
        (let [rev-s (reverse s)]
          (let [a (map (fn [x] (abs (- (int (first x)) (int (second x))))) (partition 2 1 s))]
            (let [b (map (fn [x] (abs (- (int (first x)) (int (second x))))) (partition 2 1 rev-s))]
              (if (= a b)
                (println "Funny")
                (println "Not Funny"))))
          )
        )

      (recur (- a0 1) ) )
    )

  )
