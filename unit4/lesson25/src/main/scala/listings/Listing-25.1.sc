def getStats(): WebsiteStats = ???

case class WebsiteStats(
  lastHour: Long,
  lastDay: Long,
  lastMonth: Long,
  lastYear: Long
  /* many more fields here!*/)

case class MyStats(lastDay: Long, lastMonth: Long)

def lastDayAndMonthStats(): MyStats = {
  val allStats = getStats()
  MyStats(allStats.lastDay, allStats.lastMonth)
}
