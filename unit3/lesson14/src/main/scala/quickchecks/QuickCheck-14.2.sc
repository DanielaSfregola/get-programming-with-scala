// You have now four possible implementations for the sealed trait Currency.
// Fix the function exchangeRateUSD so that you no longer see the match-not-exhaustive warning
// when compiling your code.

sealed trait Currency
object USD extends Currency
object GBP extends Currency
object EUR extends Currency
object CAD extends Currency


// ANSWER
// The warning disappears as soon as the function exchangeRateUSD has a case for Canadian Dollars.
// For example, you could change it as follows:

def exchangeRateUSD(currency: Currency): Double =
  currency match {
    case USD => 1
    case GBP => 0.744
    case EUR => 0.848
    case CAD => 1.278
  }
