package uk.co.seansaville.ninetyninescalaprobs.lists

/**
  * Problem 6: Find out whether a list is a palindrome.
  */
object Problem6 {

  def isPalindrome[T](list: List[T]): Boolean = list == list.reverse

}
