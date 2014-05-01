(ns simlun.enduro-session
  (:use [ring.middleware.session :only [wrap-session]]
        [ring.middleware.session.store :only [SessionStore]])
  (:require [alandipert.enduro :as enduro])
  (:import java.util.UUID))

(deftype EnduroStore
  [session-map]
  SessionStore
  (read-session [_ key]
    (@session-map key))
  (write-session [_ key data]
    (let [key (or key (str (UUID/randomUUID)))]
      (enduro/swap! session-map assoc key data)
      key))
  (delete-session [_ key]
    (enduro/swap! session-map dissoc key)
    nil))

(defn enduro-store
  ([] (enduro-store (enduro/file-atom {} "target/enduro-session-data.clj")))
  ([session-atom] (EnduroStore. session-atom)))

(defn wrap-enduro-session
  [handler]
  (wrap-session handler {:store (enduro-store)}))
