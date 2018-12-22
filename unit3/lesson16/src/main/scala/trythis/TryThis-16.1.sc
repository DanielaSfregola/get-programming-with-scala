// Implement a function to parse a string into an integer.
// If you cannot parse it, return its length instead.
// HINT: Use the toInt function on an instance of String.


// ANSWER
def asInteger(text: String): Int =
  try {
    text.toInt
  } catch {
    case _: NumberFormatException => text.length
  }
