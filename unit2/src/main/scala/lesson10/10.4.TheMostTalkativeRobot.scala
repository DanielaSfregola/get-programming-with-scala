package lesson10

import lesson10.`10.1.TheDictionaryObject`.Dictionary

object `10.4.TheMostTalkativeRobot` {

  abstract class Robot(name: String) {

    def welcome(n: String): String
  }

  object Robot {

    def mostTalkative(r1: Robot, r2: Robot): Robot = {
      val emptyName = ""
      val r1Size = r1.welcome(emptyName).length
      val r2Size = r2.welcome(emptyName).length
      if (r1Size >= r2Size) r1 else r2
    }
  }
}
