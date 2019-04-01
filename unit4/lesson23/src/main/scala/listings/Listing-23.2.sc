case class Car(model: String,
               owner: Option[Person],
               registrationPlate: Option[String])

case class Person(name: String,
                  age: Int,
                  drivingLicense: Option[String])

//def ownerName(car: Car): Option[String] =
//  car.owner match {
//    case Some(p) => Some(p.name)
//    case None => None
//  }

def ownerName(car: Car): Option[String] =
  car.owner.map(p => p.name)
