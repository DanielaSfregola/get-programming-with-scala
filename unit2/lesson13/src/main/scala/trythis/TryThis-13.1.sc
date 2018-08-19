// At the end of lesson 5, I have asked you to write a function to apply the discount to a given price as follows:
// -	0% discount if the price is less than $50
// -	10% discount if the price is at least $50 but less than $100
// -	15% discount if the price is at least $100
// Re-implement it using pattern matching instead of an if…else statement.


def applyDiscount(price: Double) = {
  val discount = price match {
    case p if p >= 100 => 0.15
    case p if p >= 50 => 0.10
    case _ => 0
  }

  price * (1 - discount)
}
