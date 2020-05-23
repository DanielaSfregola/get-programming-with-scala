// Implement a function called getCountry that takes two parameters: a key-value data structure
// representing a set of capitals matched to their countries, and a capital. It returns
// either the capital’s country or the text “Unknown”.


// ANSWER

def getCountry(capitalToCountry: Map[String, String],
               capital: String): String =
  capitalToCountry.getOrElse(capital, "Unknown")
