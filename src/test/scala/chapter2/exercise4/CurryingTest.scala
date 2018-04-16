package chapter2.exercise4

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by Dmitry Artemenko 
  * 4/16/2018
  */
class CurryingTest extends FlatSpec with Matchers {

  "Function curry" should "return 4.0 as result" in {
    val a: Int = 1
    val b: Double = 3.0
    val hofResult = Currying.curry((a: Int, b: Double) => (a + b).toString)
    val internalHofResult1 = hofResult(a)
    internalHofResult1(b) should be ("4.0")
  }

}
