package dwango.item03_trait.lazy_val

/**
  * Created by n11sh1 on 2017/03/22.
  */
trait TraitB extends TraitA {
  lazy val bar = foo + "World"
}
