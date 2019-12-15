case class Contact(name: String,
                   surname: String,
                   numbers: List[ContactNumber],
                   company: Option[String],
                   email: Option[String])

sealed trait Label
case object Work extends Label
case object Home extends Label

case class ContactNumber(number: String, label: Label)


def getByPosition(addressBook: List[Contact], n: Int): Contact =
  addressBook.apply(n)
//  ...or alternatively...
// addressBook(n)
