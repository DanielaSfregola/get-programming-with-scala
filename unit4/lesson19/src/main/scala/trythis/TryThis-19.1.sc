// Use case classes and case objects to represent the following data:
//-	An author has a forename and a surname.
//-	A genre has only three possible values: Drama, Horror, Romantic.
//-	A book has a title, an author, and a genre.


// ANSWER

case class Author(forename: String, surname: String)

sealed trait Genre
case object Drama extends Genre
case object Horror extends Genre
case object Romantic extends Genre

case class Book(title: String, author: Author, genre: Genre)
