package org.example.books.entities

import scala.util.{Failure, Success, Try}
import java.net.URL

case class Book(id: Long,
                title: String,
                authors: List[String],
                imageUrl: Option[URL]) {

  def toPrettyString: String =
    s"[$id] $title ${authors.mkString("{", ", ", "}")}"
}

object Book {

  def parse(row: Map[String, String]): Try[Book] = ???
  
}
