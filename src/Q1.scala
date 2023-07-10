object Q1 {
  def isPrime(k: Int, divisor: Int): Boolean = {
    if (k <= 2) {
      if (k == 2) true else false
    } else {
      if (k % divisor == 0) false
      else if (divisor >= Math.sqrt(k)) true
      else isPrime(k, divisor + 1)
    }
  }

  def main(args: Array[String]): Unit={
    println(isPrime(5,2))
    println(isPrime(8,2))
  }
}
