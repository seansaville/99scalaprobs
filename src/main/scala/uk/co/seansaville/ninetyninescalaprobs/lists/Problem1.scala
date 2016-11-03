package uk.co.seansaville.ninetyninescalaprobs.lists

/**
  * Problem 1: Find the last element of a list.
  */
class Problem1 {

  def last[T](list: List[T]): T = list match {
    case h :: Nil => h
    case _ :: t   => last(t)
    case Nil      => throw new NoSuchElementException
  }

}
