(ns chileno.dv)

(defn mod-11 [run]
  (let [mults (cycle (range 2 8))]
    (->> (reverse run)
         (map #(Integer/parseInt (str %)))
         (map * mults)
         (reduce +)
         (#(mod %1 11))
         (- 11))))

(defn make [run]
  (let [raw (mod-11 run)]
    (cond
     (= 11 raw) "0"
     (= 10 raw) "K"
     :default (str raw))))

(defn check [run dv]
  (= (str dv) (make run)))
