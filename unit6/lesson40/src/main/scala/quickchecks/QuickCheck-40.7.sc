// The class String offers a function called toBoolean to convert text into a boolean value.
// This function is unsafe because it throws an exception for any string that does not match
// "true" or "false". Implement a function called toSafeBoolean by reusing toBoolean and
// returning false rather than throwing an exception.


// ANSWER
import scala.util.Try

def toSafeBoolean(text: String): Boolean =
  Try(text.toBoolean).getOrElse(false)
