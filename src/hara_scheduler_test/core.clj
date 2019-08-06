(ns hara-scheduler-test.core
  (:require [hara.io.scheduler :refer [scheduler start!]])
  (:gen-class))

(def sch  (scheduler {:hello {:handler  (fn [t params] (println t))
                                  :schedule "/2 * * * * * *"
                                  :params {}}}
                         {}
                         {:clock {:type "java.time.Instant"}}))
(defn -main []
  (start! sch))
