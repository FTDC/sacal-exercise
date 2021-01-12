package chapter07

object collectionList {

  // 字符串列表
  val site: List[String] = List("Runoob", "Google", "Baidu")

  // 整型列表
  val nums: List[Int] = List(1, 2, 3, 4)

  // 空列表
  val empty: List[Nothing] = List()

  // 二维列表
  val dim: List[List[Int]] =
    List(
      List(1, 0, 0),
      List(0, 1, 0),
      List(0, 0, 1)
    )


  // 字符串列表
  val site1 = "Runoob" :: ("Google" :: ("Baidu" :: Nil))

  // 整型列表
  val nums1 = 1 :: (2 :: (3 :: (4 :: Nil)))

  // 空列表
  val empty1 = Nil

  // 二维列表
  val dim1 = (1 :: (0 :: (0 :: Nil))) ::
    (0 :: (1 :: (0 :: Nil))) ::
    (0 :: (0 :: (1 :: Nil))) :: Nil


  def main(args: Array[String]): Unit = {
    println(site1)
    println(nums1)
    println(dim1)
  }







}
