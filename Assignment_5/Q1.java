//1. Reading input from a file and displaying it in the console

package Assignment_5;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) throws IOException {
        //test file existence
        Scanner scan=new Scanner(System.in);
        System.out.println("File Name: ");
        String inFile= scan.next();
        File f = new File(inFile);
        if (f.exists()) {
            //Create file add some text inside
            System.out.println("File Exist");
            FileReader fr=new FileReader(f);
            int i=fr.read();
            while(i!= -1){
                System.out.print((char) i);
                i=fr.read();
            }
        }
        else{
            f.createNewFile();
            System.out.println("File Created");
        }
    }
}
