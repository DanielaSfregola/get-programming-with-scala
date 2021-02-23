package org.example.quiz

import io.getquill.{PostgresAsyncContext, SnakeCase}

object TestDatabase {

  private val psqlServer = new PostgreSQL("init.sql")
  val ctx = new PostgresAsyncContext(SnakeCase, psqlServer.config)

  def stop(): Unit = psqlServer.stop()
}

