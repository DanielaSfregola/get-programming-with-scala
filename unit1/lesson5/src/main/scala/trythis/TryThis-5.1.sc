// Write a program to compute the discount for a given price as follows:
// -	0% discount if the price is less than $50
// -	10% discount if the price is at least $50 but less than $100
// -	15% discount if the price is at least $100

def applyDiscount(price: Double) = {
  val discount = {
    if (price < 50) 0
    else if (price < 100) 0.10
    else 0.15
  }

  price * (1 - discount)
}
