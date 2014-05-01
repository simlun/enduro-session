(ns enduro-session.server
  (:gen-class :main true)
  (:use ring.adapter.jetty))

(defn handler
  [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello World"})

(defn -main
  [port]
  (println "Starting system test web server on port" port)
  (run-jetty handler {:port (Integer. port)}))
