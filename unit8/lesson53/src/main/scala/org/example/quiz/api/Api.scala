package org.example.quiz.api

import org.example.quiz.service.Services

class Api(services: Services) {

  val category = new CategoryApi(services.category)
  val generic = new GenericApi(services.generic)
  val quiz = new QuizApi(services.quiz)

}
