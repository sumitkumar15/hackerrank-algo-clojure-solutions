(use '[clojure.string :only (split triml)])
(defn abs [x] (max x (- x)))
(defn calc
  [lis prev buffer sbuffer]
  (if (empty? lis)
    sbuffer
    (if (> (first lis) prev)
      (recur (rest lis) (first lis) (conj buffer (first lis)) (if (> (count buffer) (count sbuffer)) buffer sbuffer))
      (recur (rest lis) (first lis)  (list (first lis)) sbuffer)))
  )
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
    (let [largest (calc x 0 '() '())]
      (println (if (>= (+ largest k) n) n (+ largest k)))
      )))