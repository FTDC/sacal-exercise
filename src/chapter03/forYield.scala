package chapter03

object forYield {
  def main(args: Array[String]): Unit = {
    var res = for (i <- -1 to 20) yield {
      if (i % 2 == 0) {
        i + "\n"
      } else {
        "不是偶数\n"
      }
    }

    print(res)
  }

}
