(defproject org.clojars.strongh/storm-drpc "0.1.0-SNAPSHOT"
  :description "Storm's DRPCClient with minimal dependencies"
  :url "http://storm-project.net/"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :java-source-paths ["src/jvm"]
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [storm/libthrift7 "0.7.0"]
                 [org.slf4j/slf4j-log4j12 "1.5.8"]])
