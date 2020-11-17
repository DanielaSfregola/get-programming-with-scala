name := "get-programming-wil-scala-lesson48"

version := "0.1"

scalaVersion := "2.13.3"

val CirceVersion = "0.13.0"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core" % CirceVersion,
  "io.circe" %% "circe-generic" % CirceVersion,
  "io.circe" %% "circe-parser" % CirceVersion
)
