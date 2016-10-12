package uk.co.seansaville.ninetyninescalaprobs.lists

class Problem3 {

  def kthElement[T](k: Int, list: List[T]): T = (k, list) match {
    case (0, h :: _) => h
    case (n, _ :: t) => kthElement(n - 1, t)
    case (_, _)      => throw new NoSuchElementException
  }

}
