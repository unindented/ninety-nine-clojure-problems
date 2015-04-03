(ns ninety-nine-clojure-problems.problems-1-to-10
  (:require [clojure.test :refer :all]))

(with-test
  (defn my-last
    "Problem 1:
     Find the last element of a list."
    [xs]
    (if (= 1 (count xs))
      (first xs)
      (recur (rest xs))))
  (is (= 4 (my-last [1 2 3 4])))
  (is (= "z" (my-last ["x" "y" "z"]))))
