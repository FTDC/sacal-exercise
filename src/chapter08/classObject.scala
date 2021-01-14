package chapter08


class Point(xc: Int, yc: Int) {
  var x: Int = xc
  var y: Int = yc


  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
    println("x1 的坐标点：" + x)
    println("y1 的坐标点：" + y)
  }
}

class Location(val xc: Int, val yc: Int, val zc: Int) extends PointTrait(xc, yc) {
  var z: Int = zc

  def move(dx: Int, dy: Int, dz: Int): Unit = {
    x += dx
    y += dy
    z += dz

    println("x 的坐标点 ：" + x)
    println("y 的坐标点 ：" + y)
    println("z 的坐标点 ：" + z)
  }

}

object classObject {
  def main(args: Array[String]): Unit = {
    val point = new Point(3, 3)
    point.move(4, 5)

    val location = new Location(2, 3, 4)
    location.move(1, 2,4)
  }
}
