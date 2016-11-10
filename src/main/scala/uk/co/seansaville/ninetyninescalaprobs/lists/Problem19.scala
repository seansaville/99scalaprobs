package uk.co.seansaville.ninetyninescalaprobs.lists

/**
  * Problem 19: Rotate a list N places to the left.
  */
object Problem19 {

  def rotate[T](n: Int, list: List[T]): List[T] = {
    def rotateHelper[U](n: Int, list: List[U], temp: List[U]): List[U] = (n, list) match {
      case (0, ls)     => ls ++ temp.reverse
      case (k, h :: t) => rotateHelper(k - 1, t, h :: temp)
      case (k, Nil)    => rotateHelper(k - 1, temp, List())
    }

    if (n < 0)
      rotateHelper((list.length + n) % list.length, list, List())
    else
      rotateHelper(n, list, List())
  }

}
