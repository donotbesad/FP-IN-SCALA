package chapter2.exercise3

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by Dmitry Artemenko 
  * 4/16/2018
  */
class PartialUtilTest extends FlatSpec with Matchers {

  "Function partial" should "return 4.0 as result" in {
    val a: Int = 1
    val b: Double = 3.0
    val hofResult = PartialUtil.partial1[Int, Double, String](a, (a, b) => (a + b).toString)
    hofResult(3.0) should be ("4.0")
  }

}
