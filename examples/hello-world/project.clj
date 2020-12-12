(defproject hello-world "0.39.0"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [uncomplicate/neanderthal "0.39.0"]
                 ;;Optional. If bytedeco is not present, a system-wide MKL is used.
                 [org.bytedeco/mkl-platform-redist "2020.3-1.5.4"]]
  ;; Nvidia doesn't ship CUDA for macOS; you have to add this to your project
  :exclusions [[org.jcuda/jcuda-natives :classifier "apple-x86_64"]
               [org.jcuda/jcublas-natives :classifier "apple-x86_64"]]
  ;; If on Java 9+, you have to uncomment the following JVM option.
  :jvm-opts ^:replace [#_"--add-opens=java.base/jdk.internal.ref=ALL-UNNAMED"])
