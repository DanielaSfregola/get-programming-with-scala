package org.example.quiz.dao.entities

case class Answer(id: Long = 0,
                  questionId: Long = 0,
                  text: String,
                  isCorrect: Boolean = false)
