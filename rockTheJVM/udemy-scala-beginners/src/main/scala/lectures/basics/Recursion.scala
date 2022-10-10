package lectures.basics

import scala.annotation.tailrec

object Recursion extends App {
// 1. string concat using tail rec
@tailrec
def stringRepeat(stringToRepeat:String, reps:Int, tail:String): String =
  if (reps == 1) tail + stringToRepeat
  else stringRepeat(
    stringToRepeat = stringToRepeat,
    reps = reps - 1,
    tail = tail + stringToRepeat)

println(stringRepeat("hello", 4, ""))
// 2. is prime

@tailrec
def isPrime(n: Int, currentDiv: Int):Boolean =
    if (currentDiv > n/2) true
    else (
       if (n%currentDiv ==0) false
       else isPrime(n, currentDiv + 1)
      )
println(isPrime(n=73, 2))
// 3. fibonacci
//@tailrec
def fib(n: Int): Int = {
    @tailrec
    def fibAccum(c:Int, n1:Int, n2:Int):Int = (
        if (c >= n) n1
        else fibAccum(c + 1, n1 + n2, n1)
      )
    if (n<=2) 1
    else fibAccum(2, 1, 1)
    }
println(fib(5)) // 1 1 2 3 5 8 13 21
println(fib(3))
println(fib(8))
}
