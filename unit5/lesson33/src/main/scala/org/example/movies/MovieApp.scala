package org.example.movies

import PrintResultHelpers._

object MovieApp extends App {

  val dataset = new MoviesDataset("movies_metadata.csv")
  val movies = dataset.movies
  
  private val unknown = "--"

  // 1.	How many movies are there in the dataset?
  printResult(
    question = "How many movies are there in the dataset?",
    answer = {
      val totCount = movies.size
      s"$totCount movies"
    }
  )

  // 2.	How many movies were released in 1987?
  printResult(
    question = "How many movies were released in 1987?",
    answer = {
      val countFrom1987 = movies.count(
        _.releaseDate.exists(_.getYear == 1987))
      s"$countFrom1987 movies"
    }
  )

  // 3.	Find the top five movies per vote average and count with at least 50 votes
  printResult(
    question = "TOP 5 movies per vote average and count",
    answers = {
      val topPerVote =
        movies.filter(_.voteCount >= 50)
              .sortBy { movie =>
                (- movie.voteAverage, - movie.voteCount)
              }.take(5)
      topPerVote.map { movie =>
        s"[AVG: ${movie.voteAverage}, COUNT: ${movie.voteCount}] " +
        s"${movie.title}"
      }
    }
  )

  // 4.	Find the top five movies per popularity
  printResult(
    question = "TOP 5 movies per popularity",
    answers = {
      val topPerPopularity =
        movies.sortBy { movie =>
          -movie.popularity.getOrElse(0f)
        }.take(5)
      topPerPopularity.map { movie =>
        s"[POPULARITY: ${movie.popularity.getOrElse(unknown)}] " +
        s"${movie.title}"
      }
    }
  )

  // 5.	Select five non-English films
  printResult(
    question = "5 non-english movies",
    answers = {
      val topNonEnglishPerPopularity =
        movies.filterNot(_.originalLanguage == "en")
              .take(5)
      topNonEnglishPerPopularity.map { movie =>
        s"[LANG: ${movie.originalLanguage}, " +
        s"RELEASE DATE: ${movie.releaseDate.getOrElse(unknown)}] " +
        s"${movie.title} (${movie.originalTitle})"
      }
    }
  )

  // 6.	Which film made the most profit?
  printResult(
    question = "Which movie made the most profit?",
    answer = {
      val mostProfit = movies.maxBy(
        movie => movie.revenue - movie.budget)
      val formattedProfit = {
        val formatter = java.text.NumberFormat.getInstance()
        formatter.format(mostProfit.revenue - mostProfit.budget)
      }
      s"[PROFIT: USD $formattedProfit] ${mostProfit.title}"
    }
  )

}
