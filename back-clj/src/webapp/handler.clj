(ns webapp.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.cors :refer [wrap-cors]]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defroutes app-routes
  (GET "/" [] "{\"h1\":\"The Force Unleashed\"}")
  (GET "/aloha" [] "{\"h1\":\"The Force Awakens\"}")
  (route/not-found "Not Found"))

(def app
  (-> (wrap-defaults app-routes site-defaults)
      (wrap-cors :access-control-allow-origin #"http://localhost:3000"
                 :access-control-allow-methods [:get :put :post]
                 :access-control-allow-headers ["Content-Type"])))
