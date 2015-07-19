(ns the-family-tree.slates.slate-2
  (:require-macros [the-family-tree.utils.macros :refer [slate]])
  (:require [om-tools.core :refer-macros [defcomponent]]
            [om-tools.dom :as dom :include-macros true]
            [the-family-tree.utils.data :refer [data]]
            [the-family-tree.utils.objects :refer [pointer]]
            [cljsjs.d3 :as d3]))

(def canvas-dimensions [1400 700])
(def origin {:x 700 :y 350})

(defn year-to-radius
  "The passage of time is represented in a radially
   increasing manner, at a rate of two pixels per year,
   starting at 1849. This function converts a given year
   to it's radial value."
  [year]
  (* 2 (- year 1849)))

(def force-field (-> js/d3 .-layout .force
                     (.charge -120)
                     (.linkDistance 20)
                     (.gravity 0)
                     (.size (clj->js canvas-dimensions))))

(defn enterfy-data
  [canvas data class svg-type]
  (-> (.selectAll canvas (str "." class))
      (.data data) .enter
      (.append svg-type)
      (.attr "class" class)))

(defn datarize-attributes
  [entity relations]
  (doseq [{:keys [attr data-korks]} relations]
    (.attr entity attr (fn [d] (apply (partial aget d) data-korks)))))


(defn update-entities
  [node link]
  (datarize-attributes link [{:attr "x1" :data-korks ["source" "x"]}
                             {:attr "y1" :data-korks ["source" "y"]}
                             {:attr "x2" :data-korks ["target" "x"]}
                             {:attr "y2" :data-korks ["target" "y"]}])
  (datarize-attributes node [{:attr "cx" :data-korks "x"}
                             {:attr "cy" :data-korks "y"}]))

(defn constrain-positions-radially
  "Take the positional attributes from the
   node data and constrain it radially."
  [data]
  (.forEach (.-nodes data)
    (fn [d _]
      (let [vx    (- (.-x d) (:x origin))
            vy    (- (.-y d) (:y origin))
            |v|   (.sqrt js/Math (+ (* vx vx) (* vy vy)))
            x     (+ (:x origin) (* (year-to-radius (.-birth d)) (/ vx |v|)))
            y     (+ (:y origin) (* (year-to-radius (.-birth d)) (/ vy |v|)))]
        (when-not (zero? |v|)
          (set! (.-x d) x)
          (set! (.-y d) y))))))

(defn graphify
  [data]
  (let [canvas (.select js/d3 "#slate-2 #canvas")
        link (-> (enterfy-data canvas (.-links data) "link" "line")
                 (.style "stroke-width" 2))
        node (-> (enterfy-data canvas (.-nodes data) "node" "circle")
                 (.attr "r" 6)
                 (.call (.-drag force-field)))]
    (-> force-field
        (.nodes (.-nodes data))
        (.links (.-links data))
        .start)
    (-> force-field (.on "tick"
                       #(do (constrain-positions-radially data)
                            (update-entities node link))))))

(defcomponent slate-2
  [state owner]
  (did-mount
    [_]
    (graphify (clj->js data)))
  (render-state
    [_ _]
    (println "Rendering slate-2 component with state:" state)
    (slate :slate-2
      (dom/svg
        {:id "canvas"}))))
