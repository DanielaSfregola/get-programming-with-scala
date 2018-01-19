package lesson1

import `1.1.MyClassExample`.MyClass

object `1.2.MyObjectExample` {

  object MyObject {
    val a = new MyClass
    println(a.sayHello("Scala"))
  }

}
