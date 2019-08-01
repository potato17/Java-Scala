//find the average value
object task1 {
    def main(args: Array[String]) {
      println("enter the first item weight : ")
      val x = scala.io.StdIn.readFloat()
      println("Enter the number of first item purchases : ")
      val numx = scala.io.StdIn.readFloat()
      println("enter the second item weight : ")
      val y = scala.io.StdIn.readFloat()
      println("Enter the number of second item purchases : ")
      val numy = scala.io.StdIn.readFloat()
      val sum:Double = (x*numx+y*numy)/(numx+numy)
       println(f"the average value of the item is :  $sum%f ")
    }
}
