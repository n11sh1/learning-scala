package dwango.item04_type_parameter_and_variant.type_parameter

/**
  * Created by n11sh1 on 2017/03/25.
  */
class Pair[+A, +B](val a: A, val b: B) {
  override def toString: String = "(" + a + ", " + b + ")"
}
