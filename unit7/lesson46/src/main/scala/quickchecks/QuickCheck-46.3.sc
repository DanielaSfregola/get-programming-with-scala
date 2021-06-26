// Add the function customersByName to your class CustomerQueries to generate and run
// a query to retrieve customers with a given name.

// def customersByName(name: String): Seq[Customer] = ???


// ANSWER

import io.getquill._
import scala.concurrent.{ExecutionContext, Future}

case class Customer(id: Int, name: String)

class CustomerQueries(ctx: PostgresJAsyncContext[SnakeCase.type]) {
  import ctx._

  private val customers = quote { query[Customer] }

  def customersByName(name: String)
                     (using ec: ExecutionContext): Future[Seq[Customer]] = {
    // In Scala 2: val q = ...
    inline def q = quote { customers.filter(_.name == lift(name)) }
    run(q)
  }
}

