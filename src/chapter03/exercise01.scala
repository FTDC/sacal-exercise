package com.xjin.demo
package chapter03

import scala.io.StdIn

object exercise01 {

  def main(args: Array[String]): Unit = {

    print("请输入年龄\n")

    val age = StdIn.readDouble();

    if (age < 10) {
      print(s"你的年龄太小， 才{age}")
      printf(s"你的年龄太小， 才 %d", age.toInt)
    } else if (age > 10 && age < 20) {
      print("小伙子， 不错" + age)
    } else {
      print("hard work !!!")
    }
  }

}
