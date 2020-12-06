// Implement a function called carWithLicensedOwner that takes and returns
// an optional car instance if its owner has a driving license.

// ANSWER

case class Car(model: String,
               owner: Option[Person],
               registrationPlate: Option[String])

case class Person(name: String,
                  age: Int,
                  drivingLicense: Option[String])

def carWithLicensedOwner(optCar: Option[Car]): Option[Car] =
  optCar.find { car =>
    car.owner.flatMap(_.drivingLicense).isDefined
  }

