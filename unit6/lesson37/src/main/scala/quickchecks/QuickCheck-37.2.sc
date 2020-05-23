// Implement a function called getCapitals that returns a list of all the capitals in a
// key-value data structure representing a group of capitals and their countries.

// ANSWER

// You can implement the function getCapitals as the following:

def getCapitals(capitalToCountry: Map[String, String]): List[String] =
  capitalToCountry.keys.toList

// The return type of your function is List[String], rather than Iterable[String]:
// you need to use the methods toList to convert the generic iterable value into a list.
