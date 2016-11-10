package uk.co.seansaville.ninetyninescalaprobs.lists

/**
  * Problem 17: Split a list into two parts.
  */
object Problem17 {

  def split[T](n: Int, list: List[T]): (List[T], List[T]) = {
    def splitHelper[U](n: Int, list: List[U], first: List[U]): (List[U], List[U]) = (n, list) match {
      case (0, second) => (first.reverse, second)
      case (k, h :: t) => splitHelper(k - 1, t, h :: first)
      case (k, _)      => (first.reverse, List())
    }
    splitHelper(n, list, List())
  }

}
