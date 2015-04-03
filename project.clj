(defproject ninety-nine-clojure-problems "0.0.1-SNAPSHOT"
  :description "Ninety-nine Clojure problems."
  :url "https://github.com/unindented/ninety-nine-clojure-problems"
  :license {:name "MIT"
            :url "http://opensource.org/licenses/MIT"}

  :pom-addition [:developers [:developer
                              [:name "Daniel Perez Alvarez"]
                              [:email "unindented@gmail.com"]]]

  :scm {:name "git"
        :url "https://github.com/unindented/ninety-nine-haskell-problems"}

  :dependencies [[org.clojure/clojure "1.7.0"]]

  :profiles {:dev {:plugins [[lein-cljfmt "0.3.0"]
                             [lein-bikeshed "0.2.0"]
                             [lein-kibit "0.1.2"]
                             [jonase/eastwood "0.2.3"]]}}

  :source-paths ["src"]
  :test-paths ["src"])
