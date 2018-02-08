package lesson11

// Listing 11.4
object SuitsOfPokerCards extends App {

  sealed trait Suit
  object Clubs extends Suit
  object Diamonds extends Suit
  object Hearts extends Suit
  object Spades extends Suit

}
