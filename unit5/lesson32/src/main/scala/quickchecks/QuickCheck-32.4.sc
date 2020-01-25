// Implement a function perLetter to group your address book contacts according to the first letter of their surname:

// def perLetter(addressBook: List[Contact]): Map[Char, List[Contact]]

// You should add those contacts with an empty surname to a category identified by the empty char ' '.

case class Contact(name: String,
                   surname: String,
                   numbers: List[ContactNumber],
                   company: Option[String],
                   email: Option[String])

sealed trait Label
case object Work extends Label
case object Home extends Label

case class ContactNumber(number: String, label: Label)


// ANSWER

// You can implement the function perLetter as the following:

def perLetter(addressBook: List[Contact]): Map[Char, List[Contact]] =
  addressBook.groupBy(_.surname.headOption.getOrElse(' '))
