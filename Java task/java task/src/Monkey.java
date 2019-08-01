public class Monkey {
    public static void main(String[] args){

        Mmonkey monkey=new Mmonkey();
        System.out.println(monkey.mmonkey(true ,false));
    }}

class Mmonkey{
    boolean mmonkey(boolean asmile, boolean bsmile){
    if(asmile&&bsmile){
        return true;}
     else if (!asmile&&!bsmile) {
     return true;
    }
     else if (!asmile&&bsmile){
         return false;
    } else if (asmile && !bsmile) {

         return false;
    }
        return false;
}}
