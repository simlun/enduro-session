(defproject simlun/enduro-session "0.1.0-SNAPSHOT"
  :description "A durable Ring session store based on enduro's file-atom"
  :url "https://github.com/simlun/enduro-session"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [ring/ring-core "1.2.1"]
                 [alandipert/enduro "1.1.5"]]
  :profiles {:uberjar {:aot :all}
             :system-test {:dependencies [[ring "1.2.1"]
                                          [javax.servlet/servlet-api "2.5"]]
                           :main enduro-session.server
                           :source-paths ["system-test"]
                           :uberjar-name "system-test-server.jar"}})
