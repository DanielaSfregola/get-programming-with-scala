case class Person(name: String,
                  age: Int,
                  drivingLicense: Option[String])

case class Car(model: String,
               owner: Option[Person],
               registrationPlate: Option[String])

def ownerDrivingLicense(optCar: Option[Car]): Option[String] =
  for {
    car <- optCar
    person <- car.owner
    drivingLicense <- person.drivingLicense
  } yield drivingLicense
