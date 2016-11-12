package uk.co.seansaville.ninetyninescalaprobs.lists

import uk.co.seansaville.ninetyninescalaprobs.UnitSpec

class Problem24Spec extends UnitSpec {

  "lotto" should "produce a list of n random integers in the range 1 to m" in {
    for (_ <- 1 to 100) {
      val generated = Problem24.lotto(10, 100)
      generated.map {
        e => assert(e >= 1); assert(e <= 100)
      }
      assert(generated.length == 10)
    }
  }

}
