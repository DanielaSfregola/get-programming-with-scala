name := "get-programming-with-scala-lesson41"

version := "0.1"

scalaVersion := "2.13.4" // unfortunately no scala-csv for scala 3 yet

val ScalaCsvVersion = "1.3.6"
val LogbackVersion = "1.2.3"

libraryDependencies ++= List(
  "com.github.tototoshi" %% "scala-csv" % ScalaCsvVersion,
  "ch.qos.logback"  %  "logback-classic"     % LogbackVersion
)
