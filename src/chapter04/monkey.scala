package chapter04

object monkey {

  def main(args: Array[String]): Unit = {
    //  桃子的数量
    var peach: Int = 0;

    // 天数
    val days = 1

    /**
     * 第10天的桃子  day10[1]  1
     * 第9天的桃子   day9 [4]（1+1）*2
     * 第8天的桃子   day8 [10]（4+1）*2
     * 第7天的桃子   day7 [22]（10+1）*2
     */
    println(eat(days))

  }


  /**
   * 求吃桃子的数量
   *
   * @param day 天数
   * @return
   */
  def eat(day: Int): Int = {
    if (day == 10) {
      1
    } else {
      (eat(day + 1) + 1) * 2
    }
  }

}
