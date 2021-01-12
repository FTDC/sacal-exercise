package chapter07

object collectionMap {

  // 空哈希表，键为字符串，值为整型
  var A: Map[Char, Int] = Map()


  //  val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF")


  A += ('I' -> 1)
  A += ('J' -> 5)
  A += ('K' -> 10)
  A += ('L' -> 100)


  def main(args: Array[String]): Unit = {
    // Map 键值对演示
    val colors = Map("red" -> "#FF0000",
      "azure" -> "#F0FFFF",
      "peru" -> "#CD853F")

    val nums: Map[Int, Int] = Map()

    println("colors 中的键为 : " + colors.keys)
    println("colors 中的值为 : " + colors.values)
    println("检测 colors 是否为空 : " + colors.isEmpty)
    println("检测 nums 是否为空 : " + nums.isEmpty)


    val colors1 = Map("red" -> "#FF0000",
      "azure" -> "#F0FFFF",
      "peru" -> "#CD853F")
    val colors2 = Map("blue" -> "#0033FF",
      "yellow" -> "#FFFF00",
      "red" -> "#FF0000")

    //  ++ 作为运算符
    var colors3 = colors1 ++ colors2
    println("colors1 ++ colors2 : " + colors3)

    //  ++ 作为方法
    colors3 = colors1.++(colors2)
    println("colors1.++(colors2) : " + colors3)


    //    遍历
    val sites = Map("runoob" -> "http://www.runoob.com",
      "baidu" -> "http://www.baidu.com",
      "taobao" -> "http://www.taobao.com")

    sites.keys.foreach { i =>
      print("Key = " + i)
      println(" Value = " + sites(i))
    }


    //    查看 Map 中是否存在指定的 Key
    val sitesMap = Map("runoob" -> "http://www.runoob.com",
      "baidu" -> "http://www.baidu.com",
      "taobao" -> "http://www.taobao.com")

    if (sitesMap.contains("runoob")) {
      println("runoob 键存在，对应的值为 :" + sitesMap("runoob"))
    } else {
      println("runoob 键不存在")
    }
    if (sitesMap.contains("baidu")) {
      println("baidu 键存在，对应的值为 :" + sitesMap("baidu"))
    } else {
      println("baidu 键不存在")
    }
    if (sitesMap.contains("google")) {
      println("google 键存在，对应的值为 :" + sitesMap("google"))
    } else {
      println("google 键不存在")
    }

  }
}
