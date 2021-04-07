// The following snippet of code defines a SQL query to retrieve all the customers' names in the
// database. What happens when you execute it? Use the Scala REPL within your sbt console
// to validate your hypothesis.

import org.example.registrations._
import TestDatabase.ctx._
import io.getquill.Query

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

val customers: Future[Seq[String]] = run(quote {
  infix"SELECT name FROM customer".as[Query[String]]
})


// ANSWER

// The code compiles, but it fails at runtime because the table's name is incorrect:
// the correct table name is customer, not customers.

// scala> import org.example.registrations._
//      | import TestDatabase.ctx._
//      | import io.getquill.Query._
//      | import scala.concurrent.Future
//      |
//      |
//      | val customers: Future[Seq[String]] = run(quote {
//      |   infix"SELECT name FROM customers".as[Query[String]]
//      | })
// val customers: Future[Seq[String]] = run(quote {
//   ^
//   <pastie>:7: SELECT x.* FROM (SELECT name FROM customers) AS x
//     import org.example.registrations._
//     import TestDatabase.ctx._
//     import scala.concurrent.Future
//     import scala.concurrent.ExecutionContext.Implicits.global
//     customers: scala.concurrent.Future[Seq[String]] = Future(<not completed>)
//     Error with message -> ErrorMessage(fields=HashMap(Position -> 35, Line -> 1160, V -> ERROR, Message -> relation "customers" does not exist, Severity -> ERROR, File -> parse_relation.c, SQLSTATE -> 42P01, Routine -> parserOpenTable))

// If you correct your query, you code will return the name of the three customers in your database:

// scala> val customers: Future[Seq[String]] = run(quote{
//   | infix"SELECT name FROM customer".as[Query[String]] } )
// ^
// SELECT x.* FROM (SELECT name FROM customer) AS x
// res0: Future[Seq[String]] =
// Future(Success(List(Jon Snow, Daenerys Targaryen, Arya Stark)))
//
// Note that the snippet of code used as[Query[String]] instead of as[String]
// because the query returns zero or more records, rather than exactly one.
