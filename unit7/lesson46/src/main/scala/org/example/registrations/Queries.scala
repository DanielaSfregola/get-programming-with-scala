package org.example.registrations

import io.getquill.{PostgresAsyncContext, SnakeCase}
import scala.concurrent.{ExecutionContext, Future}

class Queries(ctx: PostgresAsyncContext[SnakeCase.type])
             (implicit ec: ExecutionContext) {
  import ctx._

  def testConnection(): Future[Boolean] = {
    val q = quote { infix"SELECT 1".as[Int] }
    val result: Future[Int] = run(q)
    result.map(_ == 1)
  }

}
