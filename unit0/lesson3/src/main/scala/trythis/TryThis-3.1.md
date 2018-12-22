1.	Modify Main.scala in the hello-world-template project by removing the following instruction: extends App.
What is it going to happen? Validate your assumptions by running the modified code.

2.	Change your hello-world-template to print your name in the console: compile and run it using SBT.


ANSWER:

1. SBT no longer recognizes the object Main as executable, so it throws an exception when executing the command "sbt run". More on this, when we are going to discuss traits in lesson 12.

2. In Main.scala change the string from "Hello, World!". Compile and run it using the command "sbt run".
