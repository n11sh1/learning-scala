package dwango.item06_collections.set

import scala.collection.mutable

/**
  * Created by 214 on 2017/04/16.
  */
object Main {

  /**
    * Immutable Set
    */
  def method1 = {
    val set = Set(1, 1, 2, 3, 4, 5)
    println(set.getClass)
    println(set)
    println(set - 5)
    println(set)
  }

  /**
    * Mutable Set
    */
  def method2 = {
    val set = mutable.Set(1, 2, 3, 4, 5)
    println(set.getClass)
    println(set)
    println(set -= 5)
    println(set)
  }

  def main(args: Array[String]): Unit = {
    //method1
    method2
  }
}
