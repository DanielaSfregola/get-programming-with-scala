package my.example.io

import scala.io.Source

object MyExample {

  def readFileIntoString(filename: String) =
    Source.fromFile(filename).getLines().mkString("\n")
}

