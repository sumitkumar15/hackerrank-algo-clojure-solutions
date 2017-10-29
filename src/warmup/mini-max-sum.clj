(use '[clojure.string :only (split triml)])

(
  let [
       arr_temp (read-line)
       arr_t (split arr_temp #"\s+")
       arr (map #(Integer/parseInt %) arr_t)
       ]
  (let [sum (reduce + arr)]
    (let [summed (for [temp arr]
                   (- sum temp))]
      (println (apply max summed))
      (println (apply min summed)))
    )
  )