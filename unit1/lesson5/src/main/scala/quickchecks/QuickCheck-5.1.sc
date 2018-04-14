// Write a function that takes an integer and that prints a message in the console to inform if
// a number is even or odd. Hint: use the modulo operator %.


def evenOrOdd(n: Int) =
  if (n % 2 == 0) println(s"$n is even")
  else println(s"$n is odd")
