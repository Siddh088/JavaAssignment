package Assignment_5;

import java.io.File;
import java.util.Scanner;
/*
8. Perform word count on f3
 */
public class Q8 {
    public static void main(String[] args) throws Exception {
        String filename = "f3.txt";
        File f = new File (filename);
        Scanner scan = new Scanner(f);
        int wordCnt = 1;
        while(scan.hasNextLine()) {
            String text = scan.nextLine();  //Taking Space as input
            for (int i = 0; i < text.length(); i++) {
                if(text.charAt(i) == ' ') {
                    wordCnt++;
                }
            }
        }System.out.println("Word count is " + wordCnt);
    }

}
