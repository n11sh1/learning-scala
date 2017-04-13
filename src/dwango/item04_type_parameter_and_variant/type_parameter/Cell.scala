package dwango.item04_type_parameter_and_variant.type_parameter

/**
  * Created by n11sh1 on 2017/03/25.
  */
class Cell[A](var value: A) {
  def put(newValue: A): Unit = {
    value = newValue
  }

  def get(): A = value
}
