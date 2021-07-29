package org.example.registrations

import io.getquill.{PostgresJAsyncContext, SnakeCase}

object TestDatabase {

  private val psqlServer = new PostgreSQL("init.sql")
  val ctx = new PostgresJAsyncContext(SnakeCase, psqlServer.config)

  def stop(): Unit = psqlServer.stop()
}
