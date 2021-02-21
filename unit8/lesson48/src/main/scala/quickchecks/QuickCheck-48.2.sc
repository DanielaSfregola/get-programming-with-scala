// The library circe uses the ISO-8601 format to decode a JSON string into a local date instance
// by default:
//
// scala> import java.time.LocalDate
// import java.time.LocalDate
//
// scala> import io.circe.parser._
// import io.circe.parser._
//
// scala> decode[LocalDate](""" "1981-07-25" """)
// val res0: Either[io.circe.Error,java.time.LocalDate] = Right(1981-07-25)

// Define a new decoder for LocalDate to convert to dates using the following date formatter instead:

import java.time.format.DateTimeFormatter
val formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy")

// HINT: You can use the method LocalDate.parse(myDate, formatter) converts an instance myDate
// of type String to LocalDate.



// ANSWER


import java.time.LocalDate
import io.circe._

given dateDecoder: Decoder[LocalDate] with {
  override def apply(c: HCursor): Either[DecodingFailure, LocalDate] =
    c.as[String].map(text => LocalDate.parse(text, formatter))
}


import io.circe.parser._
decode[LocalDate](""" "11/22/1987" """)
