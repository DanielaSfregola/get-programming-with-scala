package org.example.time

import java.time.format.DateTimeFormatter
import scala.io.StdIn

object TimeApp extends App {

    val timezone = StdIn.readLine("Give me a timezone:  ")
    val timePrinter = new TimePrinter(DateTimeFormatter.RFC_1123_DATE_TIME)
    println(timePrinter.now(timezone))
}
