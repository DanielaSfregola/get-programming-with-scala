Which of the following functions do not compile? Why?
1.	def myFunc(x) = x + 1
2.	def myFunc(x: Int) = x + 1
3.	def myFunc(x: Int = true): Int
4.	def myFunc(x: Int)
5.	def myFunc(x: Int): Int = x == 1
6.	def myFunc(x: Int) = x == 1

ANSWER:

The answers are the following:
1.	It doesn’t compile: the parameter x must have a type.
2.	It compiles.
3.	It doesn’t compile: true is a value of type Boolean. The compiler doesn’t know how to fit a value of type Boolean into an Int, so you cannot use it as a default for x.
4.	It doesn’t compile: an abstract function must have a return type.
5.	It doesn’t compile: its return type is Int, but the expression x == 1 returns a value of type Boolean.
6.	It compiles.
