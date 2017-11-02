;#Status : Solved
(use '[clojure.string :only (split triml)])
(defn abs [x] (max x (- x)))

(
  let [
       n_temp (read-line)
       n (Integer/parseInt n_temp)
       ]


  (
    let [
         x_temp (read-line)
         x_t (split x_temp #"\s+")
         x (map #(Integer/parseInt %) x_t)
         ]
    (if (= 1 (count x))
      (apply println x)
      (let [reversed (reverse x)]
        (let [elem (first reversed) lis (rest reversed)]
          (loop [initial (list) [x & remm] lis]
            (if (nil? x)
              (apply println (cons elem initial))
              (if (< elem x)
                (let [n-initial (cons x initial)]
                  (apply println (reverse (into (cons x remm) n-initial)))
                  (recur n-initial remm))
                (apply println (reverse (into (cons elem (cons x remm)) initial)))))
            )))
      )
    )
  )