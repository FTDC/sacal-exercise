package chapter07

object collectionTuple {

  def main(args: Array[String]): Unit = {
    val t = (4, 3, 2, 1)
    val sum = t._1 + t._2 + t._3 + t._4

    println("元素之和为: " + sum)


    // 元组遍历
    t.productIterator.foreach { i => println("Value = " + i) }


    //    元组转为字符串
    val t1 = new Tuple3(1, "hello", Console)

    println("连接后的字符串为: " + t1.toString())


    //    元素交换
    val t3 = new Tuple2("www.google.com", "www.runoob.com")

    println("交换后的元组: " + t3.swap)

  }

}
