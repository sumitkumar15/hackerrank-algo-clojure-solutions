;solved
(use '[clojure.string :only (split triml)])
(defn abs [x] (max x (- x)))
(defn calc
  [list1 list2]
  ;(println list1 list2)
  (let [c_arr (map #(abs (- (int %1) (int %2))) list1 list2)]
    (reduce + c_arr))
  )
(
  let [
       q_t (read-line)
       q (Integer/parseInt q_t)
       ]

  (
    loop [a0 q]
    (when (> a0 0)

      (
        let [
             s (read-line)
             ]
        (let [slist  (split-at (int (/ (count s) 2))  s)]
          (if (even? (count s))
            (println (calc (first slist) (reverse (second slist))))
            (println (calc (first slist) (reverse (rest (second slist))))))
          )

        )

      (recur (- a0 1) ) )
    )

  )
