// Implement a function that takes either a string or an integer, and it returns true
// if the given text is “Scala”, false otherwise.



// ANSWER

def isScala(value: Either[String, Int]): Boolean =
  value.left.exists(_ == "Scala")
