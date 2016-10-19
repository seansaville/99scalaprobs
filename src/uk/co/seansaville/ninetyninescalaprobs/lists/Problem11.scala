package uk.co.seansaville.ninetyninescalaprobs.lists

/**
  * Problem 11: Modified run-length encoding.
  */
class Problem11 {

  def encodeModified[T](list: List[T]): List[Any] = {
    (new Problem10).encode(list).map(pair => if (pair._1 == 1) pair._2 else pair)
  }

}
