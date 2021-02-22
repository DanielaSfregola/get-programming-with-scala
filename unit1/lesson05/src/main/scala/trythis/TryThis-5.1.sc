// Write a program to compute the discount for a given price as follows:
// -	0% discount if the price is less than $50
// -	10% discount if the price is at least $50 but less than $100
// -	15% discount if the price is at least $100


// ANSWER

def applyDiscount(price: Double) = {
  val discount = {
    if (price >= 100) 0.15
    else if (price >= 50) 0.10
    else 0
  }

  price * (1 - discount)
}

for (p <- List(10, 60, 110)) println(applyDiscount(p))
