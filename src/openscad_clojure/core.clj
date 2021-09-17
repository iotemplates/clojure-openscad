(ns openscad-clojure.core
 (:use [scad-clj.scad])
 (:use [scad-clj.model]))

(def design
  (union
   (cube 100 100 100)
   (sphere 10)
   (cylinder 10 150)))

(defn -main
  "Spit the design in openscad format"
  [& args]
  (spit "openscad-clojure.scad" (write-scad design)))
