When running your program with SBT, what happens if it cannot find a main entry point?
What if it finds more than one? Verify your hypothesis by writing two simple programs and
executing them with SBT: one with no main, the other with two.


ANSWER:
When SBT doesn’t find any entry point, it will throw a RuntimeException with the message “No main class detected”.
If it detects more than one, it provides a list of the available entry points so that
you can choose the one to execute:

Multiple main classes detected, select one to run:

 [1] AnotherHelloWorld
 [2] HelloWorld

Enter number: [pick your entry point here]
