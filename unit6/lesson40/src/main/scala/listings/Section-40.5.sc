import scala.util.Try

Try(5/2).isSuccess
// res0: Boolean = true

Try(5/2).isFailure
// res0: Boolean = false

Try(5/2).getOrElse { println("Side Effect!");  42 }
// res9: Int = 2

Try(5/0).getOrElse { println("Side Effect!");  42 }
// Side Effect!
// res10: Int = 42

