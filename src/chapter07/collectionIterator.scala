package chapter07


/**
 * Scala Iterator（迭代器）不是一个集合，它是一种用于访问集合的方法。
 * 迭代器 it 的两个基本操作是 next 和 hasNext。
 * 调用 it.next() 会返回迭代器的下一个元素，并且更新迭代器的状态。
 * 调用 it.hasNext() 用于检测集合中是否还有元素。
 * 让迭代器 it 逐个返回所有元素最简单的方法是使用 while 循环：
 */
object collectionIterator {

  def main(args: Array[String]): Unit = {
    val it = Iterator("Baidu", "Google", "Runoob", "Taobao")

    while (it.hasNext) {
      println(it.next())
    }


    val ita = Iterator(20, 40, 2, 50, 69, 90)
    val itb = Iterator(20, 40, 2, 50, 69, 90)

    //    println("最大元素是：" + ita.max)
    //    println("最小元素是：" + itb.min)

    var nex = ita.next()
    println(nex)

    //   只能对象定义没有使用之前使用， 游标下滑则长度变化
    println("ita.size 的值: " + ita.size)
    println("itb.length 的值: " + itb.length)

//    ita.foreach(con(i: Int) => Unit)
    println(ita)
  }

  def con(i: Int): String = {
    "ser" + i
  }


}
