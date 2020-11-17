
import java.time.LocalDate

import io.circe._
import io.circe.generic.semiauto._

case class Person(fullName: String, dateOfBirth: LocalDate)

object Person {

  implicit val personEncoder: Encoder[Person] = deriveEncoder[Person]
}


import io.circe.syntax._
val p = Person("John Doe", LocalDate.of(1987, 11, 22))
p.asJson
