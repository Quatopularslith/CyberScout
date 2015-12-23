name := "Server"

version := "1.0"

logLevel := Level.Error

scalaVersion := "2.11.7"

Seq(clojure.settings :_*)

libraryDependencies ++= Seq(
  "org.clojure" % "clojure" % "1.5.1"
)
    