List(0.4, -2, 3).sorted
// res0: List[Double] = List(-2.0, 0.4, 3.0)

List("my", "example").sorted
// res1: List[String] = List(example, my)

List.empty[Double].sorted
// res2: List[Double] = List()


List(0.4, -2, 3).sortBy(i => -i)
// res3: List[Double] = List(3.0, 0.4, -2.0)
// Ordering doubles in descending order

case class A(n: Int, text: String)
// defined case class A

List(A(1, "z"), A(9, "a"), A(1, "a")).sortBy(e => (e.text, e.n))
// res4: List[A] = List(A(1,a), A(9,a), A(1,z))
// Ordering by the field text first, then by n


List(1, 3, 2).reverse
// res5: List[Int] = List(2, 3, 1)

List.empty[String].reverse
// res6: List[String] = List()


import scala.util.Random

Random.shuffle(List(1, 2, 3))
// res7: List[Int] = List(2, 1, 3)

Random.shuffle(List(1, 2, 3))
// res8: List[Int] = List(3, 2, 1)
// calling Random.shuffle multiple times returns a different result!
