package org.example.registrations

import scala.concurrent.{ExecutionContext, Future}
import io.getquill._

case class Customer(id: Int, name: String)

class CustomerQueries(ctx: PostgresJAsyncContext[SnakeCase.type]) {
  import ctx._

  private inline def customers = quote { query[Customer] }

  def all()(using ec: ExecutionContext): Future[Seq[Customer]] = {
    // Generated SQL: SELECT x.id, x.name FROM customer x
    run(customers)
  }

  def nameById(id: Int)
              (using ec: ExecutionContext): Future[Seq[String]] = {
    // Generated SQL: SELECT x1.name FROM customer x1 WHERE x1.id = ?
    inline def q = quote {
      customers.filter(_.id == lift(id))
              .map(_.name)
    }
    run(q)
  }

  def save(customer: Customer)
          (using ec: ExecutionContext): Future[String] = {
    // Generated SQL: INSERT INTO customer (id,name) VALUES (?, ?) RETURNING name
    inline def q = quote {
      customers.insert(lift(customer))
              .returning(_.name)
    }
    run(q)
  }

  def updateNameById(id: Int, nameToUpdate: String)
                    (using ec: ExecutionContext): Future[Long] = {
    // Generated SQL: UPDATE customer SET name = ? WHERE id = ?
    inline def q = quote {
      customers.filter(_.id == lift(id))
              .update(_.name -> lift(nameToUpdate))
    }
    run(q)
  }

  def deleteById(id: Int)
                (using ec: ExecutionContext): Future[Long] = {
    // Generated SQL: DELETE FROM customer WHERE id = ?
    inline def q = quote {
      customers.filter(_.id == lift(id)).delete
    }
    run(q)
  }

}
