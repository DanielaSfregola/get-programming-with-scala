// Write a function called filter which takes two parameters of type String, called text and word,
// and it returns an Option[String]. The function should return the original text if it contains
// the given word, otherwise it should return no value.


def filter(text: String, word: String): Option[String] =
  if (text.contains(word)) Some(text) else None
