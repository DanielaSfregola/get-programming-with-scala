package org.example.registrations

import org.testcontainers.containers.PostgreSQLContainer
import com.zaxxer.hikari.{HikariConfig, HikariDataSource}
import org.slf4j.LoggerFactory

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

  val dataSource: HikariDataSource = {
    val config = new HikariConfig
    config.setJdbcUrl(container.getJdbcUrl)
    config.setUsername(container.getUsername)
    config.setPassword(container.getPassword)
    config.setDriverClassName(container.getDriverClassName)
    new HikariDataSource(config)
  }

}
