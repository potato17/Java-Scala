//print id and salary per month
object task2 {
  def main(args:Array[String]){
    println("Enter your id : ")
    val a =scala.io.StdIn.readInt()
    println("Enter your salary per hour : ")
    val b = scala.io.StdIn.readFloat()
    println("The id of the employee is : "+a)
    //in one day there are 24 hours and 31 days a month
    print(f"The salary per month is : ${b*24*31}%.2f")
  }
}
