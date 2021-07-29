import scala.util.Try

Try(5/2).isSuccess
// val res0: Boolean = true

Try(5/2).isFailure
// val res0: Boolean = false

Try(5/2).getOrElse { println("Side Effect!");  42 }
// val res9: Int = 2

Try(5/0).getOrElse { println("Side Effect!");  42 }
// Side Effect!
// val res10: Int = 42

