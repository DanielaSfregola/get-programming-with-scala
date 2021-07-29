// Define a function called toInt to parse a value of type Future[String] into one of Future[Int].
// Provide an execution context as an implicit parameter rather than importing one directly.


// ANSWER

import scala.concurrent.{ExecutionContext, Future}

def toInt(f: Future[String])
         (using ec: ExecutionContext): Future[Int] =
  f.map(_.toInt)
