package uk.co.seansaville.ninetyninescalaprobs.lists

import uk.co.seansaville.ninetyninescalaprobs.UnitSpec

class Problem18Spec extends UnitSpec {

  "slice" should "extract a slice from a list" in {
    assert(Problem18.slice(2, 4, List(0, 1, 2, 3, 4, 5)) == List(2, 3))
    assert(Problem18.slice(1, 3, List(0, 1, 2)) == List(1, 2))
    assert(Problem18.slice(10, 12, List(1, 2, 3)) == List())
    assert(Problem18.slice(1, 10, List()) == List())
  }

}
