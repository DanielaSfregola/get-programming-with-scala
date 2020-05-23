case class Student(id: Int, name: String, topics: Set[String])

def eitherTopics(topicA: Set[Student],
                 topicB: Set[Student]): Set[Student] =
  topicA.union(topicB)

def bothTopics(topicA: Set[Student],
               topicB: Set[Student]): Set[Student] =
  topicA.intersect(topicB)

def topicAnoTopicB(topicA: Set[Student],
                   topicB: Set[Student]): Set[Student] =
  topicA.diff(topicB)

def topicBnoTopicA(topicA: Set[Student],
                   topicB: Set[Student]): Set[Student] =
  topicB.diff(topicA)
