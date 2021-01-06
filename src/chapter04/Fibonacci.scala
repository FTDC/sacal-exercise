package chapter04

object Fibonacci {

  def main(args: Array[String]): Unit = {

    println(fibo(10))

  }

  def fibo(n: Int): Int = {
    if (n == 1 || n == 2) {
      1
    } else {
      fibo(n - 1) + fibo(n - 2)
    }
  }

}
