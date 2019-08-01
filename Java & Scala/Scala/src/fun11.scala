

object fun11 {
  def add(x : Int,y : Int): Int={
    return x+y;
  }
  def sub(x : Int,y : Int): Int={
   println("hello")
    x-y;
  }
   def mul(x : Int,y : Int): Int=x*y
   
   def divide(x : Int,y : Int)=x/y
   
  def main(args: Array[String]){
     println(add(30,15))
     println(sub(30,15))
     println(mul(30,15))
     println(divide(30,15))
    
  }
}