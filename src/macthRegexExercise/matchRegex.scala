package macthRegexExercise

import scala.util.matching.Regex

/**
 * Scala 通过
 * scala.util.matching 包中的 Regex 类来支持正则表达式。以下实例演示了使用正则表达式查找单词 Scala
 */
object matchRegex {
  def main(args: Array[String]) {
    val pattern = "Scala".r
    val str = "Scala is Scalable and cool"

    println(pattern findFirstIn str)


    val hat = "hat[^a]+".r
    val hathaway = "hathatthattthatttt"
    val hats = hat.findAllIn(hathaway).toList // List(hath, hattth)
    val pos = hat.findAllMatchIn(hathaway).map(_.start).toList // List(0, 7)

    println(hats)
    //    pos.foreach(item:Any){
    //
    //    }


    //    val madhatter = "(h)(?=(at[^a]+))".r
    //    val madhats = madhatter.findAllMatchIn(hathaway).map {
    //      case madhatter(x, y) => s"\$x\$y"
    //    }.toList // List(hath, hatth, hattth, hatttt)
    //
    //    println(madhatter)

    val pattern1 = "(S|s)cala".r
    val str2 = "Scala is scalable and cool"

    println(pattern1 replaceFirstIn(str2, "Java"))
  }


}
