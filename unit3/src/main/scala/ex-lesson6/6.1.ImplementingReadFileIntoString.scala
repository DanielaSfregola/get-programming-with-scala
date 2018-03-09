package lesson6

import scala.io.Source

// Listing 6.1
object ImplementingReadFileIntoString extends App {

  def readFileIntoString(filename: String) =
    Source.fromFile(filename)
    .getLines()
    .mkString("\n")

}
