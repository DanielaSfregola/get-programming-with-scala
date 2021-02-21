name := "get-programming-with-scala-lesson17"

version := "0.1"

scalaVersion := "2.13.4" // waiting on http4s for upgrading to scala 3

val Http4sVersion = "0.21.14"

libraryDependencies ++= List(
  "org.http4s"      %% "http4s-blaze-server" % Http4sVersion,
  "org.http4s"      %% "http4s-dsl"          % Http4sVersion,
  "ch.qos.logback"  %  "logback-classic"     % "1.2.3"
)
