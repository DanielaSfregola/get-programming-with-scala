// Write a function, called evenOrOdd, that takes an integer and
// that prints a message in the console to inform if a number is even or odd.
// Hint: use the modulo operator % for the remainder of a division (e.g., 5 % 2 returns 1).


def evenOrOdd(n: Int) =
  if (n % 2 == 0) println(s"$n is even")
  else println(s"$n is odd")
