package uk.co.seansaville.ninetyninescalaprobs.lists

import uk.co.seansaville.ninetyninescalaprobs.UnitSpec

class Problem4Spec extends UnitSpec {

  "length" should "return the length of any list" in {
    assert(Problem4.length(List(1, 2, 3)) == 3)
    assert(Problem4.length(List()) == 0)
  }

}
