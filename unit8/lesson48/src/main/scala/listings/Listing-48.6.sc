import java.time.LocalDate

import io.circe._
import io.circe.generic.semiauto._

case class Person(fullName: String, dateOfBirth: LocalDate)

object Person {

  // In Scala 2: implicit val personDecoder: Decoder[Person] = deriveDecoder[Person]
  given personDecoder: Decoder[Person] = deriveDecoder[Person]
}


import io.circe.parser._

val goodData: String = """ { "fullName": "John Doe", "dateOfBirth": "1987-11-22" } """
decode[Person](goodData)
val badData: String = """ { "fullName": "John Doe" } """
decode[Person](badData)
