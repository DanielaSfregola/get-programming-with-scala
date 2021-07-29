// Write a function called ownerBelowAge that takes two parameters: an instance of Car and
// an age parameter of type Int. It returns an optional string containing the car owner’s name
// if younger than the given age. Use the flatMap function on Option.


// ANSWER

case class Person(name: String,
                  age: Int,
                  drivingLicense: Option[String])

case class Car(model: String,
               owner: Option[Person],
               registrationPlate: Option[String])

def ownerBelowAge(car: Car, age: Int): Option[String] =
  car.owner.flatMap { p =>
    if (p.age < age) Some(p.name)
    else None
  }

