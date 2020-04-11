name := "get-programming-with-scala-lesson40"

version := "0.1"

scalaVersion := "2.13.1"

libraryDependencies ++= Seq(
  "io.getquill" %% "quill-jdbc" % "3.5.0",
  "org.testcontainers" % "postgresql" % "1.13.0",
  "org.postgresql" % "postgresql" % "42.2.11",
  "ch.qos.logback"  %  "logback-classic" % "1.2.3"
)
