(ns the-family-tree.slates.slate-2
  (:require-macros [the-family-tree.utils.macros :refer [slate]])
  (:require [om-tools.core :refer-macros [defcomponent]]
            [om-tools.dom :as dom :include-macros true]
            [the-family-tree.utils.data :refer [data]]
            [the-family-tree.utils.objects :refer [pointer]]
            [cljsjs.d3 :as d3]))

(def canvas-dimensions [1400 1000])
(def origin {:x 700 :y 500})

(defn year-to-radius
  "The passage of time is represented in a radially
   increasing manner, at a rate of three pixels per year,
   starting at 1849. This function converts a given year
   to it's radial value."
  [year]
  (* 2.7 (- year 1849)))

(def force-field (-> js/d3 .-layout .force
                     (.charge -700)
                     (.linkDistance 50)
                     (.gravity 0)
                     (.size (clj->js canvas-dimensions))))

(defn enterfy-data
  [parent-element data class svg-type]
  (-> (.selectAll parent-element (str "." class))
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
        link   (enterfy-data canvas (.-links data) "link" "line")
        node   (-> (enterfy-data canvas (.-nodes data) "node" "circle")
                   (.attr "r" 6)
                   (.call (.-drag force-field)))]
    (-> force-field
        (.nodes (.-nodes data))
        (.links (.-links data))
        .start)
    (-> force-field (.on "tick"
                       #(do (constrain-positions-radially data)
                            (update-entities node link))))))

(defn scalerize
  []
  (let [data   (range 1860 2040 20)
        canvas (.select js/d3 "#slate-2 #canvas")
        ring   (-> (enterfy-data canvas (clj->js data) "ring" "circle")
                   (.attr "cx" (:x origin))
                   (.attr "cy" (:y origin))
                   (.attr "r" (fn [d] (year-to-radius d))))
        label-group (-> (.append canvas "g")
                        (.attr "transform" (str "translate(" (:x origin) "," (:y origin) ")")))
        label-backing (-> (enterfy-data label-group (clj->js data) "label-backing" "rect")
                          (.attr "width" 40) (.attr "height" "20px")
                          (.attr "x" (fn [_ i] (+ 9 (* 54 i))))
                          (.attr "y" -8))
        label  (-> (enterfy-data label-group (clj->js data) "label" "text")
                   (.text (fn [d] d))
                   (.attr "x" (fn [_ i] (+ 13 (* 54 i))))
                   (.attr "y" 7))]))

(defcomponent slate-2
  [state owner]
  (did-mount
    [_]
    (scalerize)
    (graphify (clj->js data)))
  (render-state
    [_ _]
    (println "Rendering slate-2 component with state:" state)
    (slate :slate-2
      (dom/svg
        {:id "canvas"}))))
