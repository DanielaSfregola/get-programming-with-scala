package org.example.quiz

import io.getquill.{PostgresJAsyncContext, SnakeCase}

object TestDatabase {

  private val psqlServer = new PostgreSQL(
    initScript = "init.sql",
    resourceMapping = Map(
      "data/categories.csv" -> "/data/categories.csv",
      "data/questions.csv" -> "/data/questions.csv",
      "data/answers.csv" -> "/data/answers.csv",
    ))
  val ctx = new PostgresJAsyncContext(SnakeCase, psqlServer.config)

  def stop(): Unit = psqlServer.stop()
}

