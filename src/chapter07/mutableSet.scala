package chapter07

import scala.collection.mutable.Set

/**
 * 可变集合
 */
object mutableSet {

  val mulTable = Set(1, 2, 3)

  def main(args: Array[String]): Unit = {
    println(mutableSet.getClass.getName)

    mulTable.add(4)
    mulTable += 5
    mulTable -= 2

    println(mulTable)


    //    val site = Set("Runoob", "Google", "Baidu")
    //    val nums: Set[Int] = Set()
    //
    //    println("第一网站是 : " + site.head)
    //    println("最后一个网站是 : " + site.tail)
    //    println("查看列表 site 是否为空 : " + site.isEmpty)
    //    println("查看 nums 是否为空 : " + nums.isEmpty)


    val site1 = Set("Runoob", "Google", "Baidu")
    val site2 = Set("Faceboook", "Taobao")

    // ++ 作为运算符使用
    var site = site1 ++ site2
    println("site1 ++ site2 : " + site)

    //  ++ 作为方法使用
    site = site1.++(site2)
    println("site1.++(site2) : " + site)


    val num1 = Set(5, 6, 9, 20, 30, 45)
    val num2 = Set(50, 60, 9, 20, 35, 55)

    // 交集
    println("num1.&(num2) : " + num1.&(num2))
    println("num1.intersect(num2) : " + num1.intersect(num2))

  }

}
