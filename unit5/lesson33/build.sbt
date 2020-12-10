name := "get-programming-with-scala-lesson33"

version := "0.1"

scalaVersion := "2.13.4" // unfortunately no circe or scala-csv for scala 3 yet

val CirceVersion = "0.13.0"
val ScalaCsvVersion = "1.3.6"
val LogbackVersion = "1.2.3"

libraryDependencies ++= List(
  "io.circe" % "circe-core_2.13" % CirceVersion,
  "io.circe" % "circe-generic_2.13" % CirceVersion,
  "io.circe" % "circe-parser_2.13" % CirceVersion,
  "com.github.tototoshi" % "scala-csv_2.13" % ScalaCsvVersion,
  "ch.qos.logback"  %  "logback-classic"     % LogbackVersion
)
