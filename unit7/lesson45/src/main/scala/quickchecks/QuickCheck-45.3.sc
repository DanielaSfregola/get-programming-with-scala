// Define a function called firstSuccessful that takes a sequence of Future instances
// and returns the first future instance to complete successfully.


import scala.concurrent.{ExecutionContext, Future}

def firstSuccessful[T](in: Iterable[Future[T]])
                      (implicit ec: ExecutionContext): Future[Option[T]]


// ANSWER

def firstSuccessful[T](in: Iterable[Future[T]])
                      (implicit ec: ExecutionContext): Future[Option[T]] =
  Future.find(in)(_ => true)
