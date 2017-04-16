package dwango.item07_case_class_and_pattern_matching

/**
  * Created by 214 on 2017/04/16.
  */
sealed abstract class Exp

case class Add(lhs: Exp, rhs: Exp) extends Exp
case class Sub(lhs: Exp, rhs: Exp) extends Exp
case class Mul(lhs: Exp, rhs: Exp) extends Exp
case class Div(lhs: Exp, rhs: Exp) extends Exp
case class Lif(value: Int) extends Exp
