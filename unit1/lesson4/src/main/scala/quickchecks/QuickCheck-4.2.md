Which of these type assignments are valid? Which of them are invalid? Use the REPL to validate your 
hypotheses. 
1.	val test: Double = 2.0
2.	val test: Int = 2.0
3.	val test: Any = 2.0 


ANSWER:

The first and third assignments are valid, while the second one is invalid. An explanation for each 
of them is following:
1.	Valid: an expression of type Double is compatible with Double
2.	Invalid: the compiler doesn’t know how to fit a statement of type Double into an Int. 
Note that the opposite (i.e., assigning an Int expression to a Double) is considered to be valid.
3.	Valid: Any is compatible with any type because it is at the root of Scala’s class hierarchy.
