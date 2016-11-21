package uk.co.seansaville.ninetyninescalaprobs.lists

object Problem26 {

  /*
   * Cheaty solution using built-in Set methods.
   */
  def combinations[T](k: Int, list: List[T]): List[List[T]] = {
    list.toSet.subsets(k).map(_.toList).toList
  }

}
