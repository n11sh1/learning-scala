package dwango.item01_class

/**
  * Created by n11sh1 on 2017/03/21.
  */
object Main {
  def main(args: Array[String]): Unit = {
    //method1
    //method2
    method3
  }

  def method1: Unit = {
    val p1: Point = new Point(1, 1)
    val p2: Point = new Point(2, 2)
    println(p1 + p2)
  }

  def method2: Unit = {
    val adder = new Adder
    println(adder)
    println(adder.add(2)(3))
    println(adder.add(2)_)
  }

  def method3: Unit = {
    println(new SuperClass().say())
    println(new SubClass().say())
  }
}
