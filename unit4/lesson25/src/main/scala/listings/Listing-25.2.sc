def getStats(): WebsiteStats = ???

case class WebsiteStats(
  lastHour: Long,
  lastDay: Long,
  lastMonth: Long,
  lastYear: Long
  /* many more fields here!*/)

def lastDayAndMonthStats(): (Long, Long) = {
  val allStats = getStats()
  (allStats.lastDay, allStats.lastMonth)
}
