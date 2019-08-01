

object hw3 {
  def main(args: Array[String]) {
     for(i<- 1 to 5)
      println(i)
      println("\n");
    for(i<- 1 until 5)
      println(i)
      println("\n");
      for(i<- 1 until 5;j<-1 until 6)
      println(f"$i\t$j%f")
      val lst=List(1000,0,8,546,33);
     println("\n");
       for(i<- lst)
      println(i)
      println("\n")
      for(i<- lst;if i%2==0)
      println(i)
      println("\n")
       val res=for{i<- 1 until 5} yield{
         i*i
       }
      println("result="+res)
  }
}