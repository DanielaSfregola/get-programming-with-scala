package org.example.books

import org.example.books.entities._
import org.slf4j.{Logger, LoggerFactory}

class BookService(bookCatalogPath: String) {

  private val logger: Logger = LoggerFactory.getLogger(this.getClass)

  private val books: List[Book] = new BookParser(bookCatalogPath).books

  private var bookLoans: Set[BookLoan] = ???

  def search(title: Option[String] = None,
             author: Option[String] = None): List[Book] = ???

  def reserveBook(bookId: Long, user: User): Either[String, BookLoan] = ???

  def returnBook(bookId: Long): Either[String, BookLoan] = ???

}
