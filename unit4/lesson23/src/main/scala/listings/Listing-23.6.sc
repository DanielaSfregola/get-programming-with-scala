case class Person(name: String,
                  age: Int,
                  drivingLicense: Option[String])

case class Car(model: String,
               owner: Option[Person],
               registrationPlate: Option[String])

//def ownerDrivingLicense(car: Car): Option[String] =
//  car.owner.map(_.drivingLicense).flatten

def ownerDrivingLicense(car: Car): Option[String] =
  car.owner.flatMap(_.drivingLicense)
