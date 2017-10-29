(use '[clojure.string :only (split triml)])

(
  let [
       n_t (read-line)
       n (Integer/parseInt n_t)
       ]

  (
    let [
         grades (for [grades_temp (range n)] (read-string (read-line)) )
         ]
    (let [updated (for [k grades] (if (> k 37)
                                    (if (< (mod k 5) 3)
                                      k
                                      (* 5 (int (+ 1 (/ k 5)))))
                                    k)
                                  )]
      (doseq [i updated] (println i)))
    )
  )