package uk.co.seansaville.ninetyninescalaprobs.lists

/**
  * Duplicate the elements of a list a given number of times.
  */
object Problem15 {

  def duplicateN[T](n: Int, list: List[T]): List[T] = list flatMap {
    List.fill(n)(_)
  }

}
