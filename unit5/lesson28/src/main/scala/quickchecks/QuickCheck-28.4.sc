// In the previous quick check, you have implemented a function called triple using flatMap:
// re-implement it using a for-comprehension statement.


// ANSWER:

def triple(ns: List[Int]): List[Int] =
  for {
    n <- ns
    i <- List(n, n, n)
  } yield i

triple(List(1,2,3))
