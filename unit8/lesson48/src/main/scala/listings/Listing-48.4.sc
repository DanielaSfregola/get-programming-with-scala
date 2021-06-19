import java.time.LocalDate

import io.circe._

case class Person(fullName: String, dateOfBirth: LocalDate)

object Person {

  // In Scala 2: implicit val personDecoder: Decoder[Person] = new Decoder[Person] { ... }
  given personDecoder: Decoder[Person] with {

    def apply(c: HCursor): Either[DecodingFailure, Person] =
      for {
        fullName <- c.downField("fullName").as[String]
        dateOfBirth <- c.downField("dateOfBirth").as[LocalDate]
      } yield Person(fullName, dateOfBirth)

  }
}


import io.circe.parser._

val goodData: String = """ { "fullName": "John Doe", "dateOfBirth": "1987-11-22" } """
decode[Person](goodData)
val badData: String = """ { "fullName": "John Doe" } """
decode[Person](badData)
