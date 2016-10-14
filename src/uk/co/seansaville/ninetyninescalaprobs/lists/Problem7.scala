package uk.co.seansaville.ninetyninescalaprobs.lists

/**
  * Problem 7: Flatten a nested list structure.
  */
class Problem7 {

  def flatten(list: List[Any]): List[Any] = list flatMap {
    case ls: List[_] => flatten(ls)
    case x           => List(x)
  }

}
