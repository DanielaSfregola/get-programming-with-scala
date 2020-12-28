name := "get-programming-with-scala-lesson33"

version := "0.1"

scalaVersion := "3.0.0-M3"

val CirceVersion = "0.14.0-M2"
val ScalaCsvVersion = "1.3.6"
val LogbackVersion = "1.2.3"

libraryDependencies ++= List(
  "io.circe" %% "circe-core" % CirceVersion,
  "io.circe" %% "circe-generic" % CirceVersion,
  "io.circe" %% "circe-parser" % CirceVersion,
  "com.github.tototoshi" % "scala-csv_2.13" % ScalaCsvVersion,
  "ch.qos.logback"  %  "logback-classic"     % LogbackVersion
)
