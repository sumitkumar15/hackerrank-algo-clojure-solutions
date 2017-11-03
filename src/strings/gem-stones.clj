;solved
(use '[clojure.string :only (split triml)])
(use '[clojure.set])
(
  let [
       n_t (read-line)
       n (Integer/parseInt n_t)
       ]

  (
    let [
         arr (for [arr_temp (range n)] (read-line))
         ]
    (println (count (apply clojure.set/intersection (map #(apply hash-set (seq %)) arr))))
    )

  )
