(ns webapp.handler-test
  (:require [clojure.test :refer :all]
            [ring.mock.request :as mock]
            [webapp.handler :refer :all]))

(deftest test-app
  (testing "main route"
    (let [response (app (mock/request :get "/"))]
      (is (= (:status response) 200))
      (is (= (:body response) "{\"h1\":\"The Force Unleashed\"}"))))

  (testing "aloha route"
    (let [response (app (mock/request :get "/aloha"))]
      (is (= (:status response) 200))
      (is (= (:body response) "{\"h1\":\"The Force Awakens\"}"))))

  (testing "not-found route"
    (let [response (app (mock/request :get "/invalid"))]
      (is (= (:status response) 404)))))
