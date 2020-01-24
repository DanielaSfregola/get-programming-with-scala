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
                 revenue: Int,
                 budget: Int,
                 duration: Option[Double],
                 voteAverage: Float,
                 voteCount: Float)

object Movie {
  import Parsers._

  private val logger = LoggerFactory.getLogger(this.getClass)

  def parse(row: Map[String, String]): Option[Movie] = {
    // header from the CSV file:
    // adult,belongs_to_collection,budget,genres,homepage,id,imdb_id,original_language,original_title,overview,popularity,poster_path,production_companies,production_countries,release_date,revenue,runtime,spoken_languages,status,tagline,title,video,vote_average,vote_count

    val movie = for {
      /* MANDATORY FIELDS */
      genres <- parseGenres(row, "genres")
      id <- parseInt(row, "id")
      imdbId <- parseString(row, "imdb_id")
      originalLanguage <- parseString(row, "original_language")
      originalTitle <- parseString(row, "original_title")
      overview <- parseString(row, "overview")
      budget <- parseInt(row, "budget")
    } yield {

      /* NULLABLE FIELDS */
      val popularity = parseFloat(row, "popularity")
      val releaseDate = parseLocalDate(row, "release_date")
      val runtimeInMinutes = parseDouble(row, "runtime")

      /* NULLABLE FIELDS WITH DEFAULTS */
      val revenue = parseInt(row, "revenue").getOrElse[Int](0)
      val title = parseString(row, "title").getOrElse(originalTitle)
      val voteAverage = parseFloat(row, "vote_average").getOrElse[Float](0)
      val voteCount = parseFloat(row, "vote_count").getOrElse[Float](0)

      Movie(genres,
            id,
            imdbId,
            originalLanguage,
            originalTitle,
            title,
            overview,
            popularity,
            releaseDate,
            revenue,
            budget,
            runtimeInMinutes,
            voteAverage,
            voteCount)
    }

    if (movie.isEmpty) logger.warn(s"Skipping malformed movie row")
    movie
  }
}
