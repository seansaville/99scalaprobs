package uk.co.seansaville.ninetyninescalaprobs.lists

/**
  * Problem 22: Create a list containing all integers within a given range.
  */
class Problem22 {

  def range(m: Int, n: Int): List[Int] = {
    def rangeHelper(m: Int, n: Int, result: List[Int]): List[Int] = {
      if (m < n)
        rangeHelper(m + 1, n, m :: result)
      else
        (n :: result).reverse
    }
    rangeHelper(m, n, List())
  }

}
