package exceptionExercise

import java.io.{FileNotFoundException, FileReader, IOException}

/**
 * 异常捕捉的机制与其他语言中一样，如果有异常发生，catch 字句是按次序捕捉的。
 * 因此，在 catch 字句中，越具体的异常越要靠前，越普遍的异常越靠后。 如果抛出的异常不在 catch 字句中，该异常则无法处理，会被升级到调用者处。
 *
 * 捕捉异常的 catch 子句，语法与其他语言中不太一样。
 * 在 Scala 里，借用了模式匹配的思想来做异常的匹配，因此，在 catch 的代码里，是一系列 case 字句
 */
object caseException {
  def main(args: Array[String]) {
    try {
      val f = new FileReader("input.txt")
    } catch {
      case ex: FileNotFoundException => {
        println("Missing file exception")
      }
      case ex: IOException => {
        println("IO Exception")
      }
    } finally {
      println("Exiting finally...")
    }
  }

}
