(ns openscad-clojure.core
 (:use [scad-clj.scad])
 (:use [scad-clj.model]))

(def design
  (union
   (sphere 70)
   (cube 100 100 100)
   (cylinder 30 150))

(defn generate [& obj]
  "Generate the openscad file."
  (spit "openscad-clojure.scad" (write-scad (or obj design))))

(defn -main
  [& args]
  "Spit the design in openscad format."
  (generate))
