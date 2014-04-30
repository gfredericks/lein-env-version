(defproject com.gfredericks/lein-env-version "0.1.0"
  :description "Set leiningen project version with an environment variable."
  :url "https://github.com/fredericksgary/lein-env-version"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :eval-in-leiningen true
  :profiles {:dev {:dependencies [[me.raynes/conch "0.6.0"]
                                  [me.raynes/fs "1.4.4"]]}})
