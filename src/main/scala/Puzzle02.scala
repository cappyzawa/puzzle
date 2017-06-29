/**
  * Created by shu920921 on 2017/06/15.
  */
object Puzzle02 {

  def main(args: Array[String]) = {

    val opList = List("*", "")
    for(answer <- 1000 until 10000){
      val answerList = answer.toString.toList
      for(op1 <- 0 until opList.size){
        for(op2 <- 0 until opList.size){
          for(op3 <- 1 until opList.size){
            val first = calc(answerList(3).toInt, opList(op1), answerList(2).toInt)
            val second = calc(first.toInt, opList(op2),answerList(1).toInt)
            val result = calc(second.toInt, opList(op3), answerList(0).toInt)
            if(answer.toString.reverse == result){
              println("answer: " + answer)
            }
          }
        }
      }
    }

  }

  def calc(arg1: Int, op: String, arg2: Int): String = {

    op match {
      case "+" => (arg1 + arg2).toString
      case "-" => (arg1 - arg2).toString
      case "*" => (arg1 * arg2).toString
      case "/" => (arg1 / arg2).toString
      case "" => arg1.toString + arg2.toString
    }

  }
}
