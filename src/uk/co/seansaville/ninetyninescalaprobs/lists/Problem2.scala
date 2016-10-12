package uk.co.seansaville.ninetyninescalaprobs.lists

class Problem2 {

  def lastButOne[T](list: List[T]): T = list match {
    case h :: _ :: Nil => h
    case _ :: t        => lastButOne(t)
    case _             => throw new NoSuchElementException
  }

}
