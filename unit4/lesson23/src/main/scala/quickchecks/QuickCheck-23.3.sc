// Write a function, called ownerBelowAge, which takes two parameters: an instance of Car and
// an age parameter of type Int. It returns an optional string containing the name of the car owner
// if younger that then the age parameter. Use the flatMap function on Option:


case class Car(model: String,
               owner: Option[Person],
               registrationPlate: Option[String])

case class Person(name: String,
                  age: Int,
                  drivingLicense: Option[String])

def ownerBelowAge(car: Car, age: Int): Option[String] =
  car.owner.flatMap { p =>
    if (p.age < age) Some(p.name)
    else None
  }

