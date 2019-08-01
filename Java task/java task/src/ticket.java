public class ticket {
    public static void main(String[] args){
        Lottery tticket= new Lottery();
        System.out.println(tticket.result(8,7,-3));

    }
}
class Lottery{
    int result(int a, int b, int c){
        int ab = a+b;
        int bc = b+c;
        int ac = a+c;
        if(ab == 10||bc == 10||ac == 10)
            return 10;
        else if(ab - bc == 10||ab - ac == 10){
                return 5;

        }
        return 0;
    }
}