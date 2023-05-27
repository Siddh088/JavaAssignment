//2. Reading input from two files and storing it in a third file
package Assignment_5;

import java.io.*;

public class Q2 {
    //Reading input from file1 to store to file3
    public static void main(String[] args) throws IOException {
        //two file as bufferreader
        BufferedReader br1=new BufferedReader(new FileReader("f1.txt"));
        BufferedReader br2=new BufferedReader(new FileReader("demo_2.txt"));
        //Write to third file
        File f=new File("demo_3.txt");
        BufferedWriter bw=new BufferedWriter(new FileWriter(f,true));
        String br1Line=br1.readLine();
        String br2Line=br2.readLine();
        while (br1Line != null){
            bw.write(br1Line);
            bw.newLine();
            br1Line=br1.readLine();
        }
        while (br2Line != null){
            bw.write(br2Line);
            bw.newLine();
           br2Line=br2.readLine();
        }
        bw.flush();
        bw.close();
        br1.close();
        br2.close();
    }
}
