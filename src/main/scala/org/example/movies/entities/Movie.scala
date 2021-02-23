package org.example.movies.entities

import java.time.LocalDate
import org.slf4j.LoggerFactory

case class Genre(id: Int, name: String)

case class Movie(genres: List[Genre],
                 id: Int,
                 imdbId: String,
                 originalLanguage: String,
                 originalTitle: String,
                 title: String,
                 overview: String,
                 popularity: Option[Float],
                 releaseDate: Option[LocalDate],
                 revenue: BigInt,
                 budget: BigInt,
                 duration: Option[Double],
                 voteAverage: Float,
                 voteCount: Float)

object Movie {
  import Parsers._

  private val logger = LoggerFactory.getLogger(this.getClass)

  def parse(row: Map[String, String]): Option[Movie] = ???
}
