/**
  * Created by shu920921 on 2017/06/14.
  */
import org.scalatest._
import Puzzle02._

class Puzzle02Spec extends FlatSpec with Matchers{
  "2 + 8" should "10" in{
    Puzzle02.calc(2,"+",8) shouldEqual "10"
  }

  "2 - 8" should "-6" in{
    Puzzle02.calc(2,"-",8) shouldEqual "-6"
  }

  "2 * 8" should "16" in{
    Puzzle02.calc(2,"*",8) shouldEqual "16"
  }

  "2 / 8" should "0" in{
    Puzzle02.calc(2, "/", 8) shouldEqual "0"
  }

  "2 \"\" 8" should "28" in{
    Puzzle02.calc(2, "", 8) shouldEqual "28"
  }
}

