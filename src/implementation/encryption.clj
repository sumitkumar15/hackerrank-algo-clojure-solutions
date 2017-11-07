(use '[clojure.string :only (split triml)])
(use '[clojure.string])
(defn l-print
  [pr ll]
  ;(println ll)
  (if (empty? pr)
    (apply println (clojure.core/reverse ll))
    (let [x (map first pr) f (filter #(= (empty? %) false) (map #(drop 1 %) pr))]
      ;(println x pr)
      ;(println f)
      (recur
        f
        (conj ll (apply str x))
        )))
  )

(let [
       s (read-line)
       ]

  (let [ss (clojure.string/replace s #" " "")
        c (count ss)
        row (int (Math/sqrt c))
        col (if (> (Math/sqrt c) row) (inc row) row)]

    (let [pr (partition  col col nil ss)]
      (l-print pr '())
      )
    )

  )
