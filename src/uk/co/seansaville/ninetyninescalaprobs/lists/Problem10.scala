package uk.co.seansaville.ninetyninescalaprobs.lists

/**
  * Problem 10: Run-length encoding of a list.
  */
class Problem10 {

  def encode[T](list: List[T]): List[(Int, T)] = {
    (new Problem9).pack(list).map((list: List[T]) => (list.size, list.head))
  }

}
