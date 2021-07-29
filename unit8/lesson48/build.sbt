name := "get-programming-with-scala-lesson48"

version := "0.1"

scalaVersion := "3.0.0"

val CirceVersion = "0.14.1"

libraryDependencies ++= List(
  "io.circe" %% "circe-core" % CirceVersion,
  "io.circe" %% "circe-generic" % CirceVersion,
  "io.circe" %% "circe-parser" % CirceVersion
)
