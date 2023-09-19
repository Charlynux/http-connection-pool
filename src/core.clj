(ns core
  (:require [clj-http.client :as client]
            [org.httpkit.server :as server]))

(defn app [_]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    "hello HTTP!"})

(def stop-server
  (server/run-server app {:port 8080}))

#_(stop-server)

(time (dotimes [_ 500]
        (println (:status (client/get "http://localhost:8080")))))

(time
 (client/with-connection-pool {:timeout 5 :threads 4 :insecure? false :default-per-route 10}
   (dotimes [_ 500]
     (println (:status (client/get "http://localhost:8080"))))))
