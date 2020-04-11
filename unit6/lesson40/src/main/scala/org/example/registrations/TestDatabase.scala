package org.example.registrations

import io.getquill.{PostgresJdbcContext, SnakeCase}

object TestDatabase {

  private val psqlServer = new PostgreSQL("init.sql")
  val ctx = new PostgresJdbcContext(SnakeCase, psqlServer.dataSource)

  def stop(): Unit = psqlServer.stop()
}
