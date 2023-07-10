
object Q2 {
  def primeSeq(n: Int): Unit = {
    def isPrime(k: Int, divisor: Int): Boolean = {
      if (k <= 2) {
        if (k == 2) true else false
      } else {
        if (k % divisor == 0) false
        else if (divisor >= Math.sqrt(k)) true
        else isPrime(k, divisor + 1)
      }
    }

    def printPrimes(k: Int): Unit = {
      if (k < n) {
        if (isPrime(k, 2)) println(k)
        printPrimes(k + 1)
      }
    }
    printPrimes(2)
  }
  def main(args:Array[String]): Unit={
    primeSeq(10)
  }

}
