package example

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

 @RunWith(classOf[JUnitRunner])
  class ListsSuite extends FunSuite {

  test("one plus one is two"){
    assert(1 + 1 === 2)
  }

  test("one plus one plus one is three?") {
    assert(1 + 1 + 1 === 3)
  }

  test("one plus negative one is zero") {
    assert(1 + -1 === 0)
  }

  test("intNotZero throws an exception if its argument is 0") {
    intercept[IllegalArgumentException] {
      intNotZero(0)
    }
  }

  def intNotZero(x: Int): Int = {
    if (x == 0) throw new IllegalArgumentException("zero is not allowed")
    else x
  }


  import Lists._

  test("sum of a few numbers") {
    assert(sum(List(1,2,0)) === 3)
  }

  test("sum with negative numbers") {
    assert(sum(List(1,-3)) === -2)
  }

  test("sum of empty list") {
    assert(sum(List()) === 0)
  }

  test("sum of single number") {
    assert(sum(List(1)) === 1)
  }

  test("max of a few numbers") {
    assert(max(List(3, 7, 2)) === 7)
  }

  test("max of single number") {
    assert(max(List(1)) === 1)
  }

  test("max of negative numbers") {
    assert(max(List(-10, -5, -7)) === -5)
  }

  test("max of empty list") {
    intercept[NoSuchElementException] {
      max(List.empty[Int])
    }
  }
}
