package org.example.frequency

import scala.concurrent.{ExecutionContext, Future}
import scala.io.Source

object Listing_52_5 {

  class Frequency {

    def countFromFile(filename: String)
                     (using ec: ExecutionContext): Future[Set[(Char, Int)]] =
      readFromFile(filename).map(count)

    private def readFromFile(filename: String)
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

}
