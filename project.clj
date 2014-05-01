(defproject enduro-session "0.1.0-SNAPSHOT"
  :description "A durable Ring session store based on enduro's file-atom"
  :url "https://github.com/simlun/enduro-session"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :profiles {:uberjar {:aot :all}
             :dev {:dependencies [[midje "1.6.3"]]
                   :plugins [[lein-midje "3.1.3"]]}
             :system-test {:dependencies [[ring "1.2.1"]
                                          [javax.servlet/servlet-api "2.5"]]
                           :main enduro-session.server
                           :source-paths ["system-test"]
                           :uberjar-name "system-test-server.jar"}})
