// Re-implement the following snippet of code using a for-comprehension statement:

// def validation(a: Either[String, Int], b: Either[String, Int]): Either[String, Int] =
//   a.flatMap { aa =>
//     b.map(bb => aa + bb)
//   }


// ANSWER

def validation(a: Either[String, Int], b: Either[String, Int]): Either[String, Int] =
  for {
    aa <- a
    bb <- b
  } yield aa + bb
