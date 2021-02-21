// The following snippet of code prints all the files in the current directory to the terminal:
// change its code to execute it asynchronously.

import java.io.File
new File(".").listFiles().foreach(println)


// ANSWER

import java.io.File
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

Future {
  new File(".").listFiles().foreach(println)
}
