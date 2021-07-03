sealed trait Label
case object Work extends Label
case object Home extends Label

case class ContactNumber(number: String, label: Label)

case class Contact(name: String,
                   surname: String,
                   numbers: List[ContactNumber],
                   company: Option[String],
                   email: Option[String])

def perCompany(addressBook: List[Contact]): Map[Option[String], List[Contact]] =
  addressBook.groupBy(_.company)
