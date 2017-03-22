package dwango.item03_trait

import dwango.item03_trait.lazy_val.ClassC
import dwango.item03_trait.linearization.{ClassA, ClassB}
import dwango.item03_trait.self_types.{HelloGreeter, Robot}

/**
  * Created by n11sh1 on 2017/03/22.
  */
object Main {
  def main(args: Array[String]): Unit = {
    //method1
    //method2
    method3
  }

  def method1 = {
    (new ClassA).greet()
    (new ClassB).greet()
  }

  def method2 = {
    (new Robot with HelloGreeter).start()
  }

  def method3 = {
    (new ClassC).printBar()
  }
}
