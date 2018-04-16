package chapter2.exercise2

/**
  * Author: Dmitry Artemenko
  * Date: 15.04.18
  * Time: 14:11
  *
  * @author Dmitry Artemenko
  */
object SortUtil {

  def isSorted[A](as: Array[A], gt: (A, A) => Boolean): Boolean = {
    var previous: Option[A] = None
    for (current <- as) {
      if (previous.nonEmpty)
        if (!gt(previous.get, current)) return false
      previous = Some(current)
    }
    true
  }

}
