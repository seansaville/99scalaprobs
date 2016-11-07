package uk.co.seansaville.ninetyninescalaprobs.lists

/**
  * Problem 12: Decode a run-length encoded list.
  */
object Problem12 {

  def decode[T](list: List[(Int, T)]): List[T] = list flatMap (pair => List.fill(pair._1)(pair._2))

}
