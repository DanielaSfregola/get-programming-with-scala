// Implement a server that exposes an API that successfully replies to
// any request with a response with status code “200 – Ok” and its body
// containing a message that provides the request method and path.
// For example, when receiving a request POST /this/is/an/example, it should
// reply with a response with status code “200 – Ok” and
// a body “method is POST; path is /this/is/an/example”.


// ANSWER

import cats.effect.{ExitCode, IO, IOApp}
import org.http4s.server.Router
import org.http4s.server.blaze.BlazeServerBuilder
import org.http4s.implicits._

import scala.concurrent.ExecutionContext

object InfoApp extends IOApp {

  private val httpApp = Router(
    "/" -> new InfoApi().routes
  ).orNotFound

  override def run(args: List[String]): IO[ExitCode] =
    stream(args).compile.drain.as(ExitCode.Success)

  private def stream(args: List[String]) =
    BlazeServerBuilder[IO](ExecutionContext.global)
    .bindHttp(8000, "0.0.0.0")
    .withHttpApp(httpApp)
    .serve
}

import org.http4s.HttpRoutes
import org.http4s.dsl.Http4sDsl

class InfoApi extends Http4sDsl[IO] {

  val routes = HttpRoutes.of[IO] {
    case method -> path => Ok(s"method is $method; path is $path")
  }

}
