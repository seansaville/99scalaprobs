package uk.co.seansaville.ninetyninescalaprobs.lists

import scala.util.Random

object Problem24 {

  def lotto(n: Int, m: Int): List[Int] = {
    def lottoHelper(n: Int, res: List[Int]): List[Int] = n match {
      case 0 => res
      case k => lottoHelper(k - 1, Random.nextInt(m - 1) + 1 :: res)
    }
    lottoHelper(n, List())
  }

}
