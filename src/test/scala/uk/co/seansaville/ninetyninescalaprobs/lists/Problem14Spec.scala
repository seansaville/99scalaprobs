package uk.co.seansaville.ninetyninescalaprobs.lists

import uk.co.seansaville.ninetyninescalaprobs.UnitSpec

class Problem14Spec extends UnitSpec {

  "duplicate" should "duplicate all elements of a non-empty list" in {
    assert(Problem14.duplicate(List('a, 'b, 'c, 'c)) == List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c))
  }

  it should "return an empty list if the list is empty" in {
    assert(Problem14.duplicate(List()) == List())
  }

}
