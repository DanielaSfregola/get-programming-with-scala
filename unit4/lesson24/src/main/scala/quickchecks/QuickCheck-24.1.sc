// Consider the following snippet of code:

def f(n: Int): Option[Int] =
  if (n < 5) Some(n * 2)
  else None

def foo(optA: Option[Int]) =
  for {
    a <- optA
    b <- f(a)
    c <- Some(5 * b)
  } yield c

// What is the value returned by each of the following function calls?
// Verify your hypothesis using the Scala REPL.


//  ANSWERS

foo(Some(1))
// 1.	The expression foo(Some(1)) evaluates to Some(10): all the optional values are present,
//  so the chain of operations is completed, and its value returned.

foo(Some(5))
// 2.	The function call foo(Some(5)) returns None: op(5) returns None, causing the chain to break.

foo(None)
// 3.	foo(None) returns None because the first value of the for-comprehension expression is None.

