name := "get-programming-with-scala-lesson26"

version := "0.1"

scalaVersion := "3.0.0"

val Http4sVersion = "0.22.0"

libraryDependencies ++= List(
  "org.http4s"      %% "http4s-blaze-server" % Http4sVersion,
  "org.http4s"      %% "http4s-dsl"          % Http4sVersion,
  "ch.qos.logback"  %  "logback-classic"     % "1.2.3"
)
