package lesson6

import scala.io.Source

object `6.1.ImplementingReadFileIntoString` {

  def readFileIntoString(filename: String) =
    Source.fromFile(filename)
    .getLines()
    .mkString("\n")

}
