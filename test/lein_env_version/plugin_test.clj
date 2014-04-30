(ns lein-env-version.plugin-test
  (:require [clojure.test :refer :all]
            [me.raynes.conch :as sh]
            [me.raynes.fs :refer [*cwd*] :as fs]))

(sh/programs lein)

(deftest default-var-test
  (fs/with-cwd "test-project"
    (lein "do" "clean," "jar" {:env {"BUILD_VERSION" "foobar"}
                               :dir *cwd*})
    (is (fs/exists? "target/test-project-foobar.jar"))))

(deftest custom-var-test
  (fs/with-cwd "test-project"
    (lein "with-profile" "+different-var" "do" "clean," "jar"
          {:env {"FOOVAR" "something-else"}
           :dir *cwd*})
    ;; the "/different-var" portion of the path is added by leiningen
    ;; when a profile is activated. See the docs on :target-path.
    (is (fs/exists? "target/different-var/test-project-something-else.jar"))))
