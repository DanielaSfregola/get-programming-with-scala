// The method apply is impure because it throws an exception when the given index does not
// conform to the sequence's length. Implement a method called safeApply as its pure
// equivalent. Your function should return an optional value other than throwing an exception:

// def safeApply[A](list: List[A], n: Int): Option[A]


// ANSWER

def safeApply[A](list: List[A], n: Int): Option[A] =
  if (0 < n &&  n < list.size) Some(list.apply(n))
  else None
