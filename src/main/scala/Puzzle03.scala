/**
  * Created by shu920921 on 2017/06/18.
  */
object Puzzle03 {
  def main(args: Array[String]): Unit ={
    val list = List.fill(100)(false)
    reverseCard(list)
  }

  //テスト用
  def reverseCard(list: List[Boolean]) ={
    var updatedList = list
    for(i <- 1 to 100){
      for(j <- i until 100 by i+1){
        updatedList = updatedList.updated(j,!updatedList(j))
      }
    }

    for(card <- updatedList.zipWithIndex){
      if(!card._1){
        println(card._2 + 1)
      }
    }
  }
}

