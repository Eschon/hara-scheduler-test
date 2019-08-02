(ns hara-scheduler-test.core
  (:require [hara.io.scheduler :refer [scheduler start!]])
  (:gen-class))

(defn -main []
  (let [sch2 (scheduler {:hello {:handler  (fn [t params] (println t))
                                :schedule "/2 * * * * * *"
                                :params {}}}
                       {}
                       {:clock {:type "java.time.Instant"}})]
    (start! sch2)))
