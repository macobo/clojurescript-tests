(defproject cljstest "0.1.0-SNAPSHOT"
  :description "Clojurescript test project"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2227"]
                 [org.clojure/core.async "0.1.303.0-886421-alpha"]
                 [jayq "2.5.1"]]

  :plugins [[lein-cljsbuild "1.0.3"]]


  :source-paths ["src"]

  :cljsbuild {
    :builds [{:id "core"
              :source-paths ["src"]
              :compiler {
                :output-to "core.js"
                :output-dir "out"
                :optimizations :none
                :source-map true}}]})
