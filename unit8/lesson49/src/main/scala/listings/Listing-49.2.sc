import scala.annotation.tailrec
import scala.util.{Random, Try}

def rollDie(): Int = {
  val n = Random.nextInt(6) + 1
  println(s"Rolled $n...")
  if (n < 4) throw new IllegalStateException(s"Failure! Rolled $n")
  else n
}

@tailrec
def retry[T](n: Int, operation: => T): Try[T] = {
  val result = Try(operation)
  if (result.isFailure && n > 0) retry(n -1, operation)
  else result
}

retry(n = 2, rollDie())
