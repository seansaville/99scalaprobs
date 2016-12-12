package uk.co.seansaville.ninetyninescalaprobs.lists

/**
  * Problem 27: Group the elements of a set into disjoint subsets.
  */
object Problem27 {

  def group[T](sizes: List[Int], items: List[T]): List[List[List[T]]] = sizes match {
    case Nil     => Nil
    case k :: ks =>
      Problem26.combinations(k, items) flatMap (comb => group(ks, items diff comb) map (comb :: _))
  }

}
