(use '[clojure.string :only (split triml)])
(defn next-pow-2
  ([x]
    (next-pow-2 x 1))
  ([x num]
   (if (> num x)
     num
     (recur x (bit-shift-left num 1))))
  )
(let [
      n_t (read-line)
      n (Integer/parseInt n_t)
      ]
  (loop [i n]
    (when (> i 0)
      (let [
            n_t (split (read-line) #"\s+")
            l (Long/parseLong (first n_t))
            r (Long/parseLong (second n_t))
            xor (bit-xor l r)
            np2 (dec (next-pow-2 xor))
            ]
       (println (bit-and l (bit-xor (dec (bit-shift-left 1 32)) np2) ))
        (recur (dec i))
        )
      ))

  )
