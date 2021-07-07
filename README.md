# nivo cljs template

A minimal template for displaying nivo charts with Clojurescript.


## Acknowledgements

Thanks to xxx for getting me started

## See also

vega-lite charts and react-table in Clojurescript: https://github.com/alex314159/react-table-vega-template

## The installation

Things can get tricky here. First, don't use Leiningen, go for `deps.edn` - somehow I found Leiningen doesn't play well with shadow-cljs. The easiest way to make sure everything works:
* install Clojure (https://clojure.org/guides/getting_started)
* install NPM (https://nodejs.org/en/)
* install shadow-cljs globally: `npm install -g shadow-cljs`
* install the right npm dependencies in your project. `npm install` in the project folder should suffice, but otherwise do `npm install react react-dom @nivo/core @nivo/line @nivo/bar`

## Usage

In the project folder run `npx shadow-cljs watch app`. Take your browser to `localhost:8080`. You should see a bunch of tables and charts.

