package dwango.item02_object

/**
  * Created by n11sh1 on 2017/03/22.
  */
object Person {
  val taro = new Person("Taro", 20, 70)
  println(taro.name)
  println(taro.age)
  println(taro.weight)
  println(taro.tel)
}

class Person(val name: String, val age: Int, private val weight: Int) {
  private val tel = "090-1234-5678"
}
