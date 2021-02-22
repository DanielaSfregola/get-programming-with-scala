import scala.io.Source

def readFileIntoString(filename: String) =
  Source.fromFile(filename)
  .getLines()
  .mkString("\n")
