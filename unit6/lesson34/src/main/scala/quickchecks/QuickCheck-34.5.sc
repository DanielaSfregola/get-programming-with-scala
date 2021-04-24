// Define a function called crossMultiplier that takes two sets of integers as its parameters
// and returns a new set containing all the numbers produced by multiplying
// each element of the first one for the second.
//
// def crossMultiplier(groupA: Set[Int], groupB: Set[Int]): Set[Int] = ???
//
// For example, when applying the crossMultiplier function to two sets containing
// the numbers 1,3 and 2,4,6, respectively, it should return a new one containing
// the numbers 2, 4, 6, 12, 18.


// ANSWER

def crossMultiplier(groupA: Set[Int], groupB: Set[Int]): Set[Int] =
  groupA.flatMap { a =>
    groupB.map(b => a * b)
  }
