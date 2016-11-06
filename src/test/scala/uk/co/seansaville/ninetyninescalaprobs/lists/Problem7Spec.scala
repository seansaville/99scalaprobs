package uk.co.seansaville.ninetyninescalaprobs.lists

import uk.co.seansaville.ninetyninescalaprobs.UnitSpec

class Problem7Spec extends UnitSpec {

  "flatten" should "flatten a nested list structure" in {
    assert(Problem7.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) == List(1, 1, 2, 3, 5, 8))
  }

  it should "flatten an empty list into an empty list" in {
    assert(Problem7.flatten(List()) == List())
  }

}
