package chapter07

object collectionOption {

  def main(args: Array[String]): Unit = {


    //    定义
    val myMap: Map[String, String] = Map("key1" -> "value")
    val value1: Option[String] = myMap.get("key1")
    val value2: Option[String] = myMap.get("key2")

    println(value1) // Some("value1")
    println(value2) // None



  }

}
