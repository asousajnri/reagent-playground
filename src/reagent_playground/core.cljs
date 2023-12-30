(ns reagent-playground.core)

(defn ^:after-load after-load! []
  (js/console.log "After load!"))

(defn ^:export app! []
  (js/console.log "App started!!"))
