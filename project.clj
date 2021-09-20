(defproject clojure-openscad "0.1.0-SNAPSHOT"
  :description "An openscad project written in Clojure"
  :url "http://github.com/iotemplates/clojure-openscad"
  :license {:name "Apache License 2.0"
            :url "https://www.apache.org/licenses/LICENSE-2.0"
            :year 2020
            :key "apache-2.0"}
  :dependencies [[org.clojure/clojure "1.10.1"] [scad-clj "0.5.3"]]
  :plugins [[lein-auto "0.1.3"]]
  :main ^:skip-aot clojure-openscad.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
