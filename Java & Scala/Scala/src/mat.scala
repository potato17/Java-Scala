

object mat {
  def main(args: Array[String]) {
val age=100;
age match{
  case 20 => println(age)
  case 30 => println(age)
  case 40 => println(age)
  case 101 => println(age)
  case _=>println("invalid");  
}
var result=age match{
  case 20 => age
  case 30 => age
  case 40 => age
  case 101 => age
  case _=>"invalid";  
}
println("result="+result)
  }
   var i=4;
  i match{
    case 1 | 3 |5 |7 | 9 =>println("odd")
    case 2 | 4 | 6 | 8 =>println("even")
  }
}
