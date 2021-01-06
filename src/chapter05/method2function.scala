package chapter05

object method2function {

  def main(args: Array[String]): Unit = {

    // 方法
    var dog = new Dog;
    println(dog.sum(4, 5));

    // 方法转函数
    var funcT = dog.sum _
    println(funcT(3, 7))

    // 函数
    val func1 = (n1: Int, n2: Int) => {
      n1 + n2
    }

    println(func1(1, 2))


  }
}


class Dog {
  def sum(num1: Int, num2: Int): Int = {
    num1 + num2
  }
}
