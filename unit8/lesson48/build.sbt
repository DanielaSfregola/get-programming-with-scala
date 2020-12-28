name := "get-programming-wil-scala-lesson48"

version := "0.1"

scalaVersion := "3.0.0-M3"

val CirceVersion = "0.14.0-M2"

libraryDependencies ++= List(
  "io.circe" %% "circe-core" % CirceVersion,
  "io.circe" %% "circe-generic" % CirceVersion,
  "io.circe" %% "circe-parser" % CirceVersion
)
