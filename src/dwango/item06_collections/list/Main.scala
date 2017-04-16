package dwango.item06_collections.list

/**
  * Created by 214 on 2017/04/15.
  */
object Main {
  val list = (1 to 5).toList

  def method1 = {
    //immutable
    //list(0) = 7
  }

  /**
    * Nil & Cons
    */
  def method2 = {
    val a1 = 1 :: Nil
    println(a1)

    val a2 = 2 :: a1
    println(a2)

    val a3 = 3 :: a2
    println(a3)

    val a4 = 4 :: a3
    println(a4)

    val a5 = 5 :: a3
    println(a5)

    val list1 = 1 :: 2 :: 3 :: 4 :: Nil
    println(list1)
    val list2 = Nil.::(4).::(3).::(2).::(1)
    println(list2)
    println(list1.equals(list2))
  }

  /**
    * List Concatenation
    */
  def method3 = {
    println(List(1, 2) ++ List(3, 4))
    println(List(1) ++ List(3, 4, 5))
    println(List(3, 4, 5) ++ List(1))
    println(List(1, 2).++(List(3, 4)))
  }

  /**
    * mkString
    */
  def method4 = {
    println(list.mkString)
    println(list.mkString(","))
    println(list.mkString("[", ",", "]"))
    println(joinByComma(1, 5))
  }

  def joinByComma(start: Int, end: Int): String = {
    (start to end).mkString(",")
  }

  /**
    * foldLeft
    */
  def method5 = {
    println(list.foldLeft(0)((x, y) => x + y))
    println(list.foldLeft(1)((x, y) => x * y))
    println(reverse(list))
  }

  def reverse[T](list: List[T]): List[T] = {
    list.foldLeft(Nil: List[T])((result, element) => element :: result)
  }

  /**
    * foldRight
    */
  def method6 = {
    println(sum(list))
    println(sum(Nil))
    println(mul(list))
    println(mul(List()))
    println(mkString(list)(","))
  }

  def sum(list: List[Int]): Int = list.foldRight(0)((y, x) => y + x)

  def mul(list: List[Int]): Int = list.foldRight(1)((y, x) => y * x)

  def mkString[T](list: List[T])(seq: String): String = list match {
    case Nil => ""
    case x::xs => xs.foldLeft(x.toString)((x, y) => x + seq + y)
  }

  /**
    * map
    */
  def method7 = {
    println(list.map(x => x * 2))
    println(map(list)(x => x * 3))
  }

  def map[T, U](list: List[T])(f: T => U): List[U] = {
    list.foldLeft(Nil: List[U])((x, y) => f(y) :: x).reverse
  }

  /**
    * filter
    */
  def method8 = {
    println(list.filter(x => x % 2 == 1))
    println(filter(list)(x => x % 2 == 0))
  }

  def filter[T](list: List[T])(f: T => Boolean): List[T] = {
    list.foldLeft(Nil: List[T])((x, y) => if(f(y)) y :: x else x).reverse
  }

  /**
    * Others
    */
  def method9 = {
    //find
    println(list.find(x => x % 2 == 1))

    //takeWhile
    println(list.takeWhile(x => x != 5))

    //count
    println(list.count(x => x % 2 == 0))
    println(count(list)(x => x != 3))
  }

  def count[T](list: List[T])(f: T => Boolean): Int = {
    list.foldLeft(0)((x, y) => if(f(y)) x + 1 else x)
  }

  /**
    * flatMap
    */
  def method10 = {
    println(List(List(1, 2, 3), List(4, 5)).flatMap(e => e.map(g => g + 1)))
    println(List(1, 2, 3).flatMap(e => List(4, 5).map(g => e * g)))
  }

  def main(args: Array[String]): Unit = {
    //method1
    //method2
    //method3
    //method4
    //method5
    //method6
    //method7
    //method8
    //method9
    method10
  }
}
