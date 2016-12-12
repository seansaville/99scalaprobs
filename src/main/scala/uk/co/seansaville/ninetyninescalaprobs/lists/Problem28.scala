package uk.co.seansaville.ninetyninescalaprobs.lists

import scala.collection.mutable

/**
  * Problem 28: Sort a list of lists using different orderings.
  */
object Problem28 {

  /**
    * Sort a list of lists according to length of sublists.
    */
  def lsort[T](ls: List[List[T]]): List[List[T]] = ls sortBy(_.length)

  /**
    * Sort a list of lists according to length frequency (least common lengths first).
    */
  def lsortFreq[T](ls: List[List[T]]): List[List[T]] = {
    var frequencies: mutable.Map[Int, Int] = mutable.Map()
    ls.foreach(l => frequencies.get(l.length) match {
      case None => frequencies += (l.length -> 1)
      case Some(n) => frequencies += (l.length -> (n + 1))
    })

    ls sortWith((a, b) => frequencies.getOrElse(a.length, 0) < frequencies.getOrElse(b.length, 0))
  }

}
