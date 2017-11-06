(use '[clojure.string :only (split triml)])

(
  let [
       t_t (read-line)
       t (Integer/parseInt t_t)
       ]

  (
    let [
         n_t (read-line)
         n__t (split n_t #"\s+")
         arr (map #(Integer/parseInt %) n__t)
         ]
    (loop [aray (sort arr) cost 0]
      (if (empty? aray)
        (println cost)
        (recur (drop-while #(<= % (+ (first aray) 4)) aray) (inc cost))))
    )
  )
