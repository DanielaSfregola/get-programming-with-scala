// Suppose you have two key-value structures representing a capital and its country,
// and a country to its continent. Combine the two instances of Map to link each capital
// to its continent using the retrieve value strategies you saw in this lesson.


// ANSWER

def capitalToContinent(capitalToCountry: Map[String, String],
                       countryToContinent: Map[String, String]): Map[String, String] =
  for {
    (capital, country) <- capitalToCountry
    continent <- countryToContinent.get(country)
  } yield capital -> continent

// or alternatively...
//  capitalToCountry.flatMap { case (capital, country) =>
//    val continentOpt = countryToContinent.get(country)
//    continentOpt.map(continent => capital -> continent)
//  }
