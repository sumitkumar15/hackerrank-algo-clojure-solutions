;Solved
(use '[clojure.string :only (split triml)])
(defn abs [x] (max x (- x)))
(
  let [
       s (read-line)
       ]
  (let [xmap (frequencies (clojure.string/lower-case (clojure.string/replace s #" " "")))]
    (if (= 26 (count (keys xmap)))
      (println "pangram")
      (println "not pangram")))
  )