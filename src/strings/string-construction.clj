(use '[clojure.string :only (split triml)])

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
        (let [mm (frequencies s)]
          (println (count mm))
          )
        )

      (recur (- a0 1) ) )
    )

  )
