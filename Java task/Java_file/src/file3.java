import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class file3 {
    public static void main(String[] args)
    {
        try{
            File myobj= new File("text1.txt");
            Scanner myReader = new Scanner(myobj);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }
        catch
    }
}
