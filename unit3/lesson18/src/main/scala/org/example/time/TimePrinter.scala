package org.example.time

import java.time.format.DateTimeFormatter
import java.time.{ZoneId, ZonedDateTime}

class TimePrinter(formatter: DateTimeFormatter) {

  def now(country: String): String = {
    val timezone = countryToTimezone(country)
    val dateTime = currentDateTime(timezone)
    dateTimeToString(dateTime)
  }

  private def countryToTimezone(country: String): String =
    country.toLowerCase match {
      case "italy" => "Europe/Rome"
      case "uk" => "Europe/London"
      case "germany" => "Europe/Berlin"
      case "japan" => "Asia/Tokyo"
      case _ =>
        val msg = s"Unknown timezone for country $country"
        throw new IllegalStateException(msg)
    }

  private def currentDateTime(timezone: String): ZonedDateTime = {
    val zoneId = ZoneId.of(timezone)
    ZonedDateTime.now(zoneId)
  }

  private def dateTimeToString(dateTime: ZonedDateTime): String =
    formatter.format(dateTime)
}
