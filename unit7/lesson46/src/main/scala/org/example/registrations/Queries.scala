package org.example.registrations

import io.getquill._
import scala.concurrent.{ExecutionContext, Future}

class Queries(ctx: PostgresJAsyncContext[SnakeCase.type]) {
  import ctx._

  def testConnection()(using ec: ExecutionContext): Future[Boolean] = {
    inline def q = quote { infix"SELECT 1".as[Int] }
    val result: Future[Int] = run(q)
    result.map(_ == 1)
  }

}
