case class Person(name: String, age: Int)


val personA = new Person("Tom", 25)

personA.name
personA.age


val personB: Person = personA.copy(age = 35)
personA.age
personB.age

val mark = personA.copy(name = "Mark", age = personA.age + 1)
mark.name
mark.age
