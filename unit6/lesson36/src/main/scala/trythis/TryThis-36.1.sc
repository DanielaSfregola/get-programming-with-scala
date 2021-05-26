// Suppose you have two key-value structures representing a capital to its country
// and a country to its continent. Combine the two instances of Map to link
// each capital to its continent.


// ANSWER

def capitalToContinent(capitalToCountry: Map[String, String],
                       countryToContinent: Map[String, String]): Map[String, String] =
  for {
    (capital, c1) <- capitalToCountry
    (c2, continent) <- countryToContinent
    if c1 == c2
  } yield capital -> continent
