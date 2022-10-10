package lectures.basics

import scala.annotation.tailrec

object Functions extends App {
  def myFirstFunc(a:String,b:Int): String = (
      a + " " + b
    )
  println(myFirstFunc("hey",5))

  def repeatingFunc(wordToRep:String, reps:Int): String = (
    if (reps == 1) wordToRep
    else wordToRep + repeatingFunc(wordToRep=wordToRep, reps=reps-1)
  )
  println(repeatingFunc(wordToRep = "hello", reps = 4))

  // tasks
  //1 greeting
  def greetingFunc(name:String, age:Int): Unit = (
    println("Hi, my name is "+name+" and I am "+age+" years old")
  )
  greetingFunc("Denis", 28)
  //2 factorial
  def factorial(n:Int):Int = (
    if (n < 1) 1
    else n * factorial(n-1)
  )
  println(factorial(n=3))
  //3 fibonacci
//  @tailrec
  def fib(n:Int):Int=(
    if (n<=2) 1
    else fib(n-1) + fib(n-2)
  )
  println(fib(8))
  //4 test if a number is prime
  def isPrime(n:Int):Boolean = {
      def isPrimeUntil(t: Int): Boolean =
        (if (t <= 1) true
          else n % t != 0 && isPrimeUntil(t-1))

      isPrimeUntil(n/2)
    }

    println(isPrime(8))

}
