// Consider the following snippet of code. Does it compile? What happens when you execute it?
// Use the Scala REPL to validate your hypothesis.

import io.getquill._
new H2JdbcContext(CamelCase, "another_db")


// ANSWER

// The code compiles, but it fails at runtime: the Quill library is unable to find
// information on how to connect to a database called antoher_db.

//scala> import io.getquill._
//import io.getquill._
//
//scala> new H2JdbcContext(CamelCase, "another_db")
//HikariPool-1 - dataSource or dataSourceClassName or jdbcUrl is required.
//java.lang.IllegalStateException: Failed to load data source for config: 'Config(SimpleConfigObject({}))'
//at io.getquill.JdbcContextConfig.dataSource(JdbcContextConfig.scala:24)
//at io.getquill.H2JdbcContext.<init>(H2JdbcContext.scala:14)
//at io.getquill.H2JdbcContext.<init>(H2JdbcContext.scala:15)
//at io.getquill.H2JdbcContext.<init>(H2JdbcContext.scala:16)
//... 36 elided
//Caused by: java.lang.IllegalArgumentException: dataSource or dataSourceClassName or jdbcUrl is required.
//at com.zaxxer.hikari.HikariConfig.validate(HikariConfig.java:958)
//at com.zaxxer.hikari.HikariDataSource.<init>(HikariDataSource.java:77)
//at io.getquill.JdbcContextConfig.dataSource(JdbcContextConfig.scala:21)
//... 39 more
