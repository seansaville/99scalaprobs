package uk.co.seansaville.ninetyninescalaprobs.lists

/**
  * Problem 2: Find the last but one element of a list.
  */
object Problem2 {

  def penultimate[T](list: List[T]): T = list match {
    case h :: _ :: Nil => h
    case _ :: t        => penultimate(t)
    case _             => throw new NoSuchElementException
  }

}
