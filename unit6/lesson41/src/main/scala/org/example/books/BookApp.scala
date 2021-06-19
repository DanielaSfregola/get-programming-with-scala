package org.example.books

import org.example.books.entities.User
import org.slf4j.{Logger, LoggerFactory}

object BookApp extends App {
  private val logger: Logger = LoggerFactory.getLogger(this.getClass)

  val bookService = new BookService("books.csv")

  val books = bookService.search(title = Some("Harry Potter"))

  val res = books.map(_.toPrettyString)
  logger.info(s"Found ${books.size} books: \n${res.mkString("\n")}")

  val alice = User(1, "Alice Abbott")
  val bob = User(2, "Bob Brown")

  require(books.size >= 2,
          "This example scenario needs at least two books")
  val bookA = books.apply(0)
  val bookB = books.apply(1)

  // alice takes the first two books
  bookService.reserveBook(bookA.id, alice)
  bookService.reserveBook(bookB.id, alice)

  // bob tries to reserve one of the books that alice has
  bookService.reserveBook(bookA.id, bob)

  // bob tries to reserve a random book that does not exist
  bookService.reserveBook(-1, bob)

  // alice returns the book bob wants
  bookService.returnBook(bookA.id)

  // bob takes the book
  bookService.reserveBook(bookA.id, bob)
}
