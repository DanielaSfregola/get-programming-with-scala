// The library circe uses the ISO-8601 format to convert a local date to its text representation by default:

// scala> import java.time.LocalDate
// import java.time.LocalDate

// scala> import io.circe.syntax._
// import io.circe.syntax._
//
// scala> LocalDate.of(1981,7, 25).asJson
// val res0: io.circe.Json = "1981-07-25"

// Define a new encoder for LocalDate to convert dates using the following date formatter instead:

import java.time.format.DateTimeFormatter
val formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy")

// HINT: You can use the function formatter.format(myDate) to convert an instance myDate of type
// LocalDate to String.



// ANSWER

import java.time.LocalDate
import io.circe._

given dateEncoder: Encoder[LocalDate] with {
  def apply(date: LocalDate): Json =
    Json.fromString(formatter.format(date))
  }


import io.circe.syntax._
LocalDate.of(1987, 11, 22).asJson
