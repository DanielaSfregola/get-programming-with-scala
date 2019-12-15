case class Contact(name: String,
                   surname: String,
                   numbers: List[ContactNumber],
                   company: Option[String],
                   email: Option[String])

sealed trait Label
case object Work extends Label
case object Home extends Label

case class ContactNumber(number: String, label: Label)


def shortestFullName(addressBook: List[Contact]): Contact =
  addressBook.minBy { contact =>
    contact.name.length + contact.surname.length
  }

def lastContactByFullName(addressBook: List[Contact]): Contact =
  addressBook.maxBy { contact =>
    s"${contact.surname} ${contact.name}"
  }
