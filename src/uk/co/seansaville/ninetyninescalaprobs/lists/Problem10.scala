package uk.co.seansaville.ninetyninescalaprobs.lists

/**
  * Problem 10: Run-length encoding of a list.
  */
class Problem10 {

  def encode[T](list: List[T]): List[(Int, T)] = {
    val packer = new Problem9()
    packer.pack(list).map((list: List[T]) => (list.size, list.head))
  }

}
