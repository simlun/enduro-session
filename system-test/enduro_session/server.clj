(ns enduro-session.server
  (:gen-class :main true)
  (:use clojure.pprint
        ring.util.response
        ring.adapter.jetty
        simlun.enduro-session))

(defn log
  [& messages]
  (print "server.clj> ")
  (apply println messages))

(defn handler
  [request]
  (log "I got a" (:request-method request) "request")
  (if (= (:request-method request) :post)
    (-> (redirect-after-post "/")
        (assoc :session {:posted-data (slurp (:body request))}))
    (response (str (:session request)))))

(defn -main
  [port]
  (log "Starting system test web server on port" port)
  (run-jetty (wrap-enduro-session handler) {:port (Integer. port)}))
