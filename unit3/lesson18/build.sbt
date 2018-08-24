name := "get-programming-with-scala-lesson18"

version := "0.1"

scalaVersion := "2.12.5"

val Http4sVersion = "0.18.8"
val LogbackVersion = "1.2.3"

libraryDependencies ++= Seq(
  "org.http4s"      %% "http4s-blaze-server" % Http4sVersion,
  "org.http4s"      %% "http4s-dsl"          % Http4sVersion,
  "ch.qos.logback"  %  "logback-classic"     % LogbackVersion
)
