case class Car(model: String,
               owner: Option[Person],
               registrationPlate: Option[String])

case class Person(name: String,
                  age: Int,
                  drivingLicense: Option[String])

def ownerDrivingLicense(optCar: Option[Car]): Option[String] =
  for {
    car <- optCar
    person <- car.owner
    drivingLicense <- person.drivingLicense
  } yield drivingLicense
