package uk.co.seansaville.ninetyninescalaprobs.lists

/**
  * Problem 5: Reverse a list.
  */
object Problem5 {

  def reverse[T](list: List[T]): List[T] = {
    def reverseHelper[U](original: List[U], reversed: List[U]): List[U] = original match {
      case Nil    => reversed
      case h :: t => reverseHelper(t, h :: reversed)
    }
    reverseHelper(list, List[T]())
  }

}
