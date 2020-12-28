// Define a trait, called Currency, with only three possible implementations: USD, CAD, and EUR.

// ANSWER

sealed trait Currency

object USD extends Currency
object CAD extends Currency
object EUR extends Currency
