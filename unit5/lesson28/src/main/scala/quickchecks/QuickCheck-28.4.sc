// In quick check 28.3, you have implemented a function called triple using flatMap:
// re-implement it using for-comprehension.


// ANSWER

def triple(ns: List[Int]): List[Int] =
  for {
    n <- ns
    i <- List(n, n, n)
  } yield i

triple(List(1,2,3))
