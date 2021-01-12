package chapter06

object StringDemo {

  val str = "HelloWorld"

  def main(args: Array[String]): Unit = {

    val strBuf = new StringBuilder
    strBuf += 'a'
    strBuf ++= "bcde"
    println("buffer:" + strBuf.toString)

    println(str)
    println(str.charAt(1))
    println(str.codePointAt(1))
    println(str.codePointBefore(1))
    println(str.codePointCount(1, 3))
    println(str.compareTo("helloWorld"))
    println(str.compareToIgnoreCase("helloWorld"))

    println()


  }

}
