package dwango.item04_type_parameter_and_variant.bounds

/**
  * Created by 214 on 2017/04/12.
  */
abstract class Show {
  def show: String
}

class ShowablePair[A <: Show, B <: Show](val a: A, val b: B) extends Show {
  override def show: String = "(" + a.show + ", " + b.show + ")"
}

class ParsonShow(val name: String) extends Show {
  override def show: String = "My name is " + name + "."
}