// Implement a function called superFlatten that takes an instance of Try[Try[Try[T]]]
// and returns one of type Try[T].

// def superFlatten[T](tryT: Try[Try[Try[T]]]): Try[T] = ???


// ANSWER

import scala.util._

def superFlatten[T](tryT: Try[Try[Try[T]]]): Try[T] = tryT.flatten.flatten
