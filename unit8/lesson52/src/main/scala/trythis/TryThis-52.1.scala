package trythis

import java.io.FileNotFoundException
import scala.concurrent.{ExecutionContext, Future}
import scala.io.Source

class Frequency {

  def countFromFile(filename: String)
                   (using ec: ExecutionContext): Future[Set[(Char, Int)]] =
    readFromFile(filename).map(count).recover {
      case _: FileNotFoundException => Set.empty
    }

  protected def readFromFile(filename: String)
                            (using ec: ExecutionContext): Future[String] = Future {
    val source = Source.fromFile(filename)
    try {
      source.getLines().mkString
    } finally source.close()
  }

  def count(text: String): Set[(Char, Int)] =
    text.groupBy(char => char).map { case (char, occurrences) =>
      char -> occurrences.length
    }.toSet

}
