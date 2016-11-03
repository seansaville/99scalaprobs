package uk.co.seansaville.ninetyninescalaprobs.lists

import scala.annotation.tailrec

/**
  * Problem 4: Find the number of elements of a list.
  */
class Problem4 {

  def length[T](list: List[T]): Int = {
    @tailrec
    def lengthAcc[U](list: List[U], acc: Int): Int = list match {
      case Nil    => acc
      case _ :: t => lengthAcc(t, acc + 1)
    }
    lengthAcc(list, 0)
  }

}
