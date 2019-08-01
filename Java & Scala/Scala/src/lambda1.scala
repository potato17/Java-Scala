

object lambda1 {
  def main(args:Array[String]) 
    { 
        // list of numbers 
        val l1 = List(1, 1, 2, 3, 5, 8) 
        val l2 = List(13, 21, 34) 
      
        // reusable lambda 
        val func = (x:Int) => x * x 
  
        // squaring each element of the lists 
        val res1 = l1.map( func ) 
        val res2 = l2.map( func ) 
      
        println(res1) 
        println(res2) 
    } 
}