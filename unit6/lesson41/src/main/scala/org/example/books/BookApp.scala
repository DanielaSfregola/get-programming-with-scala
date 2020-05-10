package org.example.books

import org.example.books.entities.User
import org.slf4j.{Logger, LoggerFactory}

object BookApp extends App {
  private val logger: Logger = LoggerFactory.getLogger(this.getClass)

  val bookService = new BookService("books.csv")

  val books = bookService.search(title = Some("Harry Potter"))

  val res = books.map(_.toPrettyString)
  logger.info(s"Found ${books.size} books: \n${res.mkString("\n")}")

  val martin = User(1, "Martin Odersky")
  val daniela = User(2, "Daniela Sfregola")

  require(books.size >= 2,
          "This example scenario needs at least two books")
  val bookA = books.apply(0)
  val bookB = books.apply(1)

  // martin takes the first two books
  bookService.reserveBook(bookA.id, martin)
  bookService.reserveBook(bookB.id, martin)

  // daniela tries to reserve one of the books that martin has
  bookService.reserveBook(bookA.id, daniela)

  // daniela tries to reserve a random book that does not exist
  bookService.reserveBook(-1, daniela)

  // martin returns the book daniela wants
  bookService.returnBook(bookA.id)

  // daniela takes the book
  bookService.reserveBook(bookA.id, daniela)
}
