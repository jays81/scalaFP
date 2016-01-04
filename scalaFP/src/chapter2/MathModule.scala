package chapter2

object MathModule {
  def abs(n:Int):Int = {
    if(n<0) -n
    else n
  }
  
  private def formatAbs(x:Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }
  
  def fibonacci(n:Int):Int = {
    def go(n:Int, previous: Int, current:Int):Int = n match {
      case 0  => previous
      case _  => go(n-1, current, current + previous)
     
    }
     go(n, 0, 1)
  }
  
  private def formatFibonacci(x:Int) = {
    val msg = "The %dth fibonnaci number is %d"
    msg.format(x, fibonacci(x))
  }
  
  def main(args:Array[String]):Unit = {
    println(formatAbs(-42))
    println(formatFibonacci(10))
    
  }
  
}