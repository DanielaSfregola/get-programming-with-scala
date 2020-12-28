// Can you apply the function flatten on an instance of List[Double]? Why?


// ANSWER

// You cannot apply the function flatten on an instance of List[Double]
// because it operates on nested structures only. When trying to do so,
// the compiler will complain that it cannot convert Double to a type that is compatible with List
// (i.e., an instance of GenTraversableOnce).

List(12.34).flatten
//<console>:12: error:
//  |          No implicit view available from Double => IterableOnce[B]
//  |          where:    B is a type variable
//  |          .[B].

