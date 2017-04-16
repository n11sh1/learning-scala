package dwango.item07_case_class_and_pattern_matching

import dwango.item07_case_class_and_pattern_matching.BinaryTree.{Branch, Empty, Tree}

/**
  * Created by 214 on 2017/04/16.
  */
object Main {

  def method1 = {
    val x: DayOfWeek = Sunday
    println(x)

    val i = x match {
      case Sunday => 1
      case Monday => 2
      case Tuesday => 3
      case Wednesday => 4
      case Thursday => 5
      case Friday => 6
    }
    println(i)
  }

  def method2 = {
    //1 + ((2 * 3) / 2)
    val example = Add(Lif(1), Div(Mul(Lif(2), Lif(3)), Lif(2)))
    println(example)
    println(eval(example))
  }


  def eval(exp: Exp): Int = exp match {
    case Add(l, r) => eval(l) + eval(r)
    case Sub(l, r) => eval(l) - eval(r)
    case Mul(l, r) => eval(l) * eval(r)
    case Div(l, r) => eval(l) / eval(r)
    case Lif(v) => v
  }

  def method3 = {
    val point = Point(1, 2)
    println(point)
  }

  def nextDayOfWeek(d: DayOfWeek): DayOfWeek = {
    d match {
      case Sunday => Monday
      case Monday => Tuesday
      case Tuesday => Wednesday
      case Wednesday => Thursday
      case Thursday => Friday
      case Friday => Saturday
      case Saturday => Sunday
    }
  }

  def method4 = {
    println(nextDayOfWeek(Saturday))
    println(nextDayOfWeek(Sunday))
  }

  def max(tree: Tree): Int = tree match {
    case Branch(v, l, r) => {
      if(v > max(l)) {
        if (v > max(r)) return v
      }
      if (max(l) > max(r)) max(l) else max(r)
    }
    case Empty => 0
  }

  def min(tree: Tree): Int = tree match {
    case Branch(v, l, r) => {
      if(v < min(l)) {
        if (v < min(r)) return v
      }
      if (min(l) < min(r)) min(l) else min(r)
    }
    case Empty => Int.MaxValue
  }

  def depth(tree: Tree): Int = tree match {
    case Branch(v, l, r) => (if(depth(l) >= depth(r)) depth(l) else depth(r)) + 1
    case Empty => 0
  }

  def method5 = {
    val tree: Tree = Branch(1, Branch(2, Empty, Empty), Branch(3, Empty, Empty))
    println(tree)

    println(max(tree))
    println(min(tree))

    println(depth(Empty))
    println(depth(Branch(10, Empty, Empty)))
    println(depth(Branch(10, Branch(20, Empty, Empty), Empty)))
    println(depth(Branch(10, Branch(20, Empty, Empty), Branch(30, Branch(40, Empty, Empty), Empty))))
  }

  def main(args: Array[String]): Unit = {
    //method1
    //method2
    //method3
    //method4
    method5
  }
}
