import cats.effect.IO
import scala.util.Random

def rollDice(): IO[Int] = IO {
   val n = Random.nextInt(6) + 1
   println(s"Rolled $n...")
   if (n < 4) throw new IllegalStateException(s"Failure! Rolled $n")
   else n
 }

val myRoll = rollDice()
myRoll.unsafeRunSync()
