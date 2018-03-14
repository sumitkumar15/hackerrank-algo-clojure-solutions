(use '[clojure.string :only (split triml)])
(defn abs [x] (max x (- x)))
(let [
      n_t (read-line)
      t (Integer/parseInt n_t)
      ]
  (loop [i t]
    (when (> i 0)
      (let [
            n (Integer/parseInt (read-line))
            a (Integer/parseInt (read-line))
            b (Integer/parseInt (read-line))
            ]
        (let [diff (if (= a b) a (abs (- a b)))  mn (* (dec n) (min a b)) mx (* (dec n) (max a b))]
          (let [ss (loop [i mn rset (sorted-set)]
                     (if (> i mx)
                       rset
                       (recur (+ i diff) (conj rset i))))]
            (apply println ss)
            )
          )

        (recur (dec i))
        )
      ))

  )
