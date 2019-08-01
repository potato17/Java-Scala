import java.io.File;
public class file2 {
    public static void main(String args[])
    {
        File myObj =new File("text1.txt");
       if (myObj.exists()){
           System.out.println("File name: "+myObj.getName());
           System.out.println("absolute path: "+myObj.getAbsolutePath());
           System.out.println("Writable: "+myObj.canWrite());
           System.out.println("Readable: "+myObj.canRead());
           System.out.println("File size in bytes "+myObj.length());
       }
       else {
           System.out.println("The file does not exist.");
       }
    }
}
