// Write a function called filter that takes two parameters of type String, called text and word,
// and it returns an Option[String]. It should return either the original string if text contains
// word or no value.


// ANSWER

def filter(text: String, word: String): Option[String] =
  if (text.contains(word)) Some(text) else None
