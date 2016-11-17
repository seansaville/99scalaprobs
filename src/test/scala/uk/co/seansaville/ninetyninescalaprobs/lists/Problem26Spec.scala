package uk.co.seansaville.ninetyninescalaprobs.lists

import uk.co.seansaville.ninetyninescalaprobs.UnitSpec

class Problem26Spec extends UnitSpec {

  "combinations" should "generate all combinations of K elements from a list with N elements" in {
    val testList = List(1, 2, 3, 4)
    val testCombs = List(List(1, 2, 3), List(2, 3, 4), List(1, 2, 4), List(1, 3, 4))

    // Check that the result list contains all of the combinations
    testCombs.map(e => assert(Problem26.combinations(3, testList).contains(e)))

    // Check that the result list only contains valid combinations
    assert(Problem26.combinations(3, testList).dropWhile(e => testCombs.contains(e)).isEmpty)
  }

}
