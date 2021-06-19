// Consider the following case class to represent a book:

case class Book(title: String,
                authors: List[String],
                tags: Set[String])

// Serialize and deserialize its instances to JSON using the circe library.

// ANSWER

import io.circe._
import io.circe.generic.semiauto._

object Book {

  // In Scala 2: implicit val bookEncoder: Encoder[Book] = deriveEncoder[Book]
  given bookEncoder: Encoder[Book] = deriveEncoder[Book]
  // In Scala 2: implicit val bookDecoder: Decoder[Book] = deriveDecoder[Book]
  given bookDecoder: Decoder[Book] = deriveDecoder[Book]
}


import io.circe.syntax._
import io.circe.parser._

val thisBook = Book(
  title = "Get Programming With Scala",
  authors = List("Daniela Sfregola"),
  tags = Set("programming", "scala", "tags"))

val thisBookAsJsonString = thisBook.asJson.toString()
// val thisBookAsJsonString: String =
// {
//   "title" : "Get Programming With Scala",
//   "authors" : [
//   "Daniela Sfregola"
//   ],
//   "tags" : [
//   "programming",
//   "scala",
//   "tags"
//   ]
// }

decode[Book](thisBookAsJsonString)
// val res0: Either[io.circe.Error,Book] = Right(Book(Get Programming With Scala,List(Daniela Sfregola),Set(programming, scala, tags)))
