(set-env!
 :source-paths #{"src"}
 :resource-paths #{"html"}
 :dependencies '[[adzerk/boot-cljs "1.7.170-3" :scope "test"]])

(require '[adzerk.boot-cljs :refer :all])

(deftask dev []
  (comp (cljs :compiler-options {:asset-path "target/main.out"})
        (target :dir #{"target"})))
