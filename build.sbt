name := "get-programming-with-scala-lesson53"

version := "0.1"

scalaVersion := "2.13.6" // quill doesn't support scala 3 yet

val CirceVersion  = "0.14.1"
val Http4sVersion = "0.22.0"

libraryDependencies ++= Seq(
  "io.getquill" %% "quill-jasync-postgres" % "3.7.2",
  "org.testcontainers" % "postgresql" % "1.15.3",
  "org.postgresql" % "postgresql" % "42.2.22",
  "ch.qos.logback"  %  "logback-classic" % "1.2.3",
  "org.typelevel" %% "cats-effect" % "2.5.1",
  "io.circe" %% "circe-core" % CirceVersion,
  "io.circe" %% "circe-generic" % CirceVersion,
  "io.circe" %% "circe-parser" % CirceVersion,
  "org.http4s" %% "http4s-blaze-server" % Http4sVersion,
  "org.http4s" %% "http4s-dsl" % Http4sVersion,
  "org.http4s" %% "http4s-circe" % Http4sVersion,
  "org.scalatest" %% "scalatest" % "3.2.9" % "test"
)
