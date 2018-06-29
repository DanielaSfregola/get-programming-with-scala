def addOne(f: Int => Int): Int => Int =
  f andThen (_ + 1)

def divideByTwo(n: Int): Int = n / 2

def divideByTwoAndAddOne = addOne(divideByTwo)
