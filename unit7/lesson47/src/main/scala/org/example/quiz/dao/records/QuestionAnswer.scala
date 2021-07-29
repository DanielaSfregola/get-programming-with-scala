package org.example.quiz.dao.records

case class Question(id: Long = 0,
                    text: String,
                    categoryId: Long)

case class Answer(id: Long = 0,
                  questionId: Long = 0,
                  text: String,
                  isCorrect: Boolean = false)
