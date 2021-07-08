(ns app
      (:require
        [helix.core :as helix :refer [defnc $]]
        ["@nivo/bar" :refer [ResponsiveBar]]
        ["@nivo/line" :refer [ResponsiveLine]]
        [reagent.core :as r]
                [reagent.dom :as rd]
                ))

(defn component-factory [component]
(fn factory-constructor [props]
  (helix/create-element component
                        (clj->js props))))

(def ^:export line-chart (component-factory ResponsiveLine))
(def ^:export bar-chart (component-factory ResponsiveBar))

(defn line-chart-example [] (line-chart
              {:data         [{:id   "Curve A"
                               :data [{:x "plane", :y 164}
                                      {:x "helicopter", :y 125}
                                      {:x "boat", :y 107}
                                      {:x "train", :y 72}]
                               }
                              {:id   "Curve B"
                               :data [{:x "plane", :y 200}
                                      {:x "helicopter", :y -10}
                                      {:x "boat", :y 50}
                                      {:x "train", :y 72}]
                               }]
               :yScale       {:type "linear" :min -60 :max 200} ;you need the type if you include min and max
               :margin       {:top 10, :right 30, :bottom 50, :left 50}
               :enableSlices "x"
               :padding      0.3}))

(defn bar-chart-example [] (bar-chart
                              {:data         [{:fries 185,
                                               :kebab 48,
                                               :burger 125,
                                               :donut 172,
                                               :hot-dog 176,
                                               :country "AD"}
                                              {:fries 117,
                                               :kebab 178,
                                               :burger 77,
                                               :donut 46,
                                               :hot-dog 56,
                                               :country "AE"}
                                              {:fries 45,
                                               :kebab 62,
                                               :burger 132,
                                               :donut 122,
                                               :hot-dog 143,
                                               :country "AF",
                                               }]
                               :colors ["blue" "red" "orange"]
                               :keys [:fries :kebab :burger :donut :hot-dog]
                               :indexBy :country
                               :groupMode :grouped
                               :margin       {:top 10, :right 30, :bottom 50, :left 50}
                               :enableSlices "x"
                               :padding      0.3}))

(defn stacked-line-chart-example [] (line-chart
                              {:data         [{:id   "Curve A"
                                               :data [{:x "plane", :y 164}
                                                      {:x "helicopter", :y 125}
                                                      {:x "boat", :y 107}
                                                      {:x "train", :y 72}]}
                                              {:id   "Curve B"
                                               :data [{:x "plane", :y 20}
                                                      {:x "helicopter", :y 14}
                                                      {:x "boat", :y 50}
                                                      {:x "train", :y 5}]}]
                               :yScale       {:type "linear" :stacked true}
                               :enableArea true
                               :margin       {:top 10, :right 30, :bottom 50, :left 50}
                               :enableSlices "x"
                               :padding      0.3}))

(defn some-component []
      [:div
       [:h1 "Nivo examples"]
       [:h3 "Line chart example"]
       [:div {:style {:height "600px" :width "600px"}} [line-chart-example]]
       [line-chart-example]
       [:h3 "Bar chart example - custom colours"]
       [:div {:style {:height "600px" :width "600px"}} [bar-chart-example]]
       [:h3 "Stacked line chart example"]
       [:div {:style {:height "600px" :width "600px"}} [stacked-line-chart-example]]

       ])

(defn ^:dev/after-load mountit []
  (rd/render [some-component]
             (.getElementById js/document "root")))

(defn ^:export init []
  (mountit))