List("Hello", "Scala").mkString
// val res0: String = HelloScala
// Using the default separator ""

List("Hello", "Scala").mkString(", ")
// val res1: String = Hello, Scala
// Using the separator ", "

List("Hello", "Scala").mkString("[", "-", "]")
// val res2: String = [Hello-Scala]
// Using the separator "-", "[" as prefix, and "]" as suffix

List().mkString("[", "-", "]")
// val res3: String = []
// Using the separator "-", "[" as prefix, and "]" as suffix
