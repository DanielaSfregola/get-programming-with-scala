package lesson6.my.example.io

import scala.io.Source

// Listing 9.3
object CreatingAPackageMyExampleIo {

  def readFileIntoString(filename: String) =
    Source.fromFile(filename).getLines().mkString("\n")
}
