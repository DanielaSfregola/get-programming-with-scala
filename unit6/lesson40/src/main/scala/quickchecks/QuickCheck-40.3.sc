// Implement a function to transform an instance of Try[Double] into one of Try[Float]
// using the map method.

// def toFloat(d: Try[Double]): Try[Float] = ???


// ANSWER

import scala.util.Try

def toFloat(d: Try[Double]): Try[Float] = d.map(_.toFloat)
