package dwango.item06_collections.array

/**
  * Created by 214 on 2017/04/14.
  */
object Main {
  def main(args: Array[String]): Unit = {
    //method1
    method2
  }

  def method1 = {
    val arr = Array[Int](1, 2, 3, 4, 5)
    println(arr.foreach(print))

    arr(0) = 7
    println(arr.foreach(print))
    println(arr(0))

    println(arr.length)
  }
  def method2 = {
    def swapArray[T](arr: Array[T])(i: Int, j: Int): Unit = {
      val tmp = arr(i)
      arr(i) = arr(j)
      arr(j) = tmp
    }

    val arr = Array[Int](1, 2, 3, 4, 5)
    swapArray(arr)(0,4)
    println(arr.foreach(print))
    swapArray(arr)(1,3)
    println(arr.foreach(print))
  }
}
