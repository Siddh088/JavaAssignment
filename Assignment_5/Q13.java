package Assignment_5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
13.. Write a program to calculate the cube & Square using pameterised
constructor using BufferedReader class object.
 */
import java.lang.Math;
public class Q13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("input.txt"));
        String line=br.readLine();
        while (line!=null){
            int x=Integer.parseInt(line);   //Convert String to integer
            calculations c=new calculations(x);
            System.out.println(c);
            line=br.readLine();
        }
        br.close();
    }

}
class calculations{
    float n;

    public calculations(float n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "Num: "+n+" Square: "+(n*n)+"\t"+"Cube: "+(n*n*n)+"";
    }
}
