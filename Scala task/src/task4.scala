//convertion to year month and days
object task4 {
  def main(args: Array[String]){
    print("enter number of days you would like to convert : ")
    val a = scala.io.StdIn.readInt()

    val year=a/365
    //remain is the numbers of days that is left after calculated as year
    val remain = a%365
    val months = remain/30
    val days = remain%30
    print(f"the convertion of $a%d days = \n $year%d year \n $months%d months \n $days%d days")
  }

}
