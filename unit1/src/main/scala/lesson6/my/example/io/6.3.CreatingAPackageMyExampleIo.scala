package lesson6.my.example.io

import scala.io.Source

object `6.3.CreatingAPackageMyExampleIo` {

  def readFileIntoString(filename: String) =
    Source.fromFile(filename).getLines().mkString("\n")
}
