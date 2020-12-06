// Define a partial function called transform that reverses strings starting with an ‘a’
// and converts to uppercase all those beginning with an ‘s’.
// Use the startsWith, reverse, and toUpperCase functions of the class String.


// ANSWER

val transform: PartialFunction[String, String] = {
  case s if s.startsWith("a") => s.reverse
  case s if s.startsWith("s") => s.toUpperCase
}
