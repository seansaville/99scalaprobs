package uk.co.seansaville.ninetyninescalaprobs.lists

/**
  * Problem 20: Remove the Kth element from a list.
  */
object Problem20 {

  def removeAt[T](k: Int, list: List[T]): (List[T], T) = {
    def removeHelper[U](k: Int, list: List[U], temp: List[U]): (List[U], U) = (k, list) match {
      case (0, h :: t) => (temp.reverse ++ t, h)
      case (n, h :: t) => removeHelper(n - 1, t, h :: temp)
      case (_, Nil)    => throw new NoSuchElementException
    }
    removeHelper(k, list, List())
  }

}
