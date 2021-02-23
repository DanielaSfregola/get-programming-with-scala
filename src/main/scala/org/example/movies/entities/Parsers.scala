package org.example.movies.entities

import java.time.LocalDate

import io.circe.Decoder
import io.circe.parser.decode
import io.circe.generic.auto._
import scala.util.Try

object Parsers {

  def parseInt(row: Map[String, String], key: String): Option[Int] =
    parseAs(row, key, _.toInt)

  def parseBigInt(row: Map[String, String], key: String): Option[BigInt] =
    parseAs(row, key, BigInt.apply)

  def parseDouble(row: Map[String, String], key: String): Option[Double] =
    parseAs(row, key, _.toDouble)

  def parseString(row: Map[String, String], key: String): Option[String] =
    parseAs(row, key, identity)

  def parseFloat(row: Map[String, String], key: String): Option[Float] =
    parseAs(row, key, _.toFloat)

  def parseLocalDate(row: Map[String, String], key: String): Option[LocalDate] =
    parseAs(row, key, LocalDate.parse)

  def parseGenres(row: Map[String, String], key: String): Option[List[Genre]] =
    parseJsonAs[List[Genre]](row, key)

  private def parseJsonAs[T: Decoder](row: Map[String, String], key: String): Option[T] =
    for {
      rawJson <- parseString(row, key)
      // for some reason the CSV is using ' rather than " for JSON,
      // so we need to clean the data before decoding
      cleanJson = rawJson.replace("'", "\"")
      // rather than returning an error for invalid JSON, we return no value
      decodedValue <- decode[T](cleanJson).toOption
    } yield decodedValue

  private def parseAs[T](row: Map[String, String], key: String, f: String => T): Option[T] =
    row.get(key).flatMap { value =>
      // if we cannot parse a value, we return no value
      Try(f(value)).toOption
    }
}
