package org.example.quiz.dao.records

case class Question(id: Long = 0,
                    text: String,
                    categoryId: Long)
