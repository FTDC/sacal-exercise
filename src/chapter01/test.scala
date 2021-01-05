package com.xjin.demo
package chapter01

object test {
  def main(args: Array[String]): Unit = {

    val age = 22.0 / 2


    for (i <- 1 to 12) {
      print(i + "\n")
    }


    for (i <- 1 to(20, 2)) {
      print(i + "\n")
    }

    print("name" + age + " new ------------- \n")


    for (i <- Range(1, 20, 3)) {
      print(i + "\n");
    }






  }
}
