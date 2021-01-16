// In Quick Check 38.4, you have seen that the given implementation of the function validation
// doesn’t behave as expected when you need to accumulate errors. Change its return type to
// Either[List[String], Int], and its implementation to address this issue.
// HINT: Use a pattern matching statement.


// ANSWER

def validation(a: Either[String, Int],
               b: Either[String, Int]): Either[List[String], Int] =
  (a, b) match {
    case (Right(aa), Right(bb)) => Right(aa + bb)
    case (Left(errA), Left(errB)) => Left(List(errA, errB))
    case (Left(err), _) => Left(List(err))
    case (_, Left(err)) => Left(List(err))
  }

validation(Left("first failure"), Left("second failure"))
// res0: Either[List[String],Int] = Left(List(first failure, second failure))
