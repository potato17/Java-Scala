//s = ut + ½ at2
object lamda_test1 {
  def distant( speed:Float, changes :Float, dur:Float, dis:(Float,Float,Float) => Double) =dis(speed,changes,dur)

    def main(args: Array[String]){
      print("Enter the speed as v :")
      val v=  scala.io.StdIn.readFloat()
      print("Enter the changes in speed as a : ")
      val a= scala.io.StdIn.readFloat()
      print("Enter the duration as t :")
      val t = scala.io.StdIn.readFloat()
      val result = distant(v,a,t,(speed,changes,dur)=>speed*dur+0.5*changes*dur*dur)
      print(f"This is the result of constant acceleration : $result%f ")
    }

}