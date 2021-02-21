// You have received two bug reports on your implementation of count.
// 1.	The function is incorrectly counting characters that are not letters nor digits
//    (e.g., white space, punctuation, etc.): you should ignore them.
// 2.	Also, it should consider each character as case insensitive. For example,
//    it should add the occurrences of the character ‘A’ to those of the character ‘a’.
// For example, the text “Test test!” should return the following count (and nothing else!):
// the character ‘t’ four times, the characters ‘e’ and ‘s’ twice.
// Write new test scenarios to replicate the bugs and fix them.


// ANSWER
// Also, check the test file src/test/scala/quickchecks/QuickCheck-52.1.scala

package quickchecks

object QuickCheck_52_1 {

  class Frequency {

    def count(text: String): Set[(Char, Int)] =
      text.toLowerCase.filter(_.isLetterOrDigit)
      .groupBy(char => char).map { case (char, occurrences) =>
        char -> occurrences.length
      }.toSet

  }

}
