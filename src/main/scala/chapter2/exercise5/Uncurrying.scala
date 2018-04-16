package chapter2.exercise5

/**
  * Created by Dmitry Artemenko 
  * 4/16/2018
  */
object Uncurrying {

  def uncurry[A, B, C](f: A => B => C): (A, B) => C = {
    (a, b) => f(a)(b)
  }

}
