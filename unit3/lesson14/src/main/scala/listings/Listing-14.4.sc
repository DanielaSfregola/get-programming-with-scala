sealed trait Currency

object USD extends Currency
object GBP extends Currency
object EUR extends Currency

def exchangeRateUSD(currency: Currency): Double =
  currency match {
    case USD => 1
    case GBP => 0.744
    case EUR => 0.848
  }
