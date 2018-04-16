package chapter2.exercise6

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by Dmitry Artemenko 
  * 4/16/2018
  */
class ComposeTest extends FlatSpec with Matchers {

  "Function uncurry" should "return 4.0 as result" in {
    val a: Int = 1
    val b: Double = 3.0
    val hofResult = Compose.compose[Int, Double, String](b => b.toString, a => b + a)
    hofResult(a) should be ("4.0")

  }
}
