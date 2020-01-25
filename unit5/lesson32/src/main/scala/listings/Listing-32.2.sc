case class Contact(name: String,
                   surname: String,
                   numbers: List[ContactNumber],
                   company: Option[String],
                   email: Option[String])

sealed trait Label
case object Work extends Label
case object Home extends Label

case class ContactNumber(number: String, label: Label)


def sort(addressBook: List[Contact]): List[Contact] =
  addressBook.sortBy { contact =>
    (contact.surname, contact.name)
  }
