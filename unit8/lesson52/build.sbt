name := "get-programming-with-scala-lesson52"

version := "0.1"

scalaVersion := "3.0.0"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % "test"

// turning off indentation warnings in scala 3
// such as "Line is indented too far to the left, or a `}` is missing"
scalacOptions += "-noindent"
