package dwango.item06_collections.map

import scala.collection.mutable

/**
  * Created by 214 on 2017/04/16.
  */
object Main {

  /**
    * Immutable Map
    */
  def method1 = {
    val map = Map("A" -> 1, "B" -> 2, "C" -> 3)
    println(map.getClass)
    println(map)
    println(map.updated("B", 4))
    println(map)
  }

  /**
    * Mutable Map
    */
  def method2 = {
    val map = mutable.Map("A" -> 1, "B" -> 2, "C" -> 3)
    println(map.getClass)
    println(map)

    map("B") = 5
    println(map)
  }

  def main(args: Array[String]): Unit = {
    //method1
    method2
  }
}
