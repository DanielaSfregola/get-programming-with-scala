package quickchecks

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

// Continuation from file src/main/scala/quickchecks/QuickCheck-52.1.scala

class QuickCheck_52_1_FrequencyTest extends AnyFlatSpec with should.Matchers {
   import QuickCheck_52_1.Frequency // using the Frequency implementation from QuickCheck-52.1

   val frequency = new Frequency

   "Frequency" should "count no frequency for the empty string" in {
     val result = frequency.count("")
     result.shouldEqual(Set.empty)
   }

   it should "count the frequency of the characters in a text" in {
     val resultA = frequency.count("test")
     val expectedA = Set('t' -> 2, 'e' -> 1, 's' -> 1)
     resultA.shouldEqual(expectedA)

     val resultB = frequency.count("Test test")
     val expectedB = Set('t' -> 4, 'e' -> 2, 's' -> 2)
     resultB.shouldEqual(expectedB)
   }

   it should "consider characters as case insensitive" in {
     val result = frequency.count("AaA")
     result.shouldEqual(Set('a' -> 3))
   }

   it should "consider only letters and digits" in {
     val result = frequency.count(" ,.?! ")
     result.shouldEqual(Set.empty)
   }
 }
