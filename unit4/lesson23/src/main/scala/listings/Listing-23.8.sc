case class Car(model: String,
               owner: Option[Person],
               registrationPlate: Option[String])

case class Person(name: String,
                  age: Int,
                  drivingLicense: Option[String])

def ownerDrivingLicense(optCar: Option[Car]): Option[String] =
  optCar.flatMap { car =>
    car.owner.flatMap { person =>
      person.drivingLicense
    }
  }
