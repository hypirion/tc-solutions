#! /usr/bin/env clojure

(import java.io.File)
(require '[clojure.java.io :as io])

(->> (File. "..")
     (.listFiles)
     (filter #(.isDirectory %))
     (filter #(.. % getName (endsWith "-java")))
     (mapcat #(.listFiles %))
     (filter #(.. % getName (endsWith ".java")))
     (remove #(.. % getName (endsWith "Test.java")))
     (mapv (fn [f] (with-open [r (io/reader f)]
                    (with-open [w (io/writer (.getName f))]
                      (io/copy r w))))))

