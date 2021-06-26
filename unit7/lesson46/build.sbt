name := "get-programming-with-scala-lesson46"

version := "0.1"

scalaVersion := "3.0.0"

libraryDependencies ++= List(
  "io.getquill" %% "quill-jasync-postgres" % "3.7.2.Beta1.2",
  "org.testcontainers" % "postgresql" % "1.15.3",
  "org.postgresql" % "postgresql" % "42.2.22",
  "ch.qos.logback"  %  "logback-classic" % "1.2.3"
)
