object Q4 {
  def isEven(n: Int): Boolean={
    if(n==0) true
    else if(n==1) false
    else isEven(n-2)
  }

  def main(args: Array[String]): Unit={
    println(isEven(13))
  }
}
