// Consider the case class Car shown in listing 23.1. Write a function
// called extractRegistrationPlate that takes an instance of Car and returns an optional
// registration plate with its text all upper case. Use the function map on Option.


// ANSWER

case class Car(model: String,
               owner: Option[Person],
               registrationPlate: Option[String])

case class Person(name: String,
                  age: Int,
                  drivingLicense: Option[String])

def extractRegistrationPlate(car: Car): Option[String] =
  car.registrationPlate.map(_.toUpperCase)
