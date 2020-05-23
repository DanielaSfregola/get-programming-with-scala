// Consider the following snippet of code:

def validation(a: Either[String, Int],
               b: Either[String, Int]): Either[String, Int] =
  a.flatMap { aa =>
    b.map(bb => aa + bb)
  }

// What value does the following function call return? Why? Use the REPL to validate your hypothesis.

validation(Left("first failure"), Left("second failure"))
// res0: Either[String,Int] = Left(first failure)


// ANSWER
// The function validation returns Left("first failure") because the flatMap operation doesn’t evaluate its parameter if finds an instance of Left:

// The type Either does not work well when error accumulation is needed. Instead, you should
// consider using cats.data.Validated from the typelevel cats project. Although this is not part
// of the standard library, it is particularly popular, and it allows you to use more advanced
// functional programming techniques, such as applicatives, which unfortunately
// we are not going to cover in this book.
