(defproject penguin-detector "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "GNU GENERAL PUBLIC LICENSE Version 3"
            :url "http://www.gnu.org/licenses/gpl-3.0.en.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]]
  :main ^:skip-aot penguin-detector.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
