;(ns data)
;
;
;(def tree-map-data
;  {:root
;   {:name "nivo", :color "hsl(130, 70%, 50%)",
;    :children
;    [{:name "viz", :color "hsl(22, 70%, 50%)",
;      :children
;      [{:name "stack", :color "hsl(159, 70%, 50%)",
;        :children
;        [{:name "cchart", :color "hsl(139, 70%, 50%)", :loc 186287}
;         {:name "xAxis", :color "hsl(199, 70%, 50%)", :loc 44735}
;         {:name "yAxis", :color "hsl(226, 70%, 50%)", :loc 193405}
;         {:name "layers", :color "hsl(7, 70%, 50%)", :loc 33789}]}
;       {:name "ppie", :color "hsl(346, 70%, 50%)",
;        :children
;        [{:name "chart", :color "hsl(316, 70%, 50%)",
;          :children
;          [{:name "pie", :color "hsl(18, 70%, 50%)",
;            :children
;            [{:name "outline", :color "hsl(224, 70%, 50%)", :loc 171713}
;             {:name "slices", :color "hsl(199, 70%, 50%)", :loc 68429}
;             {:name "bbox", :color "hsl(99, 70%, 50%)", :loc 146357}]}
;           {:name "donut", :color "hsl(22, 70%, 50%)", :loc 112018}
;           {:name "gauge", :color "hsl(36, 70%, 50%)", :loc 182205}]}
;         {:name "legends", :color "hsl(38, 70%, 50%)", :loc 105697}]}]}
;     {:name "colors", :color "hsl(269, 70%, 50%)",
;      :children
;      [{:name "rgb", :color "hsl(279, 70%, 50%)", :loc 8351}
;       {:name "hsl", :color "hsl(38, 70%, 50%)", :loc 120860}]}
;     {:name "utils", :color "hsl(277, 70%, 50%)",
;      :children
;      [{:name "randomize", :color "hsl(292, 70%, 50%)", :loc 47287}
;       {:name "resetClock", :color "hsl(192, 70%, 50%)", :loc 787}
;       {:name "noop", :color "hsl(124, 70%, 50%)", :loc 198682}
;       {:name "tick", :color "hsl(146, 70%, 50%)", :loc 195860}
;       {:name "forceGC", :color "hsl(47, 70%, 50%)", :loc 170287}
;       {:name "stackTrace", :color "hsl(56, 70%, 50%)", :loc 51165}
;       {:name "dbg", :color "hsl(222, 70%, 50%)", :loc 185752}]}
;     {:name "generators", :color "hsl(132, 70%, 50%)",
;      :children
;      [{:name "address", :color "hsl(79, 70%, 50%)", :loc 183737}
;       {:name "city", :color "hsl(225, 70%, 50%)", :loc 12453}
;       {:name "animal", :color "hsl(63, 70%, 50%)", :loc 14259}
;       {:name "movie", :color "hsl(197, 70%, 50%)", :loc 64136}
;       {:name "user", :color "hsl(95, 70%, 50%)", :loc 106833}]}
;     {:name "set", :color "hsl(288, 70%, 50%)",
;      :children
;      [{:name "clone", :color "hsl(103, 70%, 50%)", :loc 32289}
;       {:name "intersect", :color "hsl(198, 70%, 50%)", :loc 31751}
;       {:name "merge", :color "hsl(283, 70%, 50%)", :loc 64306}
;       {:name "reverse", :color "hsl(152, 70%, 50%)", :loc 144540}
;       {:name "toArray", :color "hsl(13, 70%, 50%)", :loc 6013}
;       {:name "toObject", :color "hsl(262, 70%, 50%)", :loc 195143}
;       {:name "fromCSV", :color "hsl(185, 70%, 50%)", :loc 70934}
;       {:name "slice", :color "hsl(79, 70%, 50%)", :loc 152502}
;       {:name "append", :color "hsl(180, 70%, 50%)", :loc 103903}
;       {:name "prepend", :color "hsl(268, 70%, 50%)", :loc 26142}
;       {:name "shuffle", :color "hsl(282, 70%, 50%)", :loc 123506}
;       {:name "pick", :color "hsl(11, 70%, 50%)", :loc 144964}
;       {:name "plouc", :color "hsl(176, 70%, 50%)", :loc 107703}]}
;     {:name "text", :color "hsl(170, 70%, 50%)",
;      :children
;      [{:name "trim", :color "hsl(341, 70%, 50%)", :loc 149057}
;       {:name "slugify", :color "hsl(115, 70%, 50%)", :loc 8247}
;       {:name "snakeCase", :color "hsl(204, 70%, 50%)", :loc 89663}
;       {:name "camelCase", :color "hsl(89, 70%, 50%)", :loc 83271}
;       {:name "repeat", :color "hsl(196, 70%, 50%)", :loc 131049}
;       {:name "padLeft", :color "hsl(188, 70%, 50%)", :loc 141482}
;       {:name "padRight", :color "hsl(356, 70%, 50%)", :loc 74414}
;       {:name "sanitize", :color "hsl(138, 70%, 50%)", :loc 156467}
;       {:name "ploucify", :color "hsl(14, 70%, 50%)", :loc 79789}]}
;     {:name "misc", :color "hsl(340, 70%, 50%)",
;      :children
;      [{:name "greetings", :color "hsl(33, 70%, 50%)",
;        :children
;        [{:name "hey", :color "hsl(113, 70%, 50%)", :loc 125326}
;         {:name "HOWDY", :color "hsl(198, 70%, 50%)", :loc 119721}
;         {:name "aloha", :color "hsl(334, 70%, 50%)", :loc 83269}
;         {:name "AHOY", :color "hsl(247, 70%, 50%)", :loc 77144}]}
;       {:name "other", :color "hsl(99, 70%, 50%)", :loc 67247}
;       {:name "path", :color "hsl(93, 70%, 50%)",
;        :children
;        [{:name "pathA", :color "hsl(41, 70%, 50%)", :loc 130314}
;         {:name "pathB", :color "hsl(30, 70%, 50%)",
;          :children
;          [{:name "pathB1", :color "hsl(356, 70%, 50%)", :loc 49162}
;           {:name "pathB2", :color "hsl(212, 70%, 50%)", :loc 40668}
;           {:name "pathB3", :color "hsl(243, 70%, 50%)", :loc 152512}
;           {:name "pathB4", :color "hsl(215, 70%, 50%)", :loc 3687}]}
;         {:name "pathC", :color "hsl(239, 70%, 50%)",
;          :children
;          [{:name "pathC1", :color "hsl(31, 70%, 50%)", :loc 23275}
;           {:name "pathC2", :color "hsl(167, 70%, 50%)", :loc 59500}
;           {:name "pathC3", :color "hsl(173, 70%, 50%)", :loc 135247}
;           {:name "pathC4", :color "hsl(258, 70%, 50%)", :loc 174148}
;           {:name "pathC5", :color "hsl(12, 70%, 50%)", :loc 62691}
;           {:name "pathC6", :color "hsl(254, 70%, 50%)", :loc 157204}
;           {:name "pathC7", :color "hsl(285, 70%, 50%)", :loc 75796}
;           {:name "pathC8", :color "hsl(246, 70%, 50%)", :loc 76346}
;           {:name "pathC9", :color "hsl(75, 70%, 50%)", :loc 176426}]}]}]}]}}
;
;
;
;  )