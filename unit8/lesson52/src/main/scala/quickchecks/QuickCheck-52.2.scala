// The function countFromFile currently returns an asynchronous failure if the given file
// does not exist: modify its implementation to return an empty set instead. Write a test for this
// use case.  HINT: The recover function of a Future instance allows you to define recovery values
// to use when throwing specific exceptions. It was the following signature:
//
// def recover[T](pf: PartialFunction[Throwable, T])
//               (using executor: ExecutionContext): Future[T]


// ANSWER
// Also, check the test file src/test/scala/quickchecks/QuickCheck-52.2.scala

package quickchecks

import java.io.FileNotFoundException
import scala.concurrent.{ExecutionContext, Future}
import scala.io.Source

object QuickCheck_52_2 {

  class Frequency {

    def countFromFile(filename: String)
                     (using ec: ExecutionContext): Future[Set[(Char, Int)]] =
      readFromFile(filename).map(count).recover {
        case _: FileNotFoundException => Set.empty
      }

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
