package dwango.item03_trait.self_types

/**
  * Created by n11sh1 on 2017/03/22.
  */
trait HelloGreeter extends Greeter {
  override def greet() = println("Hello!")
}
