(ns cljs.core
  (:require [goog.dom :as dom]))

(def a 30)

(.log js/console (dom/getElement "query"))
