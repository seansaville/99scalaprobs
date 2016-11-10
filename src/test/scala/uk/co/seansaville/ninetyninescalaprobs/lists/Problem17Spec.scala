package uk.co.seansaville.ninetyninescalaprobs.lists

import uk.co.seansaville.ninetyninescalaprobs.UnitSpec

class Problem17Spec extends UnitSpec {

  "split" should "split a list into two parts at the given index" in {
    assert(Problem17.split(3, List('a, 'b, 'c, 'd, 'e, 'f)) == (List('a, 'b, 'c),List('d, 'e, 'f)))
    assert(Problem17.split(5, List(1, 2, 3)) == (List(1, 2, 3), List()))
    assert(Problem17.split(0, List(1, 2, 3)) == (List(), List(1, 2, 3)))
    assert(Problem17.split(1, List()) == (List(), List()))
  }

}
