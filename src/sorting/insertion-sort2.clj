;#Status : Solved
(use '[clojure.string :only (split triml)])
(defn abs [x] (max x (- x)))

(
  let [
       n_temp (read-line)
       n (Integer/parseInt n_temp)
       ]

  (
    let [
         x_temp (read-line)
         x_t (split x_temp #"\s+")
         x (map #(Integer/parseInt %) x_t)
         ]
    (loop [initial (list (first x)) current (second x) final (rest (rest x))]
      (if (nil? current)
        (apply println initial)
        (do
          (apply println (into final (reverse (sort (cons current initial)))))
          (if (nil? (first final))
            nil
            (recur (sort (cons  current initial)) (first final) (rest final))            )
          )
        ))
    )
  )