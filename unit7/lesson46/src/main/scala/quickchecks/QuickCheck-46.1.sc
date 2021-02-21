// Define a Quill context to connect to a PostgreSQL database by parsing a configuration file
// and using a camel case naming convention.
// Your application.properties file contains the following data:

// db.url=postgresql://host:5432/database?user=root&password=root

// app {
//   name=my_application
//   owner=my_team
//   port=8080
// }


// ANSWER

import io.getquill._
new PostgresAsyncContext(CamelCase, "db")
