package chapter05

object exercise08 {
  def main(args: Array[String]): Unit = {

    val str = "HelloWord"

    println(str.take(3))
    println(str.takeRight(3))
    println(str.drop(3))
    println(str.dropRight(3))
  }

}
