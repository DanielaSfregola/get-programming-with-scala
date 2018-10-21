// Let’s reconsider the same scenario you have seen at the end of lesson 23
// that describes a Student-Professor-Assistant relation:
// You can translate the above to code with the following case classes:

case class Student(id: Long, name: String, tutor: Option[Professor])
case class Professor(id: Long, name: String, assistant: Option[Assistant])
case class Assistant(id: Long, name: String)

// Re-implement these following function using for-comprehension and the other operations on Option you have seen in this lesson:


//  ANSWERS
// 1.	Retrieve the name of the tutor of a given student
def tutorName(student: Student): Option[String] =
  for {
    professor <- student.tutor
  } yield professor.name


// 2.	Find the id of the assistant of a professor tutoring a given student
def tutorAssistantId(student: Student): Option[Long] =
  for {
    professor <- student.tutor
    assistant <- professor.assistant
  } yield assistant.id

// 3.	Return a given student only if having a tutor with given id
def studentWithTutorId(student: Student, id: Long): Option[Student] = {
  if (student.tutor.exists(_.id == id)) Some(student)
  else None
}
