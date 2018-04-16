package chapter2.exercise4

/**
  * Created by Dmitry Artemenko 
  * 4/16/2018
  */
object Currying {

  def curry[A, B, C](f: (A, B) => C): A => (B => C) = {
    a: A => b: B => f(a, b)
  }

}
