package org.example.books.entities

import java.net.URL

import scala.util.Try

case class Book(id: Long, title: String, authors: List[String], imageUrl: Option[URL]) {

  def toPrettyString: String = s"[$id] $title ${authors.mkString("{", ", ", "}")}"
}

object Book {

  def parse(row: Map[String, String]): Try[Book] = ???
  
}
