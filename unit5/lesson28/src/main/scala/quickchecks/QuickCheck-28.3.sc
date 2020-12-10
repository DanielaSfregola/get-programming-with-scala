// Define a method triple that takes a list of integers as its parameter and returns a new list
// with each element from the original sequence repeated three times. For example, when invoking it
// with List(1, 2, 3) it should return List(1, 1, 1, 2, 2, 2, 3, 3, 3). Use the flatMap function.



// ANSWER

def triple(ns: List[Int]): List[Int] =
  ns.flatMap(n => List(n, n, n))

triple(List(1,2,3))
