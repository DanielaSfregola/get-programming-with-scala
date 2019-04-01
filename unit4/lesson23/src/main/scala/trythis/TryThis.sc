// Consider the following scenario:
// -	A student has an id and a name.
// -	A student may have a professor assigned as a tutor.
// -	A professor has an id and a name.
// -	A professor may have the help of an assistant.
// -	An assistant has an id and a name.
// You can translate the above to code with the following case classes:

case class Student(id: Long, name: String, tutor: Option[Professor])
case class Professor(id: Long, name: String, assistant: Option[Assistant])
case class Assistant(id: Long, name: String)

// Write functions to extract the following information:


//  ANSWERS
// 1.	Retrieve the name of the tutor of a given student
def tutorName(student: Student): Option[String] =
  student.tutor.map(_.name)


// 2.	Find the id of the assistant of a professor tutoring a given student
def tutorAssistantId(student: Student): Option[Long] =
  student.tutor.flatMap { professor =>
    professor.assistant.map(_.id)
  }

// 3.	Return a given student only if having a tutor with given id
def studentWithTutorId(student: Student, id: Long): Option[Student] =
  student.tutor.flatMap { professor =>
    if (professor.id == id) Some(student)
    else None
  }
