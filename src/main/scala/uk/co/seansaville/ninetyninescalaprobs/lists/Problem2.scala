package uk.co.seansaville.ninetyninescalaprobs.lists

/**
  * Problem 2: Find the last but one element of a list.
  */
class Problem2 {

  def lastButOne[T](list: List[T]): T = list match {
    case h :: _ :: Nil => h
    case _ :: t        => lastButOne(t)
    case _             => throw new NoSuchElementException
  }

}
