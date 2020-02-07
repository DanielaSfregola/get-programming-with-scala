// Rewrite the function crossMultiplier you have implemented in quick check 34.5
// using a for-comprehension statement.

// ANSWER

def crossMultiplier(groupA: Set[Int], groupB: Set[Int]): Set[Int] =
  for {
    a <- groupA
    b <- groupB
  } yield a * b
