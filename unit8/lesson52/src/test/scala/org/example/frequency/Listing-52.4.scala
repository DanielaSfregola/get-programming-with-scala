package org.example.frequency

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class Listing_52_4_FrequencyTest extends AnyFlatSpec with should.Matchers {
  import Listing_52_2.Frequency // using the Frequency implementation from Listing-52.2

  val frequency = new Frequency

  "Frequency" should "count no frequency for the empty string" in {
    val result = frequency.count("")
    result.shouldEqual(Set.empty)
  }

  it should "count the frequency of the characters in a text" in {
    val result = frequency.count("test")
    val expected = Set('t' -> 2, 'e' -> 1, 's' -> 1)
    result.shouldEqual(expected)
  }

}
