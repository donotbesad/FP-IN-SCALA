package chapter2.exercise2

import org.scalatest.{FlatSpec, Matchers}

/**
  * Author: Dmitry Artemenko
  * Date: 15.04.18
  * Time: 14:13
  *
  * @author Dmitry Artemenko
  */
class SortUtilTest extends FlatSpec with Matchers {

  "Function isSorted" should "return true when provided {1, 2, 3, 4} numbers that have ascending sorting" in {
    SortUtil.isSorted[Int](Array[Int](1, 2, 3, 4), (n1: Int, n2: Int) => n1 < n2) should be(true)
  }

  it should "return false when provided {4, 3, 1, 2} numbers that have wrong descending sorting" in {
    SortUtil.isSorted[Int](Array[Int](4, 3, 1, 2), (n1: Int, n2: Int) => n1 > n2) should be(false)
  }

  it should "return true when provided {1.0, 2.0, 3.0, 4.0} numbers that have ascending sorting" in {
    SortUtil.isSorted[Double](Array[Double](1.0, 2.0, 3.0, 4.0), (n1: Double, n2: Double) => n1 < n2) should be(true)
  }

  it should "return false when provided {4.0, 3.0, 1.0, 2.0} numbers that have wrong descending sorting" in {
    SortUtil.isSorted[Double](Array[Double](4.0, 3.0, 1.0, 2.0), (n1: Double, n2: Double) => n1 > n2) should be(false)
  }

}
