name := "get-programming-with-scala-lesson47"

version := "0.1"

scalaVersion := "3.0.0"

libraryDependencies ++= Seq(
  "io.getquill" %% "quill-jasync-postgres" % "3.7.2.Beta1.2",
  "org.testcontainers" % "postgresql" % "1.15.3",
  "org.postgresql" % "postgresql" % "42.2.11",
  "ch.qos.logback"  %  "logback-classic" % "1.2.3"
)
