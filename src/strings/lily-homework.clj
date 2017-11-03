(use '[clojure.string :only (split triml)])
(use '[clojure.set])
(
  let [
       n_t (read-line)
       n (Integer/parseInt n_t)
       ]

  (
    let [
         arr_t (read-line)
         arr (map #(Integer/parseInt %) (split arr_t #"\s+"))
         ]
    (let [updated (sort arr)]
      (let [result-set (map = arr updated)]
        (println (dec (count (filter false? result-set)))))
      )

    )

  )