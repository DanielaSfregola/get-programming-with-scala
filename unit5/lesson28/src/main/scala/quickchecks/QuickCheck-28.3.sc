// Using the flatMap function, define a method triple that takes a list of integers as its parameter,
// and it returns a new list in which each element of the original sequence is repeated three times.
// For example, when given invoking it with List(1, 2, 3) it should return List(1, 1, 1, 2, 2, 2, 3, 3, 3).



// ANSWER:

def triple(ns: List[Int]): List[Int] =
  ns.flatMap(n => List(n, n, n))

triple(List(1,2,3))
