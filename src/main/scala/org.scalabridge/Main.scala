package org.scalabridge
import Utils.addThenDoubleIt

object Main {

  def main(args: Array[String]): Unit = {
    println("Hello world!")
    println(s"Adding 2 and 4 then doubling it equals ${addThenDoubleIt(2, 4)}")
  }

}
