package uk.co.seansaville.ninetyninescalaprobs.lists

import uk.co.seansaville.ninetyninescalaprobs.UnitSpec

class Problem3Spec extends UnitSpec {

  "kthElement" should "return the kth element of a list with more than k elements" in {
    assert(Problem3.kthElement(3, List(0, 1, 2, 3, 4)) == 3)
  }

  it should "throw NoSuchElementException if the list has less than k elements" in {
    assertThrows[NoSuchElementException] {
      Problem3.kthElement(4, List(0, 1))
    }
  }

  it should "throw NoSuchElementException if k is less than zero" in {
    assertThrows[NoSuchElementException] {
      Problem3.kthElement(-1, List(1,2))
    }
  }

}
