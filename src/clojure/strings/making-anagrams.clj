;Solved
(use '[clojure.string :only (split triml)])
(use '[clojure.set])
(defn abs [x] (max x (- x)))

(
  let [
       s1 (read-line)
       ]

  (
    let [
         s2 (read-line)
         ]
    (let [
          f1 (frequencies s1)
          f2 (frequencies s2)
          kk (apply merge (set (keys f1)) (set (keys f2)))
          ]
      ;(println f1 f2 kk)
      (println (reduce + (map (fn [x] (abs (- (get f1 x 0) (get f2 x 0)))) kk)))
      )
    )

  )
