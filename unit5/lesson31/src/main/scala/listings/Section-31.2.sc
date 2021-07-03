List(1,2,3).filter(_ > 0)
// val res0: List[Int] = List(1, 2, 3)

List(1,2,3).filter(_ > 2)
// val res1: List[Int] = List(3)


List(1,2,3).filterNot(_ > 0)
// val res2: List[Int] = List()

List(1,2,3).filterNot(_ > 2)
// val res3: List[Int] = List(1, 2)
