// Suppose you are writing a program to represent all the books in a public library.
// Represent a book to have the following information: its title, author, publication date,
// editor, an ISBN (i.e., a code that uniquely identifies it), and its total page number.
// You can search a book either by title, author, ISBN, or a combination of the three
// in the library search engine. Also, all the books in the search engine should have
// at least ten pages. Implement a book representation for the library and define an
// unapply method to reflect your search engine’s requirements.


// ANSWER

import java.time.LocalDate

case class Book(
 title: String,
 author: String,
 publicationDate: LocalDate,
 editor: String,
 ISBN: String,
 pages: Int)

object Book {

  def unapply(book: Book): Option[(String, String, String)] = {
    if (book.pages < 10) None
    else Some((book.title, book.author, book.ISBN))
  }

}
