package uk.co.seansaville.ninetyninescalaprobs.lists

import uk.co.seansaville.ninetyninescalaprobs.UnitSpec

class Problem10Spec extends UnitSpec {

  "encode" should "encode a list using run-length encoding" in {
    assert(Problem10.encode(List('a, 'a, 'b, 'c, 'c, 'a, 'd, 'e, 'e))
      == List((2,'a), (1,'b), (2,'c), (1,'a), (1,'d), (2,'e)))
  }

  it should "encode an empty list into an empty list" in {
    assert(Problem10.encode(List()) == List())
  }

}
