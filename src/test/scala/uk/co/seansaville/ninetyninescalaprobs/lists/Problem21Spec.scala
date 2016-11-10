package uk.co.seansaville.ninetyninescalaprobs.lists

import uk.co.seansaville.ninetyninescalaprobs.UnitSpec

class Problem21Spec extends UnitSpec {

  "insertAt" should "insert an element at a given position in a list" in {
    assert(Problem21.insertAt('new, 1, List('a, 'b, 'c, 'd)) == List('a, 'new, 'b, 'c, 'd))
    assert(Problem21.insertAt(1, 0, List(2, 3)) == List(1, 2, 3))
    assert(Problem21.insertAt(1, 10, List(2, 3)) == List(2, 3, 1))
  }

}
