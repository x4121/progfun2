package example

import scala.annotation.tailrec

object Lists {

  /**
   * This method computes the sum of all elements in the list xs. There are
   * multiple techniques that can be used for implementing this method, and
   * you will learn during the class.
   *
   * @param xs A list of natural numbers
   * @return The sum of all elements in `xs`
   */
    def sum(xs: List[Int]): Int = {
      @tailrec
      def sum(xs: List[Int], acc: Int): Int = xs match {
        case List() => acc
        case head :: tail => sum(tail, acc + head)
      }
      sum(xs, 0)
    }

  /**
   * This method returns the largest element in a list of integers. If the
   * list `xs` is empty it throws a `java.util.NoSuchElementException`.
   *
   * @param xs A list of natural numbers
   * @return The largest element in `xs`
   * @throws java.util.NoSuchElementException if `xs` is an empty list
   */
    def max(xs: List[Int]): Int = {
      @tailrec
      def max(xs: List[Int], cur: Int): Int = xs match {
        case List() => cur
        case head :: tail => max(tail, Math.max(head, cur))
      }
      max(xs.tail, xs.head)
    }
  }
