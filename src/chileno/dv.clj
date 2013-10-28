(ns chileno.dv)

(defn mod-11 [run]
  (let [mults (cycle (range 2 8))]
    (->> (reverse (str run))
         (map #(Integer/parseInt (str %)))
         (map * mults)
         (reduce +)
         (#(mod %1 11))
         (- 11))))

(defn make [run]
  (let [raw (mod (mod-11 run) 11)]
    (if (= 10 raw)
     "K"
     (str raw))))

(defn check [run dv]
  (= (str dv) (make run)))
