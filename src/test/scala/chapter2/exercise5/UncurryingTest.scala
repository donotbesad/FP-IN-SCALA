package chapter2.exercise5

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by Dmitry Artemenko 
  * 4/16/2018
  */
class UncurryingTest extends FlatSpec with Matchers {

  "Function uncurry" should "return 4.0 as result" in {
    val a: Int = 1
    val b: Double = 3.0
    val hofResult = Uncurrying.uncurry[Int, Double, String](a => (b) => (a + b).toString)
    hofResult(a, b) should be ("4.0")
  }
}
