(use '[clojure.string :only (split triml)])

(let [
      n_t (split (read-line) #"\s+")
      n (Integer/parseInt (first n_t))
      d (Integer/parseInt (second n_t))
      ]

  (let [
        A_temp (read-line)
        A_t (split A_temp #"\s+")
        A (map #(Integer/parseInt %) A_t)
        ]
    (let [mm (apply merge (map #(hash-map % 1) A))]
      (let [final (map (fn [x] (and (get mm (+ x d)) (get mm (+ x (* 2 d))))) A)]
        (println (- n (count (filter nil? final)))))
      )
    )

  )
