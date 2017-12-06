name := "get-programming-with-scala"

version := "1.0"

scalaVersion := "2.12.3"

lazy val root = (project in file(".")).aggregate(unit0, unit1, unit2, unit3)

lazy val unit0 = project in file("unit0")
lazy val unit1 = project in file("unit1")
lazy val unit2 = project in file("unit2")
lazy val unit3 = project in file("unit3")
