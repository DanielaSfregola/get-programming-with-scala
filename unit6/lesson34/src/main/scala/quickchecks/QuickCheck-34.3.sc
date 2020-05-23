// Define a function called allUpper that takes a set of words,
// and it returns a new one in which each element is now uppercase.

// def allUpper(words: Set[String]): Set[String] = ???


// ANSWER

def allUpper(words: Set[String]): Set[String] =
  words.map(_.toUpperCase)
