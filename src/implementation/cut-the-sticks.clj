(use '[clojure.string :only (split triml)])

(
  let [
       n_t (read-line)
       n (Integer/parseInt n_t)
       ]

  (
    let [
         arr_temp (read-line)
         arr_t (split arr_temp #"\s+")
         arr (map #(Integer/parseInt %) arr_t)
         ]
    (let [sorted (sort arr)]
      (loop [[x & remm] sorted]
        (if (nil? x)
          x
          (do
            (println (inc (count remm)))
            (recur (filter #(not= % 0) (map #(- % x) (conj remm x))))))

        ))
    )

  )
