object Puzzle01 {
  def main(args: Array[String]): Unit ={
    for(answer <- 11 to 10000 by 2){
      val numList = answer.toString.toList
      val numReverseList = numList.reverse
      val binaryNum = answer.toBinaryString
      val binaryNumList = binaryNum.toList
      val binaryNumReverseList = binaryNumList.reverse
      val octalNum = answer.toOctalString
      val octalNumList = octalNum.toList
      val octalNumReverseList = octalNumList.reverse
      if((numList == numReverseList) &&
        (binaryNumList == binaryNumReverseList) &&
        (octalNumList == octalNumReverseList)){
        println("answer: " + answer)
      }
    }
  }
}
