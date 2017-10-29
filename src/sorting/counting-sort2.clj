(use '[clojure.string :only (split triml)])
(
  let [
       n_t (read-line)
       n (Integer/parseInt n_t)
       ]

  (
    let [
         ar_temp (read-line)
         ar_t (split ar_temp #"\s+")
         ar (map #(Integer/parseInt %) ar_t)
         ]
    (let [fmap (frequencies ar)]
      (let [result (map #(get fmap % 0) (range 100))]
        (let [lis (map vector result (range))]
          (apply println (flatten (for [i lis]
                                    (repeat (get i 0) (get i 1)))))
          ))))
  )