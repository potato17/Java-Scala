// usage of currying fnction
object currying {
  def add(x:Int,y:Int)=x+y
  def add2(x:Int)=(y:Int)=>x+y
  def add3(x:Int)(y:Int)=x+y
  def main(args:Array[String]): Unit ={
    println(add(23,35))
    println(add2(23)(45))
    println(add3(23)(55))
    //other way to use the function
    //ADD2
    val sum=add2(23)
    println(sum(45))//right here after taking the parameter of x then the next value is y
    //ADD3
    val sum1= add3(23)_ //if use the function like this in type ADD3 underscore is needed to take another parameter or else it doesn't know the other exist
    println(sum1(55))
  }
}
