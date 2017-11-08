(use '[clojure.string :only (split triml)])

(
  let [
       s (read-line)
       ]
  (let [mm (frequencies s) tem (reduce + (map #(if (odd? %) 1 0) (vals mm))) ]
    (if (<= tem 1)
      (println "YES")
      (println "NO"))
    )

  )
