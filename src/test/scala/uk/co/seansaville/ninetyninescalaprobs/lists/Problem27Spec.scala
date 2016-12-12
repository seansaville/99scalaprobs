package uk.co.seansaville.ninetyninescalaprobs.lists

import uk.co.seansaville.ninetyninescalaprobs.UnitSpec

class Problem27Spec extends UnitSpec {

  "groups" should "group the elements of a set into disjoint subsets" in {
    val testList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val sizes = List(1, 2, 3, 4)
    val groups = Problem27.group(sizes, testList)

    // Check that the sets in each grouping can be intersected to get the original list
    assert(groups.map(_.reduceLeft(_ ++ _)).forall(_.equals(testList)))

    // Check that each disjoint subset is one of the sizes that we specified
    groups.map(_.map(e => assert(sizes.contains(e.length))))
  }

}
