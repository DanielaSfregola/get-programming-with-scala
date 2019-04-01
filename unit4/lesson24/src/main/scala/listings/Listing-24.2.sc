case class Car(model: String,
               owner: Option[Person],
               registrationPlate: Option[String])

case class Person(name: String,
                  age: Int,
                  drivingLicense: Option[String])

def ownerDrivingLicense(optCar: Option[Car], ownerName: String): Option[String] =
  for {
    car <- optCar
    person <- car.owner
    if person.name == ownerName
    drivingLicense <- person.drivingLicense
  } yield drivingLicense
