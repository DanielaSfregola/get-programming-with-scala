name := "get-programming-with-scala-lesson52"

version := "0.1"

scalaVersion := "2.13.4" // cannot upgrade to scala 3 yet because of http4s, quill :(

val CirceVersion  = "0.14.0-M2"
val Http4sVersion = "0.21.8"

libraryDependencies ++= List(
  "io.getquill" %% "quill-async-postgres" % "3.5.2",
  "org.testcontainers" % "postgresql" % "1.13.0",
  "org.postgresql" % "postgresql" % "42.2.11",
  "ch.qos.logback"  %  "logback-classic" % "1.2.3",
  "org.typelevel" %% "cats-effect" % "2.3.1",
  "io.circe" %% "circe-core" % CirceVersion,
  "io.circe" %% "circe-generic" % CirceVersion,
  "io.circe" %% "circe-parser" % CirceVersion,
  "org.http4s" %% "http4s-blaze-server" % Http4sVersion,
  "org.http4s" %% "http4s-dsl" % Http4sVersion,
  "org.http4s" %% "http4s-circe" % Http4sVersion
)
