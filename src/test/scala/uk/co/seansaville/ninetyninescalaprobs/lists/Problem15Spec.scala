package uk.co.seansaville.ninetyninescalaprobs.lists

import uk.co.seansaville.ninetyninescalaprobs.UnitSpec

class Problem15Spec extends UnitSpec {

  "duplicateN" should "duplicate the elements of a list N times" in {
    assert(Problem15.duplicateN(0, List(1, 2, 3)) == List())
    assert(Problem15.duplicateN(1, List(1, 2, 3)) == List(1, 2, 3))
    assert(Problem15.duplicateN(2, List(1, 2, 3)) == List(1, 1, 2, 2, 3, 3))
  }

  it should "return an empty list when given an empty list" in {
    assert(Problem15.duplicateN(0, List()) == List())
    assert(Problem15.duplicateN(3, List()) == List())
  }

}
