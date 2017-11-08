(use '[clojure.string :only (split triml)])

(let [
      q_t (read-line)
      n (Integer/parseInt q_t)
      temp (split (read-line) #"\s+")
      heights (reverse (map #(Integer/parseInt %) temp))
      ]
  (loop [[h & hts] heights energy 0]
    (if (nil? h)
      (println energy)
      (let [e (int (/ (+ energy h) 2))]
        (recur hts e)
        )))

 )
