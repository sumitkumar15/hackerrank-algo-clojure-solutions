(use '[clojure.string :only (split triml)])

(
  let [
       n_t (read-line)
       n (Integer/parseInt n_t)
       ]
  (dotimes [k n]
    (dotimes [i (- (dec n) k)]
      (print " "))
    (dotimes [i (inc k)]
      (print "#"))
    (println "\n")
  )
  )
