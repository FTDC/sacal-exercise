package chapter03

import scala.util.control.Breaks._

object breakerable {

  def main(args: Array[String]): Unit = {
    var num: Int = 10;

    breakable {
      do {
        num += 1
        println("num 当前值等于 " + num)
        if (num == 18) {
          break()
        }
      } while (num < 20)

    }

    println("Hello ~~~")

  }

}
