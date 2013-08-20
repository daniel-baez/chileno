(ns chileno.core-test
  (:require [clojure.test :refer :all]
            [chileno.core :as rut]))

(deftest clean
  (testing "every non rut valid char must dissapear")
  (is (= "63635286") (rut/clean "63635286"))
  (is (= "63635286") (rut/clean "6.363.528-6")))

