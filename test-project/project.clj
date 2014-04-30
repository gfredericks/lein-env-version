(defproject test-project "0.1.0"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot test-project.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}
             :different-var {:env-version-var "FOOVAR"}}
  ;; using a released version of the project, which is shadowed
  ;; by the current code via the .lein-classpath file
  :plugins [[com.gfredericks/lein-env-version "0.1.0"]])
