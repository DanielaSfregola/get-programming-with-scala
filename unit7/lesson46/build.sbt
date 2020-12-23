name := "get-programming-with-scala-lesson46"

version := "0.1"

scalaVersion := "2.13.1" // waiting on quill to upgrade to scala 3

libraryDependencies ++= List(
  "io.getquill" %% "quill-async-postgres" % "3.5.2",
  "org.testcontainers" % "postgresql" % "1.13.0",
  "org.postgresql" % "postgresql" % "42.2.11",
  "ch.qos.logback"  %  "logback-classic" % "1.2.3"
)
