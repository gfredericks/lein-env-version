# lein-env-version

lein-env-version is a leiningen plugin that can set the project
version based on an environment variable.

## Usage

Add `[com.gfredericks/lein-env-version "0.1.0"]` as a plugin.

Whenever the `BUILD_VERSION` environment variable is set, the
project's version will be set to its value. You can configure
an alternate variable by including the `:env-version-var` key
in your `project.clj`.

E.g.,

```
$ BUILD_VERSION=123-456 lein jar
Created target/lein-env-version-123-456.jar
```

## License

Copyright © 2014 Gary Fredericks

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
