// Define a function that takes a set of book to return the set of genres
// a given author has written. Use the following case class to represent a book:
case class Book(title: String,
                authors: List[String],
                genres: Set[String])


// ANSWER

def getGenres(books: Set[Book], author: String): Set[String] =
  for {
    book <- books
    if book.authors.contains(author)
    genre <- book.genres
  } yield genre


// or alternatively...

def anotherGetGenres(books: Set[Book], author: String): Set[String] =
  books.flatMap { book =>
    if (book.authors.contains(author)) book.genres
    else Set.empty
  }
