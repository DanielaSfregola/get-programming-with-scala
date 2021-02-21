case class Contact(name: String,
                   surname: String,
                   numbers: List[ContactNumber],
                   company: Option[String],
                   email: Option[String])

sealed trait Label
case object Work extends Label
case object Home extends Label

case class ContactNumber(number: String, label: Label)

def selectByEmails(contacts: List[Contact],
                   emails: List[String]): List[Contact] =
  contacts.flatMap { contact =>
    emails.flatMap { email =>
      if (contact.email.exists(_.equalsIgnoreCase(email)))
        List(contact)
      else List()
    }
  }
