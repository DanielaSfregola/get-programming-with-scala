// The init.sql file you have downloaded for this lesson also creates another table called product
// with the following structure:
//
// CREATE TABLE IF NOT EXISTS product (
// id INTEGER,
// title VARCHAR(45) NOT NULL,
// creation_date DATE NOT NULL,
// PRIMARY KEY (id)
// );
//
// Define functions to perform the following operations:
// -	create a product
// -	select all of those with a given title
// -	change the title of a specific product
// - 	delete a product by id.

// ANSWERS

import java.time.LocalDate

import io.getquill.{PostgresJAsyncContext, SnakeCase}
import scala.concurrent.{ExecutionContext, Future}

case class Customer(id: Int, name: String)
case class Product(id: Int, title: String, creationDate: LocalDate)

class ProductQueries(ctx: PostgresJAsyncContext[SnakeCase.type]) {
  import ctx._

  private val products = quote { query[Product] }

  def create(product: Product)
            (implicit ec: ExecutionContext): Future[Long] = {
    val q = quote { products.insert(product) }
    run(q)
  }

  def allByTitle(title: String)
                (implicit ec: ExecutionContext): Future[Seq[Product]] = {
    val q = quote { products.filter(_.title == lift(title)) }
    run(q)
  }

  def updateTitle(id: Int, title: String)
                 (implicit ec: ExecutionContext): Future[Long] = {
    val q = quote { products.filter(_.id == lift(id))
                    .update(_.title -> lift(title)) }
    run(q)
  }

  def deleteById(id: Int)
                (implicit ec: ExecutionContext): Future[Long] = {
    val q = quote {
      products.filter(_.id == lift(id)).delete
    }
    run(q)
  }

}
