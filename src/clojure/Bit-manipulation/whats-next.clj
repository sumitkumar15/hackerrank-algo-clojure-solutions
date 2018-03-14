(use '[clojure.string :only (split triml)])

(let [
      n_t (read-line)
      n (Integer/parseInt n_t)
      ]
  (loop [i n]
    (when (> i 0)
      (let [
            n (Long/parseLong (read-line))
            n_t (split (read-line) #"\s+")
            arr (map #(Long/parseLong %) n_t)
            ]

        (recur (dec i))
        )
      ))

  )
