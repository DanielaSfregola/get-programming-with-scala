// Represent a collection of books, in which each book has a title, a list of authors,
// and a genre. Possible genres are action, comic, and drama. Implement a function to return all
// its drama authors: ensure there are no duplicates in the sequence.


// ANSWER

sealed trait Genre
case object Action extends Genre
case object Comic extends Genre
case object Drama extends Genre

case class Book(title: String, authors: List[String], genre: Genre)

def dramaAuthors(books: List[Book]): List[String] =
  books.filter(_.genre == Drama).flatMap(_.authors).distinct
