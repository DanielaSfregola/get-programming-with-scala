class MyClass {
  def sayHello(name: String) = s"Hi $name!"
}

object MyObject {
  val a = new MyClass
  println(a.sayHello("Scala"))
}

MyObject
