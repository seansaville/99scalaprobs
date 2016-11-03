package uk.co.seansaville.ninetyninescalaprobs.lists

import uk.co.seansaville.ninetyninescalaprobs.UnitSpec

class Problem1Spec extends UnitSpec {

  "last" should "return the last element of a list with at least one element" in {
    val singleElementList = List(1)
    val multiElementList = List(1, 2, 3, 4, 5)
    assert(Problem1.last(singleElementList) == 1)
    assert(Problem1.last(multiElementList) == 5)
  }

  it should "throw NoSuchElementException if the list contains no elements" in {
    assertThrows[NoSuchElementException] {
      Problem1.last(List())
    }
  }

}
