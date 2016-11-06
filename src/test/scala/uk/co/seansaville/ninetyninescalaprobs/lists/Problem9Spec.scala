package uk.co.seansaville.ninetyninescalaprobs.lists

import uk.co.seansaville.ninetyninescalaprobs.UnitSpec

class Problem9Spec extends UnitSpec {

  "pack" should "pack consecutive duplicates of list elements into sublists" in {
    assert(Problem9.pack(List('a, 'a, 'a, 'a, 'b, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
      == List(List('a, 'a, 'a, 'a), List('b), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
  }

  it should "pack an empty list into an empty list" in {
    assert(Problem9.pack(List()) == List())
  }

}
