//the area of a trapezoid
object lamda_test2 {
  def trapezoid(b1:Float,b2:Float,h:Float, res:(Float,Float,Float)=>Double)=res(b1,b2,h)

  def main(args:Array[String]): Unit ={

    print("Enter the value of b1 : ")
    val B1=scala.io.StdIn.readFloat()
    print("Enter the value of b2: ")
    val B2=scala.io.StdIn.readFloat()
    print("Enter the height as h : ")
    val H=scala.io.StdIn.readFloat()
    val result = trapezoid(B1,B2,H,(b1,b2,h)=>(b1+b2)*h/2)
    print(f"The area of trapezoid is  : $result%.2f")

  }

}
