case class Contact(name: String, surname: String, number: String)

val alice = Contact(name = "Alice",
                    surname = "Abbott",
                    number = "+123456789")

val bob = Contact(name = "Bob",
                  surname = "Brown",
                  number = "+987654321")

val contacts = List(alice, bob)

val charlie = Contact(name = "Charlie",
                  surname = "Clarke",
                  number = "+43 3544665 3434")


val moreContacts = contacts :+ charlie
