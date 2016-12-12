package uk.co.seansaville.ninetyninescalaprobs.lists

import uk.co.seansaville.ninetyninescalaprobs.UnitSpec

class Problem28Spec extends UnitSpec {

  "lsort" should "sort a list of lists according to their lengths" in {
    val testList = List(List(1, 2, 3), List(1), List(1, 2), List(1, 2, 3, 4))
    assert(Problem28.lsort(testList) == List(List(1), List(1, 2), List(1, 2, 3), List(1, 2, 3, 4)))
  }

  "lsortFreq" should "sort a list of lists according to the frequency of their lengths" in {
    val testList = List(List(2, 2), List(1), List(3, 3, 3), List(2, 2), List(3, 3, 3), List(3, 3, 3))
    assert(Problem28.lsortFreq(testList) ==
      List(List(1), List(2, 2), List(2, 2), List(3, 3, 3), List(3, 3, 3), List(3, 3, 3)))
  }

}
