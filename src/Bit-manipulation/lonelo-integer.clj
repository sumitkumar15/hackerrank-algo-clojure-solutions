;#Status :Solved
(use '[clojure.string :only (split triml)])

(
  let [
       n_t (read-line)
       n (Integer/parseInt n_t)
       ]

  (
    let [
         a_temp (read-line)
         a_t (split a_temp #"\s+")
         a (map #(Integer/parseInt %) a_t)
         ]
    (println (reduce bit-xor a))
    )

  )
