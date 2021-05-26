// Let’s consider your address book program again.
// Implement a function findByCompany to find a contact from a given company:
//  def findByCompany(addressBook: List[Contact], company: String): Option[Contact]
// Consider the company name case insensitive.

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

def findByCompany(addressBook: List[Contact],
                  company: String): Option[Contact] =
  addressBook.find { contact =>
    contact.company.exists(_.equalsIgnoreCase(company))
  }
