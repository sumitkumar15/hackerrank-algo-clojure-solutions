(use '[clojure.string :only (split triml)])

(
  let [
       n_t (read-line)
       n (Long/parseLong n_t)
       ]
  (println (bit-shift-left 1 (- 64 (Long/numberOfLeadingZeros n) (Long/bitCount n))))

  )
