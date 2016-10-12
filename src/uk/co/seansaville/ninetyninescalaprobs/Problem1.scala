package uk.co.seansaville.ninetyninescalaprobs

import com.sun.javaws.exceptions.InvalidArgumentException

class Problem1 {

  def last[T](list: List[T]): T = list match {
    case h :: Nil => h
    case h :: t   => last(t)
    case Nil      => throw new NoSuchElementException
  }

}
