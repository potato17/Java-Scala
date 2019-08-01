import java.util.Scanner;
public class object {
    public static  void main(String args [])
    {
        //Using scanner for getting input from user
        Scanner in = new Scanner(System.in);

        String s= in.next();
        System.out.println("You entered string " + s);

        int a = in.nextInt ();
        System.out.println("You entered integer " +a );

    }
}
