// Suppose you are writing a program to represent all the books in a public library.
// Represent a book to have the following information: its title, author, publication date,
// editor, an ISBN – which is a code that uniquely identifies the book –, and its total page number.
// In the library search engine, you can search a book either by title, author, ISBN, or a
// combination of the three. Also, all the books in the search engine should have at least ten pages.
// Implement a representation for a book in the library and define an unapply method to reflect
// the requirements of your search engine.

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
