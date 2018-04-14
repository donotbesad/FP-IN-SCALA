package fibonacci

/**
  * Author: Dmitry Artemenko
  * Date: 14.04.18
  * Time: 23:50
  *
  * @author Dmitry Artemenko
  */
object FibonacciNumbers {

  def fib(n: Int): Int = {
    if (n <= 1) n
    else fib(n - 1) + fib(n - 2)
  }

}
