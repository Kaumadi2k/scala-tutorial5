object Q5 {
  def evenSum(n: Int): Int={
    if(n<=0) 0
    else{
      val num = if (n % 2 == 0) n else n - 2
      num + evenSum(n - 1)
    }
  }

  def main(args:Array[String]):Unit={
    println(evenSum(4))
  }
}
