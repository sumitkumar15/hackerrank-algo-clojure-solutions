(use '[clojure.string :only (split triml)])

(defn median
  [x]
  (let [freq (into (sorted-map) (frequencies x)) len (count x)]
    (let [freq-vec (vec (flatten (map #(repeat (get freq % 0) %) (range 201))))]
      (if (odd? len)
        (get freq-vec (int (/ len 2)))
        (/ (+ (get freq-vec (/ len 2)) (get freq-vec (inc (/ len 2)))) 2))
      )))
(defn notif
  [lvec]
  (let [tvec (subvec lvec 0 (dec (count lvec))) spend (get lvec (dec (count lvec)))]
    (if (>= spend (* 2 (median tvec)))
      true
      false)
    ))
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
    (let [v_exp (vec expenditure)]
      (let [result (loop [i 0 ncount 0]
                     (if (> i (- n (inc d)))
                       ncount
                       (if (notif (subvec v_exp i (+ i (inc d))))
                         (recur (inc i) (inc ncount))
                         (recur (inc i) ncount)))
                     )
            ]
        (println result)))
    )
  )
