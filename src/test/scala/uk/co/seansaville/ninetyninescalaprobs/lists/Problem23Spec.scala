package uk.co.seansaville.ninetyninescalaprobs.lists

import uk.co.seansaville.ninetyninescalaprobs.UnitSpec

class Problem23Spec extends UnitSpec {

  "randomSelect" should "extract a given number of random elements from a list" in {
    val testList = List(1, 2, 3, 4, 5)
    Problem23.randomSelect(2, testList).map(e => assert(testList.contains(e)))
  }

  it should "return all of the elements if called with n >= list.length" in {
    val testList = List(1, 2, 3, 4, 5)
    assert(Problem23.randomSelect(5, testList).sorted == testList)
  }

  it should "return the empty list if called with an empty list" in {
    assert(Problem23.randomSelect(5, List()) == List())
    assert(Problem23.randomSelect(0, List()) == List())
  }

}
