sealed trait Label
case object Work extends Label
case object Home extends Label

case class ContactNumber(number: String, label: Label)

case class Contact(name: String,
                   surname: String,
                   numbers: List[ContactNumber],
                   company: Option[String],
                   email: Option[String])

/*private*/ def reject(msg: String) = throw new IllegalStateException(msg)

/*private*/ def validateNonEmpty(contacts: List[Contact]): List[Contact] =
  if (contacts.isEmpty) reject("Address book cannot be empty!")
  else contacts

/*private*/ val maxCollSize = 1000
/*private*/ def validateWithinSize(contacts: List[Contact]): List[Contact] = {
  val size = contacts.size
  if (size > maxCollSize)
    reject(s"Address book collection too big! " +
    s"Found $size contacts, maximum allowed is $maxCollSize")
  else contacts
}

def validateAddressBook(contacts: List[Contact]): List[Contact] = {
  validateNonEmpty(contacts)
  validateWithinSize(contacts)
}

