package org.example.quiz.dao

import io.getquill._

import scala.concurrent.{ExecutionContext, Future}

class GenericDao(ctx: PostgresJAsyncContext[SnakeCase.type])
                (using ec: ExecutionContext) {
  import ctx._

  def testConnection(): Future[Boolean] = {
    inline def q = quote { infix"SELECT 1".as[Int] }
    val result: Future[Int] = run(q)
    result.map(_ == 1)
  }

}
