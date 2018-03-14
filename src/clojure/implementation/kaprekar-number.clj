(use '[clojure.string :only (split triml)])
(defn kap
  [x]
  (let [cx (str x) cnt (/ (count cx) 2) ]
    ;(println cx)
    (let [l (take (int cnt) cx) r (drop (int cnt) cx) ]
      ;(println l r)
      (+ (if (empty? l) 0 (Integer/parseInt (apply str l))) (Integer/parseInt (apply str r))))
    )
  )
(let [
      l (Integer/parseInt (read-line))
      r (Integer/parseInt (read-line))
      ]
  (let [s (range l (inc r)) sq (map #(* % %) (range l (inc r)))]
    (let [cc (map kap sq)]
      (let [result (filter #(not= 0 %) (map #(if (= %1 %2) %1 0) s cc))]
        (if (empty? result)
          (println "INVALID RANGE")
          (apply println result)))
      )
    )
  )
