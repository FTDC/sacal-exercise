package chapter05

/**
 * 可变参数， Scala 允许你指明函数的最后一个参数可以是重复的，即我们不需要指定函数参数的个数，可以向函数传入可变长度参数列表。
 */
object printString {
  def main(args: Array[String]): Unit = {

    printStr(12, "ggg", "tt", "cc")
  }


  def printStr(age: Int, args: String*) = {
    println(age)
    for (str <- args) {
      println(str)
    }
  }

}
