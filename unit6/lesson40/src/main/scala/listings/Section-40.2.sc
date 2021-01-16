import scala.util._

Try(1) match {
  case Success(n) => n
}
// <console>:16: warning: match may not be exhaustive.
//  It would fail on the following input: Failure(_)
//  Try(1) match {
//  ^
//  res1: Int = 1
