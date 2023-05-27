package Assignment_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Q19 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=scan.next();
        System.out.print("Rotation to LEFT Steps: ");
        int n=scan.nextInt();
        //For rotation purpose
        ArrayList xLeft=new ArrayList<>();
        for (int i=0;i<s.length();i++){
            xLeft.add(s.charAt(i));
        }
        ArrayList xRight=new ArrayList();
        for (int i=0;i<s.length();i++){
            xRight.add(s.charAt(i));
        }
        for (int i=0;i<n;i++){
            char dummy= (char) xLeft.get(0);
            xLeft.remove(0);
            xLeft.add(dummy);
        }
        for (int i=0;i<n;i++){
            char dummy= (char) xRight.get(xRight.size()-1);
            xRight.remove(xRight.size()-1);
            xRight.add(0,dummy);
        }
        System.out.println(s);
        System.out.print("LeftShift: ");
        System.out.println(xLeft);
        System.out.print("RightShift: ");
        System.out.println(xRight);
    }
}
