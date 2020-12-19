// Suppose your program needs to perform monetary calculations.
// Your money representation looks like the following:

import java.util.Currency
case class Money(amount: Double, currency: Currency)

// Define an instance of Numeric[Money] so that Scala can recognize it as
// a numeric value and perform calculations on them, such as summing two Money instances.
// Ensure to forbid operations between monetary amounts that have different currencies.


// ANSWER

import scala.util.Try

object Money {

  // In Scala 2: implicit val numeric = new Numeric[Money] { ... }
  given numeric: Numeric[Money] with {

    private val defaultCurrency = Currency.getInstance("USD")

    override def plus(x: Money, y: Money): Money = {
      sameCurrencyOp(x, y)
      x.copy(amount = x.amount + y.amount)
    }

    override def minus(x: Money, y: Money): Money = {
      sameCurrencyOp(x, y)
      x.copy(amount = x.amount - y.amount)
    }

    override def times(x: Money, y: Money): Money = {
      sameCurrencyOp(x, y)
      x.copy(amount = x.amount * y.amount)
    }

    override def negate(x: Money): Money =
      x.copy(amount = - x.amount)

    override def fromInt(x: Int): Money = Money(x, defaultCurrency)

    override def toInt(x: Money): Int = x.amount.toInt

    override def toLong(x: Money): Long = x.amount.toLong

    override def toFloat(x: Money): Float = x.amount.toFloat

    override def toDouble(x: Money): Double = x.amount

    override def compare(x: Money, y: Money): Int = {
      sameCurrencyOp(x, y)
      x.amount.compare(y.amount)
    }

    private def sameCurrencyOp(x: Money, y: Money) =
      require(x.currency == y.currency, "Monetary amounts needs to have the same currency")

    override def parseString(text: String): Option[Money] = {
      text.split("\\s+").toList match {
        case amountText :: currencyCode :: _ =>
          val parsedMoney = for {
            amount <- Try(amountText.toDouble)
            currency <- Try(Currency.getInstance(currencyCode))
          } yield Money(amount, currency)
          parsedMoney.toOption
        case _ => None  
      }
    }
  }
}

object MyApp {
  val GBP = Currency.getInstance("GBP")
  val USD = Currency.getInstance("USD")
  val EUR = Currency.getInstance("EUR")

  List(Money(1, USD), Money(10, USD)).sum

  // The import enables
  // a more compact syntax you can use with numeric types
  import Money.numeric._

  Money(1, GBP) + Money(10, GBP)
  Money(100, USD) - Money(42, EUR)

}
