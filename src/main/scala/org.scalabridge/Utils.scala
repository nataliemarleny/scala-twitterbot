package org.scalabridge

object Utils {
  def addThenDoubleIt(x: Int, y: Int): Int = {
    (x + y) * 2
  }

  def stringToInt(input: String): Option[Int] = {
    try {
      Some(input.toInt)
    } catch {
      case _: NumberFormatException => None
    }
  }
}
