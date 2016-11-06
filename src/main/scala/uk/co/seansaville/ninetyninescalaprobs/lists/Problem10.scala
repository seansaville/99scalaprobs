package uk.co.seansaville.ninetyninescalaprobs.lists

/**
  * Problem 10: Run-length encoding of a list.
  */
object Problem10 {

  def encode[T](list: List[T]): List[(Int, T)] = {
    Problem9.pack(list).map((list: List[T]) => (list.size, list.head))
  }

}
