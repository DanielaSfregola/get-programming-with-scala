package org.example.books.entities

case class User(id: Long, fullName: String)

case class BookLoan(book: Book, user: User)
