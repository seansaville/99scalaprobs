package uk.co.seansaville.ninetyninescalaprobs.lists

import uk.co.seansaville.ninetyninescalaprobs.UnitSpec

class Problem11Spec extends UnitSpec {

  "encodeModified" should "encode a list using run-length encoding with single elements inserted " +
    "as is" in {
    assert(Problem11.encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
      == List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e)))
  }

  it should "encode an empty list into an empty list" in {
    assert(Problem11.encodeModified(List()) == List())
  }

}
