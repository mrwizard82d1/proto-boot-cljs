(ns foop.core)

(defn -main [& args]
  (.log js/console "Hello, ClojureScript Boot World"))

(set! *main-cli-fn* -main)
