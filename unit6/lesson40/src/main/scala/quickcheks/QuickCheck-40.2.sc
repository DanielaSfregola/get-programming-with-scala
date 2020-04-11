// The following snippet of code defines a SQL query to retrieve the names of all the students
// in the database. What happens when you execute it? Use the Scala REPL within your sbt console to validate your hypothesis.

import org.example.registrations._
import TestDatabase.ctx._
TestDatabase.ctx.run(quote {
  infix"SELECT name FROM students".as[Query[String]]
})


// ANSWER

// The code compiles, but it fails at runtime because the name of the table is incorrect:
// the correct table name is student, not students.

// scala> import org.example.registrations._
// import org.example.registrations._
//
// scala> import TestDatabase.ctx._
// import TestDatabase.ctx._
//
// scala> TestDatabase.ctx.run(quote{
//   | infix"SELECT name FROM students".as[Query[String]] } )
// ^
// SELECT x.* FROM (SELECT name FROM students) AS x
// org.postgresql.util.PSQLException: ERROR: relation "students" does not exist
// Position: 35

// If you correct your query, you code will return the name of the three students in your database:

TestDatabase.ctx.run(quote{
  infix"SELECT name FROM student".as[Query[String]] } )
//^
//SELECT x.* FROM (SELECT name FROM student) AS x
//res0: List[String] = List(Jon Snow, Daenerys Targaryen, Arya Stark)
