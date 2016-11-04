package uk.co.seansaville.ninetyninescalaprobs.lists

import uk.co.seansaville.ninetyninescalaprobs.UnitSpec

class Problem2Spec extends UnitSpec {

  "penultimate" should "return the last-but-one element of a list with more than 1 element" in {
    assert(Problem2.penultimate(List(1, 2, 3)) == 2)
  }

  it should "throw NoSuchElementException if the list contains one element" in {
    assertThrows[NoSuchElementException] {
      Problem2.penultimate(List(1))
    }
  }

  it should "throw NoSuchElementException if the list contains zero elements" in {
    assertThrows[NoSuchElementException] {
      Problem2.penultimate(List())
    }
  }

}
