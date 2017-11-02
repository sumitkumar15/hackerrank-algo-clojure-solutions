;#Status : Solved
(use '[clojure.string :only (split triml)])
(defn exp [x n]
  (loop [acc 1 n n]
    (if (zero? n) acc
                  (recur (* x acc) (dec n)))))
(defn calc
  [calories miles index]
  (if (empty? calories)
    miles
    (recur (rest calories) (+ miles (* (first calories) (exp 2 index))) (inc index)))
  )
(
  let [
       n_t (read-line)
       n (Integer/parseInt n_t)
       ]

  (
    let [
         calories_temp (read-line)
         calories_t (split calories_temp #"\s+")
         calories (map #(Integer/parseInt %) calories_t)
         ]
    (println (calc (reverse (sort calories)) 0 0))

    )
  ; your code goes here
  )
