// Implement a function called longestCapitalName that takes a capital-to-country
// key-value structure and it returns the capital with the longest name.


// ANSWER

def longestCapitalName(
      capitalToCountry: Map[String, String]
    ): String = {
  val (capital, _) = capitalToCountry.maxBy { case (c, _) =>
    c.length
  }
  capital
}
