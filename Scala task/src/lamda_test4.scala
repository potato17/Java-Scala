//Volume of a cylinder:pi × r2 × Height
object lamda_test4 {

  def main(args: Array[String]): Unit = {

    print("Enter the number of radius as r : ")
    val r = scala.io.StdIn.readFloat()
    print("Enter the height as h : ")
    val h = scala.io.StdIn.readFloat()
    val result = (x:Float,y:Float)=> 3.14*x*x*y
    print("The column of a cylinder is : "+result(r,h))
  }


}
