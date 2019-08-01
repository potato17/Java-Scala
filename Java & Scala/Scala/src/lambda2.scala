

object lambda2 {
  def transform( b:Int, t:Int, rec:(Int,Int) => Int)  = rec(b,t)
  
    // Main method 
    def main(args:Array[String]) 
    { 

        // lambda is passed to f:Int => Double 
        val res = transform(20,10,(b,t)=>b*t)
  
        println(res) 
} 
}