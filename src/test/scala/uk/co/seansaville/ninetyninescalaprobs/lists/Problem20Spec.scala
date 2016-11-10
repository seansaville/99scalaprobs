package uk.co.seansaville.ninetyninescalaprobs.lists

import uk.co.seansaville.ninetyninescalaprobs.UnitSpec

class Problem20Spec extends UnitSpec {

  "removeAt" should "remove the kth element from a list" in {
    assert(Problem20.removeAt(2, List(1, 2, 3, 4)) == (List(1, 2, 4), 3))
    assert(Problem20.removeAt(0, List(1)) == (List(), 1))
  }

  it should "throw NoSuchElementException if the element does not exist" in {
    assertThrows[NoSuchElementException] {
      Problem20.removeAt(3, List(1, 2))
    }
  }

}
