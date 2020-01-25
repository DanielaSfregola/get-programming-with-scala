# Get Programming with Scala
Code, exercises, and answers for the book [Get Programming with Scala](https://www.manning.com/books/get-programming-with-scala?a_aid=daniela&a_bid=7cd2421c).

Lessons are grouped per unit. Each lesson is a standalone SBT project and
it has the following three packages: `listings`, `quickchecks`, `trythis`.

Have a look at the [Table of Contents](#table-of-contents) for links to all the available lessons.

## Installation Requirements
Make sure the following tools are installed:
 - JDK 8+
 - SBT

## Running the Code

### Code Snippets (Scala Worksheets)
Some lessons are simple snippets (files with extension \*.sc) also called Scala Worksheets.
They can be interpreted interactively from the REPL by IDEs with dedicated Scala support,
such as IntelliJ IDEA and ScalaIDE.

If you a using a text editor or your IDE doesn't support Scala Worksheets,
start the REPL from SBT:
```
sbt console
```

and evaluate the file as follows:
```
> :load /path/to/file.sc
```

### Executable SBT Programs
Some lessons are fully fleshed-out programs (files with extension \*.scala):
in order to run them, they need to be compiled.
First, navigate to the folder of the lesson you are interested in.

Suppose you want to review the code for lesson 8:
```
cd unit1/lesson8
```

Start SBT:
```
sbt
```

Compile and run the code:
```
> run
```

If a lecture isn't an executable program, please see section on running Scala Worksheets.

## Table of Contents
- **UNIT 0: HELLO SCALA!**
    - [LESSON 1](unit0/lesson1): Why Scala?
    - [LESSON 2](unit0/lesson2): Scala – The REPL
    - [LESSON 3](unit0/lesson3): SBT – Scala Build Tool

- **UNIT 1:  THE BASICS**
    - [LESSON 4](unit1/lesson4): Values and Variables
    - [LESSON 5](unit1/lesson5): Conditional Statements and Loops
    - [LESSON 6](unit1/lesson6): Function as the most fundamental block of code
    - [LESSON 7](unit1/lesson7): Classes as a representation of our world
    - [LESSON 8](unit1/lesson8): CAPSTONE 1

- **UNIT 2: OBJECT-ORIENTED FUNDAMENTALS**
    - [LESSON 9](unit2/lesson9): Import and Create Packages
    - [LESSON 10](unit2/lesson10): Scope your code with Access Modifiers
    - [LESSON 11](unit2/lesson11): Singleton Objects
    - [LESSON 12](unit2/lesson12): Traits as interfaces
    - [LESSON 13](unit2/lesson13): CAPSTONE 2

- **UNIT 3: HTTP SERVICE**
    - [LESSON 14](unit3/lesson14): Pattern Matching
    - [LESSON 15](unit3/lesson15): Anonymous Functions
    - [LESSON 16](unit3/lesson16): Partial Functions
    - [LESSON 17](unit3/lesson17): HTTP API with http4s
    - [LESSON 18](unit3/lesson18): CAPSTONE 3

- **UNIT 4: IMMUTABLE DATA AND STRUCTURES**
    - [LESSON 19](unit4/lesson19): Case classes to structure our data			
    - [LESSON 20](unit4/lesson20): High Order Functions
    - [LESSON 21](unit4/lesson21): What is Purity?								
    - [LESSON 22](unit4/lesson22): Option		
    - [LESSON 23](unit4/lesson23): Working with Option: map and flatMap
    - [LESSON 24](unit4/lesson24): Working with Option: for-comprehension
    - [LESSON 25](unit4/lesson25): Tuple and Unapply
    - [LESSON 26](unit4/lesson26): CAPSTONE 4						

- **UNIT 5: LIST**
    - [LESSON 27](unit5/lesson27): List							
    - [LESSON 28](unit5/lesson28): Working with List: map and flatMap
    - [LESSON 29](unit5/lesson29): Working with List: properties
    - [LESSON 30](unit5/lesson30): Working with List: element selection
    - [LESSON 31](unit5/lesson31): Working with List: filtering
    - [LESSON 32](unit5/lesson32): Working with List: sorting and other operations
    - [LESSON 33](unit5/lesson33): CAPSTONE 5			

- **UNIT 6: ERROR HANDLING AND DATA STORAGE**
    - LESSON 34: Set							
    - LESSON 35: Map
    - LESSON 36: Either
    - LESSON 37: Try: an operation that can fail
    - LESSON 38: Working with Try
    - LESSON 39: Database queries with quill
    - LESSON 40: CAPSTONE 6

- **UNIT 7: CONCURRENCY**
    - LESSON 41: Future					
    - LESSON 42: Working with Future: map and flatMap				
    - LESSON 43: Working with Future: for-comprehension				
    - LESSON 44: Future and Promise
    - LESSON 45: CAPSTONE 7

- **UNIT 8: JSON (DE)SERIALIZATION**
    - LESSON 46: Traits as composable block of codes	     										
    - LESSON 47: Lazy values
    - LESSON 48: By Name Parameters
    - LESSON 49: Implicit functions and values				
    - LESSON 50: The IO type						
    - LESSON 51: JSON (De)serialization with circe				
    - LESSON 52: CAPSTONE 8
