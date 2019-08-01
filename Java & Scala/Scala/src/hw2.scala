

object hw2 {
  def main(args: Array[String]) {
    val x = 21
    var res = "";
    if (x == 20) {
      res = "x==20";
    } else {
      res = "x!=20";
    }
    println(res);
     println(if (x == 20) "x==20" else "x!=20");
      }
}