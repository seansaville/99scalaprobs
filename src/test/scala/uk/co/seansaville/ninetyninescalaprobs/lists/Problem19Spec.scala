package uk.co.seansaville.ninetyninescalaprobs.lists

import uk.co.seansaville.ninetyninescalaprobs.UnitSpec

class Problem19Spec extends UnitSpec {

  "rotate" should "rotate a list N places to the left when N is positive" in {
    assert(Problem19.rotate(3, List('a, 'b, 'c, 'd, 'e, 'f)) == List('d, 'e, 'f, 'a, 'b, 'c))
    assert(Problem19.rotate(4, List(1, 2)) == List(1, 2))
  }

  it should "rotate a list N places to the right when N is negative" in {
    assert(Problem19.rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f)) == List('e, 'f, 'a, 'b, 'c, 'd))
    assert(Problem19.rotate(-4, List(1, 2)) == List(1, 2))
  }

  it should "rotate an empty list to an empty list" in {
    assert(Problem19.rotate(19, List()) == List())
  }

}
