case class Contact(name: String,
                   surname: String,
                   numbers: List[ContactNumber],
                   company: Option[String],
                   email: Option[String])

sealed trait Label
case object Work extends Label
case object Home extends Label

case class ContactNumber(number: String, label: Label)

def getNumbers(contacts: List[Contact]): List[ContactNumber] =
  contacts.map(contact => contact.numbers).flatten
