name := "DesktopClient"

version := "1.0"

logLevel := Level.Error

scalaVersion := "2.11.7"

Seq(clojure.settings :_*)

libraryDependencies ++= Seq(
  "org.clojure" % "clojure" % "1.5.1",
  "org.xerial" % "sqlite-jdbc" % "3.7.2",
  "org.scalafx" %% "scalafx" % "8.0.60-R9",
  "org.scalikejdbc" %% "scalikejdbc" % "2.2.9",
  "ch.qos.logback" % "logback-classic" % "1.1.3"
)