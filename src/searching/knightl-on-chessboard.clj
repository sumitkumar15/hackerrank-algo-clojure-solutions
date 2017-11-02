(use '[clojure.string :only (split triml)])
(defn bfs
  [])
(defn possible-moves
  [start delta visited n]
  (let [possible (reduce concat (for [i start] (concat (map #(list i (+ i %)) delta) (map #(list i (- i %)) delta))))]
    (filter (fn
              [x]
              ()) ))
  )mod
(defn calc
  [[a b] n]
  )
(
  let [
       n_t (read-line)
       n (Integer/parseInt n_t)
       ]
  (loop [i 1]
    (if (= n i)
      (apply println (map (fn [x] (calc x n)) (apply map #(list %1 %2) (repeat i) (range 1 n))))
      (recur (inc i)))
    )
  )
