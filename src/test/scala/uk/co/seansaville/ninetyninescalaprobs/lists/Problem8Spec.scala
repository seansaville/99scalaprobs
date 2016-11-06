package uk.co.seansaville.ninetyninescalaprobs.lists

import uk.co.seansaville.ninetyninescalaprobs.UnitSpec

class Problem8Spec extends UnitSpec {

  "compress" should "eliminate consecutive duplicates of list elements" in {
    assert(Problem8.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
      == List('a, 'b, 'c, 'a, 'd, 'e))
  }

  it should "compress an empty list into an empty list" in {
    assert(Problem8.compress(List()) == List())
  }

}
