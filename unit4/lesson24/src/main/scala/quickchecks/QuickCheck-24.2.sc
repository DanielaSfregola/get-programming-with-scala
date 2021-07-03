// In the previous lesson, you have implemented a function ownerBelowAge that returns
// the car owner’s name if younger than a given age: re-implement it using for-comprehension.

// ANSWER

case class Person(name: String,
                  age: Int,
                  drivingLicense: Option[String])

case class Car(model: String,
               owner: Option[Person],
               registrationPlate: Option[String])

def ownerBelowAge(car: Car, age: Int): Option[String] =
  for {
    person <- car.owner
    if person.age < age
  } yield person.name
