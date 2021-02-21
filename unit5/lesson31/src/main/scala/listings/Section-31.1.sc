List(1,2,3).drop(1)
// res0: List[Int] = List(2, 3)

List(1,2,3).drop(0)
// res1: List[Int] = List(1, 2, 3)

List(1,2,3).drop(4)
// res2: List[Int] = List()


List(1,2,3).take(1)
// res3: List[Int] = List(1)

List(1,2,3).take(0)
// res4: List[Int] = List()

List(1,2,3).take(4)
// res5: List[Int] = List(1, 2, 3)


List(1,2,3,-1,-2,-3).dropWhile(_ < 2)
// res6: List[Int] = List(2, 3)

List(1,2,3,-1,-2,-3).dropWhile(_ < 0)
// res7: List[Int] = List(1, 2, 3)


List(1,2,3,-1,-2,-3).takeWhile(_ < 2)
// res8: List[Int] = List(1)

List(1,2,3,-1,-2,-3).takeWhile(_ < 0)
// res9: List[Int] = List()
