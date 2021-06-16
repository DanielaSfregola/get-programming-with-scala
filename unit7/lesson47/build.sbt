name := "get-programming-with-scala-lesson47"

version := "0.1"

scalaVersion := "2.13.6"  // waiting on quill to upgrade to scala 3

libraryDependencies ++= Seq(
  "io.getquill" %% "quill-jasync-postgres" % "3.7.0",
  "org.testcontainers" % "postgresql" % "1.13.0",
  "org.postgresql" % "postgresql" % "42.2.11",
  "ch.qos.logback"  %  "logback-classic" % "1.2.3"
)
