package dwango.item01_class


/**
  * Created by n11sh1 on 2017/03/21.
  */

/*
class Point(_x: Int, _y: Int) {
  val x = _x
  val y = _y
}
*/

class Point(val x: Int, val y:Int) {
  def +(p: Point): Point = {
    new Point(x + p.x, y + p.y)
  }

  override def toString: String = "(" + x + ", " + y + ")"
}
