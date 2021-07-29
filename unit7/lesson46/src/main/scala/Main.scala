import org.example.registrations._

import scala.concurrent.ExecutionContext.Implicits.global

object Main extends App {

    { // section 46.1.2
        val psqlServer = new PostgreSQL("init.sql")
        psqlServer.stop()
    }

    { // section 46.3
        val queries = new Queries(TestDatabase.ctx)
        printlnResult(queries.testConnection())
    }

    { // section 46.4
        val customers = new CustomerQueries(TestDatabase.ctx)
        printlnResult(customers.all())
        printlnResult(customers.save(Customer(4, "Martin")))
        printlnResult(customers.updateNameById(4, "Jane"))
        printlnResult(customers.nameById(4))
        printlnResult(customers.deleteById(4))
        printlnResult(customers.all())
    }

    import scala.concurrent.Await
    import scala.concurrent.duration._
    import scala.concurrent.Future

    private def printlnResult[T](f: Future[T]) = {
        val t = Await.ready(f, atMost = 1.minute)
        println(t)
    }

}
