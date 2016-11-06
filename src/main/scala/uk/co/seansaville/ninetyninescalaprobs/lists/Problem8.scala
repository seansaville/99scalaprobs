package uk.co.seansaville.ninetyninescalaprobs.lists

/**
  * Problem 8: Eliminate consecutive duplicates of list elements.
  */
object Problem8 {

  def compress[T](list: List[T]): List[T] = {
    def compressHelper(list: List[T], currentItem: T): List[T] = list match {
      case h :: t =>
        if (h == currentItem)
          compressHelper(t, currentItem)
        else
          h :: compressHelper(t, h)
      case _      => list
    }

    list match {
      case h :: t => h :: compressHelper(list, h)
      case _      => list
    }
  }

}
