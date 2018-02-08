package lesson1

import MyClassExample.MyClass

// Listing 1.2
object MyObjectExample extends App {

  object MyObject {
    val a = new MyClass
    println(a.sayHello("Scala"))
  }

}
