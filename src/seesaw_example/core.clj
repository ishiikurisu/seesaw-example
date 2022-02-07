(ns seesaw-example.core
  (:gen-class)
  (:require [seesaw.core :as seesaw]))

(defn -main [& args]
  (seesaw/invoke-later
    (-> (seesaw/frame :title "Hello!"
                      :content "Hello Joe!"
                      :on-close :exit)
        seesaw/pack!
        seesaw/show!)))
