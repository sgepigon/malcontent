(defproject tech.droit/malcontent "0.2.1"
  :description "Ring middleware for HTTP Content Security Policy"
  :url "http://github.com/droitfintech/malcontent"
  :license {:name "Apache License, Version 2.0"
            :url "https://www.apache.org/licenses/LICENSE-2.0.html"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [net.sf.uadetector/uadetector-resources "2014.10"]]
  :profiles {:dev {:dependencies [[speclj "3.4.1"]]}}
  :plugins [[speclj "3.4.1"]]
  :test-paths ["spec"])
