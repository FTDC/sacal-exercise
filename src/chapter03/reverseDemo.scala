package chapter03

object reverseDemo {
  def main(args: Array[String]): Unit = {
    for (i <- 0 to 10 reverse)
      println(i)

    println("------------------")
    //    (1 to 20).reverse foreach (println)
    (1 to 20).reverse foreach (myShow)
  }


  def myShow(n: Int): Unit = {
    println("xxxxx : " + n)
  }

}
