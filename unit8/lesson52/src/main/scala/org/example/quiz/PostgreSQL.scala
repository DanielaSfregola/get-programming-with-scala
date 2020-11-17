package org.example.quiz

import com.typesafe.config._
import org.slf4j.LoggerFactory
import org.testcontainers.containers.{BindMode, PostgreSQLContainer}

class PostgreSQL(initScript: String, resourceMapping: Map[String, String] = Map.empty) {

  private val logger = LoggerFactory.getLogger(this.getClass)
  private val imageVersion = "postgres:9.6.12"

  private val container: PostgreSQLContainer[_] = {
    val psql: PostgreSQLContainer[_] = new PostgreSQLContainer(imageVersion).withInitScript(initScript)
    resourceMapping.foreach { case (resourcePath, containerPath) =>
      psql.withClasspathResourceMapping(resourcePath, containerPath, BindMode.READ_ONLY)
    }
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
