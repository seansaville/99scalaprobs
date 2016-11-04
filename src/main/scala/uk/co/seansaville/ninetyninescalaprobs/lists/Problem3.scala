package uk.co.seansaville.ninetyninescalaprobs.lists

/**
  * Problem 3: Find the Kth element of a list.
  */
object Problem3 {

  def kthElement[T](k: Int, list: List[T]): T = (k, list) match {
    case (0, h :: _) => h
    case (n, _ :: t) => kthElement(n - 1, t)
    case (_, _)      => throw new NoSuchElementException
  }

}
