package uk.co.seansaville.ninetyninescalaprobs.lists

/**
  * Problem 11: Modified run-length encoding.
  */
object Problem11 {

  def encodeModified[T](list: List[T]): List[Any] = {
    Problem10.encode(list).map(pair => if (pair._1 == 1) pair._2 else pair)
  }

}
