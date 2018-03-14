(use '[clojure.string :only (split triml)])
(defn next-lex
  [ss longest piv]
  (if (empty? ss)
    longest
    (let [temp (loop [[a & rem] ss buffer '()]
                 (if (nil? a)
                   buffer
                   (if (> (first rem) a)
                     (recur rem (conj buffer a))
                     (conj buffer a)
                     )
                   ))
          ]
      (if (count))
      ) ))
(let [
      n_t (read-line)
      n (Integer/parseInt n_t)
      ]
  (loop [i n]
    (when (> i 0)
      (let [
            s (reverse (read-line))
            ]
        (println s)
        (loop [[fst & remm] s]
          (if (nil? fst)
            (println "no answer")
            (let [nl (next-lex fst (conj remm fst) (take (- n (+ 2 (count remm))) s))]
              (if nl
                (println (reverse nl))
                (recur remm)))
            ))
        (recur (dec i))
        )
      ))

  )
