package uk.co.seansaville.ninetyninescalaprobs.lists

/**
  * Problem 14: Duplicate the elements of a list.
  */
object Problem14 {

  def duplicate[T](list: List[T]): List[T] = {
    def duplicateHelper[U](list: List[U], result: List[U]): List[U] = list match {
      case h :: t => duplicateHelper(t, h :: h :: result)
      case _      => result.reverse
    }
    duplicateHelper(list, List())
  }

}
