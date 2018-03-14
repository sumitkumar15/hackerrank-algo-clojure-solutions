(use '[clojure.string :only (split triml)])
(defn abs [x] (max x (- x)))
(defn calc
  [lis k counter]
  ;(println lis)
  (if (empty? lis)
    counter
    (recur (loop [temp-list (rest lis) sum 0]
             (if (empty? temp-list)
               temp-list
               (if (and (<= (first temp-list) k) (<= (+ sum (first temp-list)) (* 2 k)))
                 (recur (rest temp-list) (+ sum (first temp-list)))
                 temp-list))
             )
           k
           (inc counter))
    ))
(
  let [
       n_temp (read-line)
       n_t (split n_temp #"\s+")
       n (Integer/parseInt (n_t 0))
       k (Integer/parseInt (n_t 1))
       ]

  (
    let [
         x_temp (read-line)
         x_t (split x_temp #"\s+")
         x (map #(Integer/parseInt %) x_t)
         ]
    (let [diffed (cons 0 (map #(abs (apply - %)) (partition 2 1 (sort x))))]
      ;(println diffed)
      (println (calc diffed k 0))
      )
    )
  )