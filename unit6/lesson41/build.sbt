name := "get-programming-with-scala-lesson41"

version := "0.1"

scalaVersion := "3.0.0-M3"

val ScalaCsvVersion = "1.3.6"
val LogbackVersion = "1.2.3"

libraryDependencies ++= List(
  "com.github.tototoshi" % "scala-csv_2.13" % ScalaCsvVersion,
  "ch.qos.logback"  %  "logback-classic"     % LogbackVersion
)
