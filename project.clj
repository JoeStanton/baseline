(defproject baseline "0.1.0-SNAPSHOT"
  :description "Streaming event router based on Riemann"
  :url "http://example.com/FIXME"
  :license {:name "MIT"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.5.1"] [riemann "0.2.4"]]
  :main ^:skip-aot baseline.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
