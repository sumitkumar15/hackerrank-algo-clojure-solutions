(use '[clojure.string :only (split triml)])
(def M 1000000007)
(defn modulo
  [N mval]
  (if (< N 25)
    (mod (* mval (bit-shift-left 1 N)) M)
    (recur (- N 25) (mod (* mval (bit-shift-left 1 25)) M)))
  )
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
        (let [ored (apply bit-or arr)]
          (println (mod (* ored (modulo (dec n) 1)) M)))
        (recur (dec i))
        )
      ))

  )
