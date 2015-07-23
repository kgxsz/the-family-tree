(ns the-family-tree.slates.slate-2
  (:require-macros [the-family-tree.utils.macros :refer [slate]])
  (:require [om-tools.core :refer-macros [defcomponent]]
            [om-tools.dom :as dom :include-macros true]
            [the-family-tree.utils.data :refer [family-data]]
            [the-family-tree.utils.objects :refer [pointer]]
            [cljsjs.d3 :as d3]))

(def origin {:x 700 :y 500})

(defn year-to-radius
  "The passage of time is represented in a radially
   increasing manner, at a rate of three pixels per year,
   starting at 1849. This function converts a given year
   to it's radial value."
  [year]
  (* 2.7 (- year 1849)))

(def force-field (-> js/d3 .-layout .force
                     (.charge -300)
                     (.linkDistance (fn [d] (if (= "partner" (.-relation d)) 40 80)))
                     (.gravity 0)))

(defn enterfy-data
  [parent-element data svg-type selector]
  (-> (.selectAll parent-element (str "." selector))
      (.data data) .enter
      (.append svg-type)))

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
        link   (-> (enterfy-data canvas (.-links data) "line" "link")
                   (.attr "class" (fn [d] (str "link " (.-relation d)))))
        node   (-> (enterfy-data canvas (.-nodes data) "circle" "node")
                   (.attr "class" "node")
                   (.attr "r" 6)
                   (.call (.-drag force-field)))]
    (-> force-field
        (.nodes (.-nodes data))
        (.links (.-links data))
        .start)
    (-> force-field (.on "tick"
                       #(do (constrain-positions-radially data)
                            (update-entities node link))))))

(defn draw-scale
  [data]
  (let [canvas (.select js/d3 "#slate-2 #canvas")
        ring   (-> (enterfy-data canvas data "circle" "ring")
                   (.attr "class" "ring")
                   (.attr "cx" (:x origin))
                   (.attr "cy" (:y origin))
                   (.attr "r" (fn [d] (year-to-radius d))))
        mask   (-> (enterfy-data canvas (clj->js data) "rect" "mask")
                   (.attr "class" "mask")
                   (.attr "width" 10) (.attr "height" 20)
                   (.attr "x" (fn [_ i] (+ 25 (:x origin) (* 54 i))))
                   (.attr "y" (- (:y origin) 8)))]))

(defn draw-label
  [data]
  (let [canvas (.select js/d3 "#slate-2 #canvas")
        label  (-> (enterfy-data canvas data "text" "label")
                   (.attr "class" "label")
                   (.text (fn [d] d))
                   (.attr "x" (fn [_ i] (+ 13 (:x origin) (* 54 i))))
                   (.attr "y" (+ 7 (:y origin))))]))

(defcomponent slate-2
  [state owner]
  (did-mount
    [_]
    (let [scale-data (range 1860 2040 20)]
      (draw-scale (clj->js scale-data))
      (graphify (clj->js family-data))
      (draw-label (clj->js scale-data))))
  (render-state
    [_ _]
    (println "Rendering slate-2 component with state:" state)
    (slate :slate-2
      (dom/svg
        {:id "canvas"}))))
