package org.example.registrations

import io.getquill.{PostgresJdbcContext, SnakeCase}

class Queries(ctx: PostgresJdbcContext[SnakeCase.type]) {
  import ctx._

  def testConnection(): Boolean = {
    val q = quote { infix"SELECT 1".as[Query[Int]] }
    val result: List[Int] = ctx.run(q)
    result.contains(1)
  }

}
