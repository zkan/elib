(ns elib.core
  (:use ring.adapter.jetty))

(defn handler [req]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    "Hello World from Ring"})

(run-jetty #'handler {:port 8080})
