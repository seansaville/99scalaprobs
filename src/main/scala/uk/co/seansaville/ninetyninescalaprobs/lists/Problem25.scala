package uk.co.seansaville.ninetyninescalaprobs.lists

/**
  * Problem 25: Generate a random permutation of the elements of a list.
  */
object Problem25 {

  def randomPermute[T](list: List[T]): List[T] = Problem23.randomSelect(list.length, list)

}
