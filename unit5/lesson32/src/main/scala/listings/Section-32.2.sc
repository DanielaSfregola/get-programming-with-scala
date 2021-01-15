List("Hello", "Scala").mkString
// res0: String = HelloScala
// Using the default separator ""

List("Hello", "Scala").mkString(", ")
// res1: String = Hello, Scala
// Using the separator ", "

List("Hello", "Scala").mkString("[", "-", "]")
// res2: String = [Hello-Scala]
// Using the separator "-", "[" as prefix, and "]" as suffix

List().mkString("[", "-", "]")
// res3: String = []
// Using the separator "-", "[" as prefix, and "]" as suffix
