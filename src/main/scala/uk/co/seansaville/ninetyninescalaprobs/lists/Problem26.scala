package uk.co.seansaville.ninetyninescalaprobs.lists

/**
  * Problem 26: Generate the combinations of K distinct objects chosen from the N elements of a
  * list.
  */
object Problem26 {

  /*
   * Less cheaty solution.
   */
  def combinations[T](k: Int, list: List[T]): List[List[T]] = {
    def combinationsAcc(k: Int, list: List[T], res: List[List[T]]): List[List[T]] = {
      if (list.length == k)
        List(list) ++ res
      else
        list match {
          case h :: t =>
            // Get all the combinations that include h
            val newCombs = combinationsAcc(k - 1, t, List()).map(e => h :: e)
            // Then carry on to find all the combinations that don't include h
            combinationsAcc(k, t, newCombs ++ res)
          case _      => res
        }
    }

    if (k < list.length)
      combinationsAcc(k, list, List())
    else
      List()
  }

  /*
   * Cheaty solution using built-in Set methods.
   */
  def combinations2[T](k: Int, list: List[T]): List[List[T]] = {
    list.toSet.subsets(k).map(_.toList).toList
  }

}
