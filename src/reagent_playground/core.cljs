(ns reagent-playground.core
  (:require [reagent.core :as r]
            [reagent.dom.client :as rdc]))

(defonce rootElem (rdc/create-root (js/document.getElementById "app")))

;; DONE:
;https://github.com/reagent-project/reagent/tree/master/examples/simple
;https://reagent-project.github.io/ >> stopped >> Complete demo
;https://gitlab.com/clj-editors
;https://www.bitsbyluke.com/2018/10/20/clojurescript-interop-with-javascript.html

(defn ui []
  [:div "Hello, world!"])

(defn ^:dev/after-load ui-render []
   (rdc/render rootElem [ui]))

(defn ^:export app []
  (ui-render))

