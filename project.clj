(defproject retroact "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [org.clojure/clojure "1.10.3"]
                 [com.miglayout/miglayout-swing "11.0"]
                 [org.clojure/tools.logging "1.2.4"]
                 [org.clojure/core.async "1.5.648"]]
  :main ^:skip-aot retroact.core
  :aot [retroact.swing.compiled.jtable]
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
