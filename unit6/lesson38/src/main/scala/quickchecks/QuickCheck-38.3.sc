// Implement a function called truncate that takes a parameter of type Either[Double, String],
// and it truncates its text to its first 24 characters if any. Use the map method on Either.


// ANSWER

def truncate(e: Either[Double, String]): Either[Double, String] =
  e.map(_.take(24))
// or alternatively...
// e.right.map(_.take(24))
