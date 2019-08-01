package file;

import java.io.File;
import java.io.IOException;

public class file1 {
    public static void main(String args[])
    {
        try{
            File myOoj = new File("C:/Users/User/Desktop/KIT/semester 2/Java task/Java_file/text5.txt");
            if (myOoj.createNewFile()){
                System.out.println("File created:" +myOoj.getName());
            }
            else {
                System.out.println("File already exists.");
            }

           }
        catch (IOException e){
            System.out.println("An error occurred. ");
            e.printStackTrace();
            }
    }
}
