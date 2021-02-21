// Define a function called firstSuccessful that takes a sequence of Future instances
// and returns the first future instance to complete successfully.


// ANSWER

import scala.concurrent.{ExecutionContext, Future}

def firstSuccessful[T](in: List[Future[T]])
                      (using ec: ExecutionContext): Future[Option[T]] =
  Future.find(in)(_ => true)
