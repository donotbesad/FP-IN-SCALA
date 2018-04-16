package chapter2.exercise3

/**
  * Created by Dmitry Artemenko 
  * 4/16/2018
  */
object PartialUtil {

  def partial1[A, B, C](a: A, f: (A, B) => C) : B => C = {
    b => f(a, b)
  }

}
