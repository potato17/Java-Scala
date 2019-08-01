public class vacation {
    public static void main(String[] args){
        Alarm alarm= new Alarm();
        System.out.println(alarm.vvacation(1,false));

    }
}

class Alarm{
    String vvacation(int day, boolean vacation){
        if(vacation==true)
            return "off";
        else if(vacation!=true){
            if(day>=1&&day<6)
                return "7:00";
            else if (day==0||day==6)
                return "10:00";

        }
return "hi";
    }
}