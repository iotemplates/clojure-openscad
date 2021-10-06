(ns clojure-openscad.core
 (:use [scad-clj.scad])
 (:use [scad-clj.model])
 (:gen-class))

(def design
  (union
   (sphere 70)
   (cube 100 100 100)
   (cylinder 30 150)))

(defn generate [& obj]
  "Generate the openscad file."
  (spit "clojure-openscad.scad" (write-scad (or obj design))))

(defn -main
  [& args]
  "Spit the design in openscad format."
  (generate))
