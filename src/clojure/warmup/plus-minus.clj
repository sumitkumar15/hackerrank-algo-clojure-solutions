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
    (println (format "%.6f" (float (/ (count (filter #(> % 0) arr)) (count arr))))
             (format "%.6f" (float (/ (count (filter #(< % 0) arr)) (count arr))))
             (format "%.6f" (float (/ (count (filter #(= % 0) arr)) (count arr)))))
    )
  )