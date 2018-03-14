;#Status : Solved
(use '[clojure.string :only (split triml)])
(defn abs [x] (max x (- x)))
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
    (println (apply max (map #(abs (reduce - %)) (partition 2 1 arr))))
    )

  )
