case class Contact(name: String, surname: String, number: String)

val martin = Contact(name = "Martin",
                     surname = "Odersky",
                     number = "+123456789")

val daniela = Contact(name = "My Number",
                      surname = "Sfregola",
                      number = "+987654321")

val contacts = List(martin, daniela)

val jon = Contact(name = "Jon",
                  surname = "Pretty",
                  number = "+43 3544665 3434")


val moreContacts = contacts :+ jon
