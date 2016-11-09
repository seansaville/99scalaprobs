package uk.co.seansaville.ninetyninescalaprobs.lists

import uk.co.seansaville.ninetyninescalaprobs.UnitSpec

class Problem16Spec extends UnitSpec{

  "drop" should "drop every nth element of a list" in {
    assert(Problem16.drop(2, List(1, 2, 3, 4, 5, 6, 7)) == List(1, 3, 5, 7))
    assert(Problem16.drop(0, List(1, 2, 3)) == List(1, 2, 3))
    assert(Problem16.drop(1, List(1, 2, 3)) == List())
    assert(Problem16.drop(10, List()) == List())
  }

}
