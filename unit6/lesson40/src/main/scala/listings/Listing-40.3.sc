// copied from the implementation of scala.util.Try:

//package scala.util
//import scala.util.control.NonFatal

//object Try {
//
//  def apply[T](r: => T): Try[T] =
//    try Success(r) catch {
//      case NonFatal(e) => Failure(e)
//    }
//}
