// Define a function called parseToInt to parse a numeric text of type IO[String] and
// produce an instance of type IO[Int].


// ANSWER

import cats.effect.IO

def parseToInt(text: IO[String]): IO[Int] = text.map(_.toInt)
