package org.example.quiz

import io.getquill.{PostgresAsyncContext, SnakeCase}

object TestDatabase {

  private val psqlServer = new PostgreSQL(
    initScript = "init.sql",
    resourceMapping = Map(
      "data/categories.csv" -> "/data/categories.csv",
      "data/questions.csv" -> "/data/questions.csv",
      "data/answers.csv" -> "/data/answers.csv",
    ))
  val ctx = new PostgresAsyncContext(SnakeCase, psqlServer.config)

  def stop(): Unit = psqlServer.stop()
}

