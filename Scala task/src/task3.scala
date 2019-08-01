//find maximum of 3 num
object task3 {
  def main (args: Array[String]){
    print("Please input the first number : ")
    val a = scala.io.StdIn.readInt()
    print("Please input the second number :")
    val b = scala.io.StdIn.readInt()
    print("Please input the third number : ")
    val c = scala.io.StdIn.readInt()
    if (a==b==c){
      print(f"all the three number are equal so the maximum integer is $a%d")
    }
    else if (a>b)
    {
      if(a>c)
      {
        println(f"the maximum number is : $a%d")
      }
      else if (a<c)
      {
        println(f"the maximum number is : $c%d")
      }
    }
    else if (b>c)
    {
      if (b>a)
        println(f"the maximum number is  : $b%d")
      else if (b<a)
        println(f"the maximum number is : $a%d")
    }

  }


}
