//Volume of a sphere: (4/3) × pi × r3
object lamda_test3 {
  def main(args:Array[String]): Unit ={

    print("Enter the radius as r : ")
    val r=scala.io.StdIn.readFloat()
    val result= (x:Float)=>3.14*x*x*x*4/3
    print("The volume of a sphere is : "+result(r))
  }

}
