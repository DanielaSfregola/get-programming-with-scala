// Write a function called greetings which takes an optional custom message as its parameter
// and it returns a string. When the optional parameter is defined (i.e., it contains a value)
// use it as greeting message, when missing use the predefined message “Greetings, Human!”.
// For example greetings(Some("Hello Scala")) should return the string “Hello Scala”,
// while greetings(None) should return “Greetings, Human!”.


def greetings(customMessage: Option[String]): String =
  customMessage match {
    case Some(message) => message
    case None => "Greetings, Human!"
  }


greetings(Some("Scala"))
greetings(None)
