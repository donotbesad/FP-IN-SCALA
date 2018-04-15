package exercise1

import org.scalatest.FlatSpec
import org.scalatest._

/**
  * Author: Dmitry Artemenko
  * Date: 15.04.18
  * Time: 0:12
  *
  * @author Dmitry Artemenko
  */
class FibonacciNumbersTest extends FlatSpec with Matchers {


  "Function fib" should "return 55 that in position 10 of fibonacci numbers list" in {
    FibonacciNumbers.fib(10) should be(55)
  }

  it should "return 2 that in position 4 of fibonacci numbers list" in {
    FibonacciNumbers.fib(4) should be(3)
  }

  it should "return 0 that in position 0 of fibonacci numbers list" in {
    FibonacciNumbers.fib(0) should be(0)
  }

  it should "return 1 that in position 1 of fibonacci numbers list" in {
    FibonacciNumbers.fib(1) should be(1)
  }


}
