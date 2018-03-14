
(defn maxXor
  [l r ]
(let [x (bit-xor l r)]
  (let [sig (- 31 (Integer/numberOfLeadingZeros x))]
    (- (bit-shift-left 1 (inc sig)) 1)) )
  )

  (let [
        _l (Integer/parseInt (read-line))

        _r (Integer/parseInt (read-line))
        ]
    (println (maxXor _l _r))
    )