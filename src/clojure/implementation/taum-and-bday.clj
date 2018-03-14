(use '[clojure.string :only (split triml)])

(
  let [
       t_t (read-line)
       t (Integer/parseInt t_t)
       ]

  (
    loop [a0 t]
    (when (> a0 0)

      (let [
             b_temp (read-line)
             b_t (split b_temp #"\s+")
             b (Integer/parseInt (b_t 0))
             w (Integer/parseInt (b_t 1))
             ]
        (let [
               x_temp (read-line)
               x_t (split x_temp #"\s+")
               x (Integer/parseInt (x_t 0))
               y (Integer/parseInt (x_t 1))
               z (Integer/parseInt (x_t 2))
               ]
          (if (<= (+ x z) y)
            (println (+ (* w (+ x z)) (* b x)))
            (if (<= (+ y z) x)
              (println (+ (* w y) (* b (+ y z))))
              (println (+ (* w y) (* b x)))))
          )
        )



      (recur (- a0 1) ) )
    )

  )
