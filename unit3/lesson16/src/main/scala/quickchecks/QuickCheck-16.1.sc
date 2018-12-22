// Define a partial function, called transform, to reverse all strings starting with an ‘a’ and
// to uppercase all those starting with an ‘s’.
// HINT: Use the startsWith, reverse, and toUpperCase functions of the class String.

val transform: PartialFunction[String, String] = {
  case s if s.startsWith("a") => s.reverse
  case s if s.startsWith("s") => s.toUpperCase
}
