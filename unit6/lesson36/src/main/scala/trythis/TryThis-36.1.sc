// Suppose you have two key-value structures to represent a capital and its country,
// and a country to each continent. Combine the two instances of Map to link
// each capital to its continent.


// ANSWER

def capitalToContinent(capitalToCountry: Map[String, String],
                       countryToContinent: Map[String, String]): Map[String, String] =
  for {
    (capital, c1) <- capitalToCountry
    (c2, continent) <- countryToContinent
    if c1 == c2
  } yield capital -> continent
