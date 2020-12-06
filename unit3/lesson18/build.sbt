name := "get-programming-with-scala-lesson18"

version := "0.1"

scalaVersion := "2.13.4" 

val Http4sVersion = "0.21.9"

libraryDependencies ++= List(
  "org.http4s"      %% "http4s-blaze-server" % Http4sVersion,
  "org.http4s"      %% "http4s-dsl"          % Http4sVersion,
  "ch.qos.logback"  %  "logback-classic"     % "1.2.3"
)
