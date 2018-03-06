object Puzzle01 {
  def main(args: Array[String]): Unit = {
    val numList = (10 to 1000).toList
    val answer = numList.filter(palindrome)
    println(answer.head)

  }

  def palindrome(i: Int): Boolean = {
    // 10進数で回文が成立するか
    val dec = i.toString.toList
    val decRev = dec.reverse
    val decMatches: Boolean = dec == decRev
    val bin = i.toBinaryString.toList
    val binRev = bin.reverse
    val binMatches: Boolean = bin == binRev
    val oct = i.toOctalString.toList
    val octRev = oct.reverse
    val octMatches: Boolean = oct == octRev
    decMatches && binMatches && octMatches
  }
}
