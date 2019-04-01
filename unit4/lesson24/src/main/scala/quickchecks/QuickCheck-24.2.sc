// In QuickCheck 23.3 you have implemented a function ownerBelowAge that returns
// the name of a car owner if younger than a given age: re-implement it using for-comprehension.

case class Car(model: String,
               owner: Option[Person],
               registrationPlate: Option[String])

case class Person(name: String,
                  age: Int,
                  drivingLicense: Option[String])

def ownerBelowAge(car: Car, age: Int): Option[String] =
  for {
    person <- car.owner
    if person.age < age
  } yield person.name
