(use '[clojure.string :only (split triml)])

(
  let [
       S (read-line)
       ]
  (println (reduce + (map (fn [x]
                            (count (filter #(= % false) (map = (seq x) '(\S \O \S)))) ) (partition 3 (seq S)))))
  )