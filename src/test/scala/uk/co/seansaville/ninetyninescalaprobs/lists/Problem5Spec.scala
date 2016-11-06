package uk.co.seansaville.ninetyninescalaprobs.lists

import uk.co.seansaville.ninetyninescalaprobs.UnitSpec

class Problem5Spec extends UnitSpec {

  "reverse" should "reverse any list" in {
    assert(Problem5.reverse(List(1, 2, 3)) == List(3, 2, 1))
    assert(Problem5.reverse(List(1)) == List(1))
    assert(Problem5.reverse(List()) == List())
  }

}
