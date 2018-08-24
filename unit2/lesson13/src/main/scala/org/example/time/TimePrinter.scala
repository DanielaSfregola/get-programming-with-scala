package org.example.time

import java.time.format.DateTimeFormatter
import java.time.{ZoneId, ZonedDateTime}

class TimePrinter(formatter: DateTimeFormatter) {

  def now(timezone: String): String = {
    val dateTime = currentDateTime(timezone)
    dateTimeToString(dateTime)
  }

  private def currentDateTime(timezone: String): ZonedDateTime = {
    val zoneId = ZoneId.of(timezone)
    ZonedDateTime.now(zoneId)
  }

  private def dateTimeToString(dateTime: ZonedDateTime): String =
    formatter.format(dateTime)
}
