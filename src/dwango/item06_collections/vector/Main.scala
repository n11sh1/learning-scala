package dwango.item06_collections.vector

/**
  * Created by 214 on 2017/04/16.
  */
object Main {

  def method1 = {
    val vector = Vector(1, 2, 3, 4, 5)
    println(vector.getClass)
    println(vector)
    println(6 +: vector)
    println(vector :+ 6)
    println(vector.updated(2, 7))
    println(vector)
  }

  def main(args: Array[String]): Unit = {
    method1
  }
}
