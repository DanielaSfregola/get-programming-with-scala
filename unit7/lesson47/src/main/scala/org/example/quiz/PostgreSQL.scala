package org.example.quiz

import com.typesafe.config._
import org.slf4j.LoggerFactory
import org.testcontainers.containers.PostgreSQLContainer

class PostgreSQL(initScript: String) {

  private val logger = LoggerFactory.getLogger(this.getClass)

  private val container: PostgreSQLContainer[_] = {
    val psql: PostgreSQLContainer[_] = new PostgreSQLContainer().withInitScript(initScript)
    logger.info(s"Starting container...")
    psql.start()
    psql
  }

  def stop() = {
    logger.info("Stopping container...")
    container.stop()
  }

  val config: Config = {
    val components = List(
      container.getJdbcUrl,
      s"user=${container.getUsername}",
      s"password=${container.getPassword}"
    )
    ConfigFactory.empty().withValue(
      "url", ConfigValueFactory.fromAnyRef(components.mkString("&"))
    )
  }

}
