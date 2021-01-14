package macthRegexExercise

/**
 * 匹配模式
 * 一个模式匹配包含了一系列备选项，每个都开始于关键字 case。每个备选项都包含了一个模式及一到多个表达式。箭头符号 => 隔开了模式和表达式。
 */
object matchObject {

  def main(args: Array[String]) {
    val alice = new Person("Alice", 25)
    val bob = new Person("Bob", 32)
    val charlie = new Person("Charlie", 32)

    for (person <- List(alice, bob, charlie)) {
      person match {
        case Person("Alice", 25) => println("Hi Alice!")
        case Person("Bob", 32) => println("Hi Bob!")
        case Person(name, age) => println("Age: " + age + " year, name: " + name + "?")
      }
    }


    println(matchTest("two"))
    println(matchTest("test"))
    println(matchTest(1))
    println(matchTest(6))
    println(matchTest(""))
    println(matchTest(3))


  }

  def matchTest(x: Any): Any = x match {
    case 1 => "one"
    case "two" => 2
    case 0 | "" => false //在0或空字符串的情况下,返回false
    case 2 | 4 | 6 | 8 | 10 => println("偶数") //在10及以下的偶数,返回"偶数"
    case y: Int => "scala.Int"
    case x if x == 2 || x == 3 => println("two's company, three's a crowd") //在模式匹配中使用if
    case _ => "many"
  }

  // 样例类
  case class Person(name: String, age: Int)

}
