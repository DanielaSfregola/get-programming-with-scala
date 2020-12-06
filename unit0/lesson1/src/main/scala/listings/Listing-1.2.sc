class MyClass(name: String) {
  def sayHello(otherName: String) =
    s"Hi $otherName, my name is $name!"
}

object MyObject {
  val a = new MyClass("Scala")
  println(a.sayHello("Martin"))
}
