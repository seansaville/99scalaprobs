package uk.co.seansaville.ninetyninescalaprobs.lists

import uk.co.seansaville.ninetyninescalaprobs.UnitSpec

class Problem12Spec extends UnitSpec {

  "decode" should "decode a run-length encoded list" in {
    assert(Problem12.decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
      == List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  }

  it should "decode an empty list into an empty list" in {
    assert(Problem12.decode(List()) == List())
  }

}
