package dwango.item05_functions

import scala.io.Source

/**
  * Created by 214 on 2017/04/14.
  */
object Main {
  def main(args: Array[String]): Unit = {
    //method1
    //method2
    //method3
    //method4
    //method5
    method6
  }

  def method1 = {
    val add = new Function2[Int, Int, Int] {
      override def apply(x: Int, y: Int): Int = x + y
    }

    println(add)
    println(add.apply(100, 200))
    println(add(200, 300))
  }

  /**
    * Anonymous Function Syntax
    */
  def method2 = {
    val add = (x: Int, y: Int) => x + y

    println(add)
    println(add.apply(100, 200))
    println(add(200, 300))
  }

  /**
    * Curring
    */
  def method3 = {
    val addCurried = (x: Int) => ((y: Int) => x + y)

    println(addCurried)
    println(addCurried(100)(200))
  }

  /**
    * Higher-order Functions
    */
  def method4 = {
    def double(n: Int, f: Int => Int): Int = {
      f(f(n))
    }

    println(double(1, m => m * 2))
    println(double(2, m => m * 3))
    println(double(3, m => m * 4))
  }

  def method5 = {
    def around(init: () => Unit, body: () => Any, fin: () => Unit): Any = {
      init()
      try {
        body()
      } finally {
        fin()
      }
    }

    around(
      () => println("ファイルを開く"),
      () => println("ファイルに対する処理"),
      () => println("ファイルを閉じる")
    )

    around(
      () => println("ファイルを開く"),
      () => throw new Exception("例外発生！"),
      () => println("ファイルを閉じる")
    )
  }

  /**
    * Loan Pattern
    */
  def method6 = {
    def withFile[A](fileName: String)(f: Source => A): A = {
      val s = Source.fromFile(fileName)
      try {
        f(s)
      } finally {
        s.close()
      }
    }

    def printFile(fileName: String): Unit = {
      withFile(fileName) {
        file => file.getLines().foreach(println)
      }
    }

    printFile("./src/dwango/item05_functions/sample.txt")
  }
}
