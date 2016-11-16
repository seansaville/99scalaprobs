package uk.co.seansaville.ninetyninescalaprobs.lists

import uk.co.seansaville.ninetyninescalaprobs.UnitSpec

class Problem25Spec extends UnitSpec {

  "randomPermute" should "generate a random permutation of the elements of a list" in {
    for (_ <- 1 to 100) {
      val list = Problem24.lotto(100, 1000)
      assert(list.sorted == Problem25.randomPermute(list).sorted)
    }
    assert(Problem25.randomPermute(List()) == List())
  }

}
