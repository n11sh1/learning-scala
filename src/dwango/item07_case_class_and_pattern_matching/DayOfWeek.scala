package dwango.item07_case_class_and_pattern_matching

/**
  * Created by 214 on 2017/04/16.
  */
sealed abstract class DayOfWeek

case object Sunday extends DayOfWeek
case object Monday extends DayOfWeek
case object Tuesday extends DayOfWeek
case object Wednesday extends DayOfWeek
case object Thursday extends DayOfWeek
case object Friday extends DayOfWeek
case object Saturday extends DayOfWeek