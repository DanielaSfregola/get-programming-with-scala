List(1,2,3).drop(1)
// val res0: List[Int] = List(2, 3)

List(1,2,3).drop(0)
// val res1: List[Int] = List(1, 2, 3)

List(1,2,3).drop(4)
// val res2: List[Int] = List()


List(1,2,3).take(1)
// val res3: List[Int] = List(1)

List(1,2,3).take(0)
// val res4: List[Int] = List()

List(1,2,3).take(4)
// val res5: List[Int] = List(1, 2, 3)


List(1,2,3,-1,-2,-3).dropWhile(_ < 2)
// val res6: List[Int] = List(2,3,-1,-2,-3)

List(1,2,3,-1,-2,-3).dropWhile(_ < 0)
// val res7: List[Int] = List(1,2,3,-1,-2,-3)


List(1,2,3,-1,-2,-3).takeWhile(_ < 2)
// val res8: List[Int] = List(1)

List(1,2,3,-1,-2,-3).takeWhile(_ < 0)
// val res9: List[Int] = List()
