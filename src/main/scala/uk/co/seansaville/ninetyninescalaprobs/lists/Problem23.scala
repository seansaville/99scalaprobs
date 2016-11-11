package uk.co.seansaville.ninetyninescalaprobs.lists

import scala.util.Random

/**
  * Problem 23: Extract a given number of randomly selected elements from a list.
  */
object Problem23 {

  def randomSelect[T](n: Int, list: List[T]): List[T] = {
    def helper[U](n: Int, list: List[U], result: List[U]): List[U] = (n, list) match {
      case (0, _)        => result
      case (_, Nil)      => result
      case (_, x :: Nil) => x :: result
      case (k, _)        =>
        val removed = Problem20.removeAt(Random.nextInt(list.length - 1), list)
        helper(k - 1, removed._1, removed._2 :: result)
    }
    helper(n, list, List())
  }

}
