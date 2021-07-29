// Rewrite the function crossMultiplier you implemented in quick check 34.5
// using for-comprehension.

// ANSWER

def crossMultiplier(groupA: Set[Int],
                    groupB: Set[Int]): Set[Int] =
  for {
    a <- groupA
    b <- groupB
  } yield a * b
