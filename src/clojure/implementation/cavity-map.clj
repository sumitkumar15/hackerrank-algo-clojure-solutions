; Incorrect
(use '[clojure.string :only (split triml)])
(defn calc
  [[f m l & remm] buffer]
  (if (nil? l)
    (reverse (conj (conj buffer f) m))
    (if (and (> m f) (> m l))
      (recur (conj remm l) (conj (conj buffer f) \X))
      (recur (conj (conj remm l) m) (conj buffer f))))
  )
(
  let [
       n_t (read-line)
       n (Integer/parseInt n_t)
       ]

  (
    let [
         grid (for [grid_temp (range n)] (read-line))
         ]
    (let [g (map (fn [x] (calc (map #(Integer/parseInt (str %)) (seq x)) '())) grid)]
      (loop [i g]
        (if (empty? i)
          nil
          (do
            (println (apply str (first i)))
            (recur (rest i))))
        )
      )
    )

  )
