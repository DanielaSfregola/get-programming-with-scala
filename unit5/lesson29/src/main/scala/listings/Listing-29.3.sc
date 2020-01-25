case class Contact(name: String,
                   surname: String,
                   numbers: List[ContactNumber],
                   company: Option[String],
                   email: Option[String])

sealed trait Label
case object Work extends Label
case object Home extends Label

case class ContactNumber(number: String, label: Label)


def isPresent(addressBook: List[Contact], contact: Contact): Boolean =
  addressBook.contains(contact)

def isPresentByName(addressBook: List[Contact], name: String): Boolean =
  addressBook.exists(_.name == name)

def countByCompany(addressBook: List[Contact], company: String): Int =
  addressBook.count(_.company.contains(company))

