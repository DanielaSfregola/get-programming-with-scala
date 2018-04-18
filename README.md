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

- **UNIT 2: HTTP SERVICE**
<<<<<<< HEAD
    - LESSON 9: Imports and packages
    - LESSON 10: Access Modifiers
    - LESSON 11: Singleton Objects
    - LESSON 12: Traits as interfaces
=======
    - [LESSON 9](unit2/lesson9): Imports and packages
    - [LESSON 10](unit2/lesson10): Access Modifiers
    - LESSON 11: Traits as interfaces
    - LESSON 12: Objects are important too!
>>>>>>> [unit 2] Refactored code lesson 10
    - LESSON 13: Pattern Matching
    - LESSON 14: Anonymous Functions
    - LESSON 15: Partial Functions
    - LESSON 16: HTTP API with http4s
    - LESSON 17: CAPSTONE 2

- **UNIT 3: DATA REPRESENTATION**
    - LESSON 18: Traits as composable block of codes
    - LESSON 19: Lazy values
    - LESSON 20: Infix and Postfix Notation
    - LESSON 21: Case classes to structure our data
    - LESSON 22: Groups of Function Parameters
    - LESSON 23: Implicit functions and values
    - LESSON 24: JSON (De)serialization with circe
    - LESSON 25: CAPSTONE 3

- **UNIT 4: DATA MANIPULATION**
    - LESSON 26: Impure and Pure Functions
    - LESSON 27: The importance of Purity
    - LESSON 28: High Order Functions
    - LESSON 29: List
    - LESSON 30: Map
    - LESSON 31: Option
    - LESSON 32: Working with Option
    - LESSON 33: CAPSTONE 4

- **UNIT 5: ERROR HANDLING AND DATA STORAGE**
    - LESSON 34: Either
    - LESSON 35: Tuple
    - LESSON 36: Try: an operation that can fail
    - LESSON 37: Working with Try
    - LESSON 38: Database queries with quill
    - LESSON 39: CAPSTONE 5

- **UNIT 6: CONCURRENCY**
    - LESSON 40: Concurrency is hard!
    - LESSON 41: Future
    - LESSON 42: Working with Future
    - LESSON 43: Applicative with cats
    - LESSON 44: CAPSTONE 6

- **UNIT 7: DSL PROGRAMS**
    - LESSON 45: Pimp your library
    - LESSON 46: Generics: hide details that do not matter
    - LESSON 47: Bound your types
    - LESSON 48: Type Classes
    - LESSON 49: Working with Type Classes
    - LESSON 50: Useful type classes with cats
    - LESSON 51: CAPSTONE 7
