(use '[clojure.string :only (split triml)])

(
  let [
       n_t (read-line)
       n (Integer/parseInt n_t)
       ]

  (
    let [
         s (read-line)
         ]
    (
      let [
           k_t (read-line)
           k (Integer/parseInt k_t)
           ]
      (println (apply str (for [i s] (if (and (>= (int i) 65) (<= (int i) 90))
                                       (char (+ 65 (mod (+ (- (int i) 65) (mod k 26)) 26)))
                                       (if (and (>= (int i) 97) (<= (int i) 122))
                                         (char (+ 97 (mod (+ (- (int i) 97) (mod k 26)) 26)))
                                         i
                                         )

                                       ))))
      )
    )

  )