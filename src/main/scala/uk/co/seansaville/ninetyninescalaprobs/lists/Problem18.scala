package uk.co.seansaville.ninetyninescalaprobs.lists

/**
  * Problem 18: Extract a slice from a list.
  */
object Problem18 {

  def slice[T](i: Int, k: Int, list: List[T]): List[T] = {
    def sliceHelper[U](a: Int, b: Int, ls: List[U], result: List[U]): List[U] = (a, b, ls) match {
      case (0, 1, h :: t) => (h :: result).reverse
      case (0, n, h :: t) => sliceHelper(0, n - 1, t, h :: result)
      case (0, _, _)      => result.reverse
      case (m, n, h :: t) => sliceHelper(m - 1, n - 1, t, result)
      case (_, _, _)      => result.reverse
    }
    sliceHelper(i, k, list, List())
  }

}
