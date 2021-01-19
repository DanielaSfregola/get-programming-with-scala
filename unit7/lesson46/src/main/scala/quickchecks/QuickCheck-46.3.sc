// Add a function customersByName to your class CustomerQueries to generate and run
// a query to retrieve customers with a given name.

// def customersByName(name: String): List[Customer] = ???


// ANSWER

import io.getquill.{PostgresAsyncContext, SnakeCase}
import scala.concurrent.{ExecutionContext, Future}

case class Customer(id: Int, name: String)

class CustomerQueries(ctx: PostgresAsyncContext[SnakeCase.type]) {
  import ctx._

  private val customers = quote { query[Customer] }

  def customersByName(name: String)
                     (implicit ec: ExecutionContext): Future[List[Customer]] = {
    val q = quote { customers.filter(_.name == lift(name)) }
    run(q)
  }
}

