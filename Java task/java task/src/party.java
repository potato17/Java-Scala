public class party {
    public static void main (String[] args){
        Paarty pparty = new Paarty();
        System.out.println(pparty.rate(5,10));
    }
}

class Paarty{
    int rate (int tea,int candy) {
        if (tea >= 5 && tea < 10 && candy >= 5 && candy < 10)
            return 1;
        else if (tea < 5 && candy < 5) {
            return 0;
        } else if (tea >= 10 && candy >= 10)
           return 2;
          else if (tea>=5&&candy>=10){return 1;}
return 0;
    }
}