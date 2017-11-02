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
             n_temp (read-line)
             n_t (split n_temp #"\s+")
             n (Integer/parseInt (n_t 0))
             m (Integer/parseInt (n_t 1))
             x (Integer/parseInt (n_t 2))
             y (Integer/parseInt (n_t 3))
             ]
        )

      (
        loop [a1 m]
        (when (> a1 0)

          (
            let [
                 city_1_temp (read-line)
                 city_1_t (split city_1_temp #"\s+")
                 city_1 (Integer/parseInt (city_1_t 0))
                 city_2 (Integer/parseInt (city_1_t 1))
                 ]
            )

          (recur (- a1 1) ) )
        )

      (recur (- a0 1) ) )
    )

  )
