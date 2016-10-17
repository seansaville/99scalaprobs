package uk.co.seansaville.ninetyninescalaprobs.lists

/**
  * Problem 9: Pack consecutive duplicates of list elements into sublists.
  */

class Problem9 {

  def pack[T](list: List[T]): List[List[T]] = {
    def packHelper[U](list: List[U], res: List[List[U]], pack: List[U], curr: U): List[List[U]] = {
      list match {
        case h :: t =>
          if (h == curr)
            packHelper(t, res, h :: pack, h)
          else
            packHelper(t, pack :: res, List(h), h)
        case _      => (pack :: res).reverse
      }
    }

    if (list.nonEmpty)
      packHelper(list, List(), List(), list.head)
    else
      List()
  }

}