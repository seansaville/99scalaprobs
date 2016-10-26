package uk.co.seansaville.ninetyninescalaprobs.lists

/**
  * Problem 16: Drop every Nth element from a list.
  */
class Problem16 {

  def drop[T](n: Int, list: List[T]): List[T] = {
    def dropHelper[U](k: Int, n: Int, list: List[U], result: List[U]): List[U] = list match {
      case h :: t =>
        if (k == n)
          dropHelper(1, n, t, result)
        else
          dropHelper(k + 1, n, t, h :: result)
      case _      => result.reverse
    }
    dropHelper(1, n, list, List())
  }

}
