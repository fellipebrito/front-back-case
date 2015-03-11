(defproject webapp "0.1.0-SNAPSHOT"
  :description "FrontBack is a simple test application to proof a concept"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.3.1"]
                 [ring/ring-defaults "0.1.2"]
                 [ring-cors "0.1.6"]]
  :plugins [[lein-ring "0.8.13"]]
  :ring {:handler webapp.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})
