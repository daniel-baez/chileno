(ns chileno.core
  (:require [clojure.string :as str]
            [chileno.dv :as dv]))

(defrecord Rut [run dv]
  Object
  (toString [this]
    (str (:run this) \- (:dv this))))

(defn clean [rut]
  (-> rut
      (str/upper-case)
      (str/replace #"[^\dK]" "")))

(defn form? [rut]
  (if (not (str/blank? rut))
    (re-matches #"^\d+K?$" (clean rut))
    false))

(defn split [rut]
  (let [cleaned (clean rut)]
    [(apply str (drop-last cleaned)) 
     (str/upper-case (last cleaned))]))

(defn make
  ([rut]
     (if (form? rut)
       (apply make (split rut))
       {}))
  ([run dv]
     (let [run (clean run)
           dv (clean dv)]
       (if (and
            (form? (str run dv))
            (dv/check run dv))
         (->Rut run dv)
         {}))))

(defn valid?
  [& args]
  (not (empty? (apply make args))))
