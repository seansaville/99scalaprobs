package uk.co.seansaville.ninetyninescalaprobs.lists

import uk.co.seansaville.ninetyninescalaprobs.UnitSpec

class Problem22Spec extends UnitSpec {

  "range" should "create a list containing all integers within a given range" in {
    assert(Problem22.range(4, 9) == List(4, 5, 6, 7, 8, 9))
  }

  it should "throw IllegalArgumentException if start of range is after end of range" in {
    assertThrows[IllegalArgumentException] {
      Problem22.range(9, 4)
    }
  }

}
