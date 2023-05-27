/*
20.List all '.java' files present in a directory
 */
package Assignment_5;

import java.io.File;
import java.io.IOException;

public class Q20 {
    public static void main(String[] args) throws IOException {
        File f = new File("E:\\Java\\IBrainIDEA\\JavaDBDA\\src\\Assignment_5");
        String[] files=f.list();
        for (String s:files){
            System.out.println(s);
        }
    }
}
