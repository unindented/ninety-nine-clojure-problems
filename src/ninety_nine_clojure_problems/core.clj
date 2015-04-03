(ns ninety-nine-clojure-problems.core
  (:require [clojure.test :refer :all]))

(with-test
  (defn fib
    "Compute Fibonacci numbers."
    [x]
    (if (< x 2) x
        (+ (fib (dec (dec x))) (fib (dec x)))))
  (is (= 5 (fib 5)))
  (is (= 55 (fib 10))))
