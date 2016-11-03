package uk.co.seansaville.ninetyninescalaprobs.lists

/**
  * Problem 21: Insert an element at a given position into a list.
  */
class Problem21 {

  def insertAt[T](item: T, pos: Int, list: List[T]): List[T] = {
    def helper[U](item: U, pos: Int, list: List[U], store: List[U]): List[U] = (pos, list) match {
      case (0, ls)     => (item :: store).reverse ++ ls
      case (k, h :: t) => helper(item, k - 1, t, h :: store)
      case (_, Nil)    => (item :: store).reverse
    }
    helper(item, pos, list, List())
  }

}
