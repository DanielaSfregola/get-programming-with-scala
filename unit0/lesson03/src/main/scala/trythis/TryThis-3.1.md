1.	Modify Main.scala in the hello-world-template project by removing the following instruction: 
      extends App. What is it going to happen? Validate your assumptions by running the modified code. 
      HINT: You can use your IDE’s ”jump to source” functionality to peek at the source code for App.

2.	Change your hello-world-template to print your name in the console: compile and run it using sbt.


ANSWERS:

1. sbt no longer recognizes the object Main as executable, so it throws an exception when executing the command "sbt run". 
   If you jump to the source code of App, you can see that it defines a main method. 
   You'll learn more about this when you'll discover traits.

2. In Main.scala change the string "Hello, World!". Compile and run it using the command "sbt run".
