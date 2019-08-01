import java.util.Scanner;
public class input{
    public static void main(String[] args)

    {
        Scanner myname = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = myname.nextLine();
        System.out.println("This is your name :" +name);
    }

}
