package IOExercise

import java.io._
import scala.io.Source

object fileExercise {

  def main(args: Array[String]): Unit = {
    val writer = new PrintWriter(new File("test.txt"))

    writer.append("test")
    writer.close()


    println("文件内容为:")

    Source.fromFile("test.txt").foreach {
      print
    }

  }

}
