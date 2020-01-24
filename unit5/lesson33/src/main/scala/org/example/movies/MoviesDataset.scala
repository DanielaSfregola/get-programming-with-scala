package org.example.movies

import com.github.tototoshi.csv._
import org.slf4j.{Logger, LoggerFactory}
import org.example.movies.entities.Movie

import scala.io.Source

class MoviesDataset(moviesMetadataFile: String) {

  private val logger: Logger = LoggerFactory.getLogger(this.getClass)

  val movies: List[Movie] = {
    val rawData = loadCSVFile(moviesMetadataFile)
    rawData.flatMap { raw =>
      // skipping malformed rows that are malformed
      Movie.parse(raw)
    }
  }

  private def loadCSVFile(path: String): List[Map[String, String]] = {
    logger.info(s"Processing file $path...")
    val file = Source.fromResource(path)
    val reader = CSVReader.open(file)
    val data = reader.allWithHeaders()
    logger.info(s"Completed processing of file $path! ${data.size} records loaded")
    data
  }

}
