;Solved
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
             s (read-line)
             ]
        (if (odd? (count s))
          (println -1)
          (let [ss (split-at (int (/ (count s) 2)) s) s1 (first ss) s2 (second ss)]
            (let [
                  f1 (into (sorted-map) (frequencies s1))
                  f2 (into (sorted-map) (frequencies s2))
                  ]
              (println (reduce + (map
                                   (fn [k]
                                     (let [diff (- (get f2 k) (get f1 k 0))]
                                       (if (pos? diff)
                                         diff
                                         0)))
                                      (keys f2))))
              ))
          )
        )

      (recur (- a0 1) ) )
    )

  )
