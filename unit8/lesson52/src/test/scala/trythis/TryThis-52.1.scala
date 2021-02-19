package trythis

import org.scalatest.flatspec.AsyncFlatSpec
import org.scalatest.matchers.should

import java.io.FileNotFoundException
import scala.concurrent.{ExecutionContext, Future}

class FrequencyTest extends AsyncFlatSpec with should.Matchers {

  val frequency = new Frequency

  def stubFrequency(data: Map[String, String]): Frequency = new Frequency {
    override def readFromFile(filename: String)
                             (using ec: ExecutionContext): Future[String] =
      Future(
        data.getOrElse(filename,
                      throw new FileNotFoundException(s"File $filename not in stubbed data"))
      )(using ec)
  }

  "Frequency" should "count no frequency for the empty string" in {
    val result = frequency.count("")
    result.shouldEqual(Set.empty)
  }

  it should "count the frequency of the characters in a text" in {
    val result = frequency.count("test")
    val expected = Set('t' -> 2, 'e' -> 1, 's' -> 1)
    result.shouldEqual(expected)
  }

  it should "asynchronously count characters from a file" in {
    val filename = "myFile.txt"
    val frequency = stubFrequency(Map(filename -> "test"))
    val result = frequency.countFromFile(filename)
    val expected = Set('t' -> 2, 'e' -> 1, 's' -> 1)
    result.map(_.shouldEqual(expected))
  }

  it should "return the empty set if the file does not exist" in {
    val filename = "myFile.txt"
    val frequency = stubFrequency(Map.empty)
    val result = frequency.countFromFile(filename)
    result.map(_.shouldEqual(Set.empty))
  }
}
