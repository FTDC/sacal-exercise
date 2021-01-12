package chapter07

object collectionSet {

  def main(args: Array[String]): Unit = {
    val set = Set(1, 2, 3)
    println(set.getClass.getName) //

    println(set.exists(_ % 2 == 0)) //true
    println(set.drop(1)) //Set(2,3)
  }

}
