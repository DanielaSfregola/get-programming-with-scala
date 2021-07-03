case class WebsiteStats(
  lastHour: Long,
  lastDay: Long,
  lastMonth: Long,
  lastYear: Long
  /* many more fields here!*/)

def getStats(): WebsiteStats = ???

def lastDayAndMonthStats(): (Long, Long) = {
  val allStats = getStats()
  (allStats.lastDay, allStats.lastMonth)
}
