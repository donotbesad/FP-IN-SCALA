package chapter2.exercise6

/**
  * Created by Dmitry Artemenko 
  * 4/16/2018
  */
object Compose {

  def compose[A, B, C](f: B => C, g: A => B): A => C = {
    a => f(g(a))
  }
}
