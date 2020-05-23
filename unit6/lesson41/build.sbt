name := "get-programming-with-scala-lesson41"

version := "0.1"

scalaVersion := "2.13.1"

val ScalaCsvVersion = "1.3.6"
val LogbackVersion = "1.2.3"

libraryDependencies ++= Seq(
  "com.github.tototoshi" %% "scala-csv" % ScalaCsvVersion,
  "ch.qos.logback"  %  "logback-classic"     % LogbackVersion
)
