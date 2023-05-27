/*
9. Write a program to ask name of person and display name character by character in each line.
 */
package Assignment_5;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name= scan.next();
        System.out.println("********************");
        for (int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }
    }
}
