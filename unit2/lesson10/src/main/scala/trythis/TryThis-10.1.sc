// Define three values inside a class Employee: name of type String, an age of Int, and a salary of type Double.
// While its name should be public, its age should be accessible from its subclasses and its salary private.

class Employee {
  val name: String = "Daniela"
  protected val age = 18
  private val salary: Double = 12.34
}
