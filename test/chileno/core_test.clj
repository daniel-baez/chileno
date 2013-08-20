(ns chileno.core-test
  (:require [clojure.test :refer :all]
            [chileno.core :as rut]))

(deftest clean
  (is (= "123456789"
         (rut/clean "12.345.678-9")))
  (is (= "12345678K"
         (rut/clean "12.345.678-k"))))

(deftest k-dv
  (is (rut/valid? "123456785-k"))
  (is (rut/valid? "123456785-K")))
