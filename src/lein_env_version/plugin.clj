(ns lein-env-version.plugin)

(defn middleware
  [project]
  (let [env-var (get project :env-version-var "BUILD_VERSION")
        env-version (System/getenv env-var)]
    (cond-> project env-version (assoc :version env-version))))
