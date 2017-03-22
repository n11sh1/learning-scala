package dwango.item03_trait.self_types

/**
  * Created by n11sh1 on 2017/03/22.
  */
trait Robot {
  self: Greeter =>

  def start(): Unit = greet()

  override def toString: String = "Robot"
}
