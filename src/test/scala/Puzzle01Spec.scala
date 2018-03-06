import org.scalatest.{FlatSpec, Matchers}

class Puzzle01Spec extends FlatSpec with Matchers{
  "11" should "当てはまらない" in {
    Puzzle01.palindrome(11) shouldEqual false
  }
  "585" should "当てはまる" in {
    Puzzle01.palindrome(585) shouldEqual true
  }
}
