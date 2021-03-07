name := "get-programming-with-scala-lesson53"

version := "0.1"

scalaVersion := "2.13.4" // waiting on quill to upgrade to scala 3

val CirceVersion  = "0.14.0-M4"
val Http4sVersion = "0.22.0-M5"

libraryDependencies ++= List(
  "io.getquill" %% "quill-async-postgres" % "3.5.2",
  "org.testcontainers" % "postgresql" % "1.13.0",
  "org.postgresql" % "postgresql" % "42.2.11",
  "ch.qos.logback"  %  "logback-classic" % "1.2.3",
  "org.typelevel" %% "cats-effect" % "2.3.3",
  "io.circe" %% "circe-core" % CirceVersion,
  "io.circe" %% "circe-generic" % CirceVersion,
  "io.circe" %% "circe-parser" % CirceVersion,
  "org.http4s" %% "http4s-blaze-server" % Http4sVersion,
  "org.http4s" %% "http4s-dsl" % Http4sVersion,
  "org.http4s" %% "http4s-circe" % Http4sVersion,
  "org.scalatest" %% "scalatest" % "3.2.5" % "test"
)
