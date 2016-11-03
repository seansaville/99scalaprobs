package uk.co.seansaville.ninetyninescalaprobs.lists

/**
  * Problem 13: Run-length encoding of a list (direct solution).
  */
class Problem13 {

  def encodeDirect[T](list: List[T]): List[(Int, T)] = {
    def encoder(list: List[T], res: List[(Int, T)], count: Int, curr: T): List[(Int, T)] = {
      list match {
        case h :: t =>
          if (h == curr)
            encoder(t, res, count + 1, h)
          else
            encoder(t, (count, curr) :: res, 1, h)
        case _      => (count, curr) :: res
      }
    }

    if (list.nonEmpty)
      encoder(list, List(), 0, list.head).reverse
    else
      List()
  }

}
