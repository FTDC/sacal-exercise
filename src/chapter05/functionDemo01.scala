package chapter05

object functionDemo01 {
  def main(args: Array[String]): Unit = {

    println(opera(2, 1, "+"))

    test(4)
  }


  // 类型推导
  def opera(num1: Int, num2: Int, oper: String) = {
    if (oper == "+") {
      num1 + num2
    } else if (oper == "-") {
      num1 - num2
    } else {
      null
    }
  }


  def test(n: Int) {
    if (n > 2) {
      test(n - 1)
    }
    //    else {
    //      println("n=" + n)
    //    }

    println("n=" + n)
  }
}
