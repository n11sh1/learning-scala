package dwango.item04_type_parameter_and_variant

import dwango.item04_type_parameter_and_variant.bounds.{ParsonShow, ShowablePair}
import dwango.item04_type_parameter_and_variant.type_parameter.{Cell, Pair}
import dwango.item04_type_parameter_and_variant.variance.Stack

/**
  * Created by 214 on 2017/04/12.
  */
object Main {
  def main(args: Array[String]): Unit = {
    //method1
    //method2
    //method3
    //method4
    //method5
    //method6
    //method7
    method8
  }

  def method1: Unit = {
    val cell = new Cell[Int](1)
    println(cell)
    println(cell.get())

    cell.put(2)
    println(cell.get())
  }

  def divide(m: Int, n: Int): type_parameter.Pair[Int, Int] = new Pair(m / n, m % n)

  def method2: Unit = {
    println(divide(7, 3))
  }

  def method3: Unit = {
    val m = 9
    val n = 3
    println((m / n, m % n))
  }

  def method4: Unit = {
    //covariant
    val pair: Pair[AnyRef, AnyRef] = new Pair[String, String]("foo", "bar")
    println(pair)

    //immutable
    //pair = new Pair[Int, Int](2, 2)
  }

  def method5: Unit = {
    val intStack: Stack[Int] = Stack()
    println(intStack)

    val stringStack: Stack[String] = Stack()
    println(stringStack)
  }

  def method6: Unit = {
    val empty: Stack[Nothing] = Stack()
    val intStack = empty.push(1)
    val stringStack = intStack.push("aaa")
    println(intStack.top)
    println(stringStack.top)
  }

  def method7: Unit = {
    val x1: String => AnyRef = (x: AnyRef) => x
    println(x1("bbb"))

    //contravariant
    //val x2: AnyRef => AnyRef = (x: String) => x
    //println(x2("ccc"))
  }

  def method8: Unit = {
    val success: ShowablePair[ParsonShow, ParsonShow] = new ShowablePair(new ParsonShow("aaa"), new ParsonShow("bbb"))
    println(success.show)

    //val failure: ShowablePair[String, String] = new ShowablePair("aaa", "bbb")
    //println(failure.show)
  }
}
