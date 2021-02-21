import java.time.{LocalDate, Period}

import io.circe._

case class Person(fullName: String, dateOfBirth: LocalDate)

object Person {

  // In Scala 2: implicit val personEncoder: Encoder[Person] = new Encoder[Person] { ... }
  given personEncoder: Encoder[Person] with {
    def apply(p: Person): Json = {
      val age = Period.between(p.dateOfBirth, LocalDate.now()).getYears
      Json.obj(
        "fullName" -> Json.fromString(p.fullName),
        "age" -> Json.fromInt(age)
      )
    }
  }
}


import io.circe.syntax._
val p = Person("John Doe", LocalDate.of(1987, 11, 22))
val json = p.asJson
json.toString()
