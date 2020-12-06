// Write a function called greetings that takes an optional custom message as its parameter
// and returns a string. Use its optional parameter as its greeting message when defined
// (i.e., it contains a value), use the predefined message “Greetings, Human!” when missing.
// For example, greetings(Some("Hello Scala")) should return the string “Hello Scala”,
// while greetings(None) should return “Greetings, Human!”.


// ANSWER

def greetings(customMessage: Option[String]): String =
  customMessage match {
    case Some(message) => message
    case None => "Greetings, Human!"
  }


greetings(Some("Scala"))
greetings(None)
