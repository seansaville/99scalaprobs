package uk.co.seansaville.ninetyninescalaprobs.lists

import uk.co.seansaville.ninetyninescalaprobs.UnitSpec

class Problem6Spec extends UnitSpec {

  "isPalindrome" should "return true if the list is a palindrome" in {
    assert(Problem6.isPalindrome(List(1, 2, 1)))
  }

  it should "return true if the list is empty or has one element" in {
    assert(Problem6.isPalindrome(List()))
    assert(Problem6.isPalindrome(List(1)))
  }

  it should "return false if the list is not a palindrome" in {
    assert(!Problem6.isPalindrome(List(1, 2, 3)))
  }

}
