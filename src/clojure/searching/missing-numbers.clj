;#Status: Solved
(use '[clojure.string :only (split triml)])
(
  let [
       n_t (read-line)
       n (Integer/parseInt n_t)
       ]

  (
    let [
         a_temp (read-line)
         a_t (split a_temp #"\s+")
         a (map #(Integer/parseInt %) a_t)
         ]
    (
      let [
           n_t (read-line)
           m (Integer/parseInt n_t)
           ]

      (
        let [
             a_temp (read-line)
             a_t (split a_temp #"\s+")
             b (map #(Integer/parseInt %) a_t)
             ]
        (let [a_Map (frequencies a) b_Map (frequencies b) final '()]
          (let [result (for [k (keys a_Map)]
                         (if (not= (get a_Map k) (get b_Map k))
                           k
                           nil))]
            (apply println (drop-while #(= % nil) (sort result)))
            )
          )
        )

      )

    )

  )
