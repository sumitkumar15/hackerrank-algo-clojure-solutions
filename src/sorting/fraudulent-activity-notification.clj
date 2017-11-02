(use '[clojure.string :only (split triml)])
(defn helper
  [tlist len actual]
  (if (even? len)
    (cond
      (= (first tlist) (/ len 2)) (/ (+ actual (inc actual)))
      )
    (if (> (first tlist) (int (/ len 2)))
      actual
      (recur (cons (reduce + (take 2 tlist)) (rest tlist)) len (inc actual))))

  )
(defn median
  [x]
  (let [freq (into (sorted-map) (frequencies x))]
    )
  (let [ ((comp vec sort) (drop-last x)) len (count sorted)]
    (if (even? len)
      (/ (+ (sorted (int (/ len 2))) (sorted (inc (int (/ len 2))))) 2)
      (sorted (int (/ len 2)))))
  )
(defn notif
  [lis]
  (let [tvec (vec lis)
        len (count tvec)]
    (if (>= (tvec (dec len)) (* 2 (median (butlast tvec))))
      true
      false))
    )
(defn calc
  [tvec d i j buffer]
  )
(
  let [
       n_temp (read-line)
       n_t (split n_temp #"\s+")
       n (Integer/parseInt (n_t 0))
       d (Integer/parseInt (n_t 1))
       ]

  (
    let [
         expenditure_temp (read-line)
         expenditure_t (split expenditure_temp #"\s+")
         expenditure (map #(Integer/parseInt %) expenditure_t)
         ]
        (time (println (count (filter true? (map notif (partition (inc d) 1 expenditure))))))
    )
  )
