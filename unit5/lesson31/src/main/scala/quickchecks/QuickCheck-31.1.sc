// Using the functions drop and take, implement the following method to paginate
// a sequence of strings:
//
//def paginate(data: List[String],
//             pageN: Int,
//             pageSize: Int): List[String]
//
// To simplify, you can assume that the parameters pageN and pageSize are positive numbers.
// If the sequence is not big enough for the requested pagination, return an empty list.
// For example, given a page size of 10, page 1 should return the first 10 elements,
// while page 2 should return from the 11th element to the 20th.


// ANSWER

def paginate(data: List[String], pageN: Int, pageSize: Int): List[String] = {
  val toSkip = (pageN - 1) * pageSize
  data.drop(toSkip).take(pageSize)
}
